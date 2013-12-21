package com.logger.rout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.logger.rout.service.db.DatabaseRecord;

@Component("mongoPersistService")
public class MongoPersistService implements PersistService {

	@Autowired
	MongoOperations mongoOperation;

	@Override
	public void save(List<DatabaseRecord> records) {
		for (DatabaseRecord temp : records) {
			mongoOperation.save(temp);
		}
	}
}