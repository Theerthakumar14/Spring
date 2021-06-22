package com.xworkz.railway.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.railway.dao.RailwayDAOImpl;
import com.xworkz.railway.dto.RailwayDTO;

public class RailwayTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		RailwayDAOImpl daoImpl = context.getBean(RailwayDAOImpl.class);

		RailwayDTO railwayDTO = new RailwayDTO("KSR", 12, 9, 50);
		daoImpl.saveRailwayDetails(railwayDTO);
		System.out.println("------------------  " + railwayDTO);

		ClassPathXmlApplicationContext path = (ClassPathXmlApplicationContext) context;
		path.close();
	}

}
