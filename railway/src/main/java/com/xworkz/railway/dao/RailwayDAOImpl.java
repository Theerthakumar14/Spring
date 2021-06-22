package com.xworkz.railway.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.railway.dto.RailwayDTO;

public class RailwayDAOImpl implements RailwayDAO {

	private SessionFactory sessionFactory;

	public RailwayDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveRailwayDetails(RailwayDTO dto) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.getTransaction().begin();
			session.save(dto);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (session != null) {
				System.out.println("session closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

}
