package com.logger.rout.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.logger.rout.CSVRecord;
import com.logger.rout.service.db.mongodb.MongoDatabaseRecord;
import com.logger.rout.service.db.mysql.MysqlDatabaseRecord;


@Component
public class CsvToModelMapper {

	private static final String YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-mm-dd hh:mm:ss.SSS";
	DateFormat dateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS_SSS);

	public MysqlDatabaseRecord convertToMysqlModel(CSVRecord csv) {
		MysqlDatabaseRecord databaseRec = new MysqlDatabaseRecord();
		databaseRec.setServerOrClient(csv.getServerOrClient());
		databaseRec.setTimestampVal(fromString(csv.getTimestamp()));
		databaseRec.setWebContainerOrThreadName(csv.getWebContainerOrThreadName());
		databaseRec.setUserID(csv.getUserID());
		databaseRec.setBrowserName(csv.getBrowserName());
		databaseRec.setBrowserVersion(csv.getBrowserVersion());
		databaseRec.setRequestURL(csv.getRequestURL());
		databaseRec.setUserAction(csv.getUserAction());
		databaseRec.setCurrentTabForClientOnly(csv.getCurrentTabForClientOnly());
		databaseRec.setEditMode(csv.getEditMode());
		databaseRec.setMetricClass(csv.getMetricClass());
		databaseRec.setPolicyId(csv.getPolicyId());
		databaseRec.setPolicyNumber(csv.getPolicyNumber());
		databaseRec.setSessionId(csv.getSessionId());
		databaseRec.setElapsedTimeServerOnly(csv.getElapsedTimeServerOnly());
		databaseRec.setSubmitTime(csv.getSubmitTime());
		databaseRec.setLoadTime(csv.getLoadTime());
		databaseRec.setReadyTime(csv.getReadyTime());
		databaseRec.setTotalTime(csv.getTotalTime());
		return databaseRec;
	}
	
	
	public MongoDatabaseRecord convertToMongoModel(CSVRecord csv) {
		MongoDatabaseRecord databaseRec = new MongoDatabaseRecord();
		databaseRec.setServerOrClient(csv.getServerOrClient());
		databaseRec.setTimestampVal(fromString(csv.getTimestamp()));
		databaseRec.setWebContainerOrThreadName(csv.getWebContainerOrThreadName());
		databaseRec.setUserID(csv.getUserID());
		databaseRec.setBrowserName(csv.getBrowserName());
		databaseRec.setBrowserVersion(csv.getBrowserVersion());
		databaseRec.setRequestURL(csv.getRequestURL());
		databaseRec.setUserAction(csv.getUserAction());
		databaseRec.setCurrentTabForClientOnly(csv.getCurrentTabForClientOnly());
		databaseRec.setEditMode(csv.getEditMode());
		databaseRec.setMetricClass(csv.getMetricClass());
		databaseRec.setPolicyId(csv.getPolicyId());
		databaseRec.setPolicyNumber(csv.getPolicyNumber());
		databaseRec.setSessionId(csv.getSessionId());
		databaseRec.setElapsedTimeServerOnly(csv.getElapsedTimeServerOnly());
		databaseRec.setSubmitTime(csv.getSubmitTime());
		databaseRec.setLoadTime(csv.getLoadTime());
		databaseRec.setReadyTime(csv.getReadyTime());
		databaseRec.setTotalTime(csv.getTotalTime());
		return databaseRec;
	}

	private Date fromString(String dateString) {
		Date date = null;
		if (!StringUtils.isEmpty(dateString)) {
			try {
				date = dateFormat.parse(dateString);
			} catch (ParseException e) {
				date = null;
			}
		}
		return date;
	}
}
