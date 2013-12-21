package com.logger.rout;

import org.apache.camel.Exchange;
import org.apache.camel.Predicate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyType;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.logger.rout.service.CsvToModelMapper;
import com.logger.rout.service.PersistService;

@Component
public class LogRoute extends RouteBuilder {
	private static final long BATCH_TIME_OUT = 3000L;

	private static final int MAX_RECORDS = 900;
	
	@Value("${log.file.input}")
	private String folderPath;
	
	@Value("${log.file.output}")
	private String folderPathout;
	
	@Autowired
	private CsvToModelMapper csvToModelConverter;
	
	@Autowired
	@Qualifier("mysqlPersistService")
	private PersistService persistService;

	@Override
	public void configure() throws Exception {
		from("file:" + folderPath)
		.log("Start processing ....")
		.multicast()
		.parallelProcessing()
		.to("direct:database-save", "direct:move-to-out")
		.end();

		from("direct:database-save")
				.log("Start saving to database ....")
				.split()
				.tokenize("\n")
				.streaming()
				.filter(simple("${body.length} > 30"))
				.unmarshal()
				.bindy(BindyType.Csv, CSVRecord.class)
				.bean(csvToModelConverter, "convertToMysqlModel")
				.aggregate(constant(true), batchAggregationStrategy())
				.completionPredicate(batchSizePredicate())
				.completionTimeout(BATCH_TIME_OUT)
				.bean(persistService)
				.log("End saving to database ....")
				.end();

		from("direct:move-to-out")
				.setHeader(Exchange.FILE_NAME,
						simple("${file:name.noext}-${date:now:yyyyMMddHHmmssSSS}.${file:ext}"))
				.to("file:" + folderPathout)
				.end();

	}

	@Bean
	private AggregationStrategy batchAggregationStrategy() {
		return new ArrayListAggregationStrategy();
	}

	@Bean
	public Predicate batchSizePredicate() {
		return new BatchSizePredicate(MAX_RECORDS);
	}

}
