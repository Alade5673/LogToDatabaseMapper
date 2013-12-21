package com.logger.rout.service.db.mysql;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logger.rout.service.db.DatabaseRecord;

@Component
public class MysqlLogrecordDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void save(List<DatabaseRecord> records) {
		System.out.println("Save " + records.size() + " records ...");
		Session session = sessionFactory.getCurrentSession();
		try {
			for (DatabaseRecord temp : records) {
				session.save(temp);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("End saveing " + records.size() + " records ...");

	}

}
