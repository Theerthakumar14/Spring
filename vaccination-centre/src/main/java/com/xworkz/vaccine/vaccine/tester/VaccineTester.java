package com.xworkz.vaccine.vaccine.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.vaccine.vaccine.VaccinationCentre;

public class VaccineTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("vaccination.xml");
		
		VaccinationCentre centre = context.getBean(VaccinationCentre.class);
		System.out.println(centre);
		
		ClassPathXmlApplicationContext path =(ClassPathXmlApplicationContext)context;
		path.close();

	}

}
