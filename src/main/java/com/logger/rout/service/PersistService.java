package com.logger.rout.service;

import java.util.List;

import com.logger.rout.service.db.DatabaseRecord;


public interface PersistService {
	public void save(List<DatabaseRecord> records);
}
