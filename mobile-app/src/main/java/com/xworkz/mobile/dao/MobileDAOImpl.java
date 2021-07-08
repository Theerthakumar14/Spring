package com.xworkz.mobile.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.entity.MobileEntity;
@Component
public class MobileDAOImpl implements MobileDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean saveMobileDetails(MobileEntity mobileEntity) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(mobileEntity);
			transaction.commit();
			return true;
		} catch (Exception e) {
			//e.printStackTrace();
			transaction.rollback();
			return false;

		} finally {
			if (session != null) {
				session.close();
				System.out.println("session closed");
			} else {
				System.out.println("session not closed");
			}
		}

	}

}
