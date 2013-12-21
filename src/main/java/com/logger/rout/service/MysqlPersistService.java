package com.logger.rout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.logger.rout.service.db.DatabaseRecord;
import com.logger.rout.service.db.mysql.MysqlLogrecordDAO;

@Transactional
@Service("mysqlPersistService")
public class MysqlPersistService implements PersistService {

	@Autowired
	MysqlLogrecordDAO mysqlLogrecordDAO;

	public void save(List<DatabaseRecord> records) {
		mysqlLogrecordDAO.save(records);
	}
}