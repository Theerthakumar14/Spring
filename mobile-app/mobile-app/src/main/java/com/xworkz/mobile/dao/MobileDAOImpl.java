package com.xworkz.mobile.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.custom.MobileNotFoundException;
import com.xworkz.mobile.entity.MobileEntity;

@Component
public class MobileDAOImpl implements MobileDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean saveMobileDetails(MobileEntity mobileEntity) {
		System.out.println("Inside saveMobileDetails ");
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(mobileEntity);
			transaction.commit();
			System.out.println("data saved to database");
			return true;
		} catch (Exception e) {
			// e.printStackTrace();
			transaction.rollback();
			System.out.println("data not saved transaction rollback");
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

	public MobileEntity getMobileEntityByName(String name) {
		System.out.println("invoked getMobileInfo");
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query createQuery = session.createNamedQuery("mobileEntityByName");
			createQuery.setParameter("mName", name);
			List<MobileEntity> list = createQuery.list();
			System.out.println(list.toString());
			if (list.isEmpty()) {
				throw new MobileNotFoundException(name + " is not found");
			} else {
				return list.get(0);
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session closed");
			} else {
				System.out.println("session not closed");
			}
		}
		return null;
	}

	public List<MobileEntity> getMobileDetails() {
		System.out.println("invoked mobilelist");
		Session session = null;

		try {
			session = sessionFactory.openSession();
			Query query = session.createNamedQuery("getMobileDetails");
			List<MobileEntity> list = query.list();
			//System.out.println(list);
			return list;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session closed");
			} else {
				System.out.println("session not closed");
			}
		}
		return null;
	}

}
