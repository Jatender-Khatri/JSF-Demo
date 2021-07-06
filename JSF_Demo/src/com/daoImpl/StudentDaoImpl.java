package com.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.dao.StudentDao;
import com.model.StudentEntitiy;

public class StudentDaoImpl implements StudentDao{

	@Override
	public Integer addStudnet(StudentEntitiy student) {
		Integer roll = null;
		try {
			SessionFactory factory = com.DBManager.DBConnection.getFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			session.save(student);
			transaction.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

}
