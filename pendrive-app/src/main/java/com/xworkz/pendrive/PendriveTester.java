package com.xworkz.pendrive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PendriveTester {
	public static void main(String[] args) {
		System.out.println("ïnside main method");
//	String configLocation="applicationContent.xml";
		ApplicationContext applica = new ClassPathXmlApplicationContext("applicationContent.xml");
		
		
		
		Pendrive pendrive = applica.getBean(Pendrive.class);
		System.out.println(pendrive);
	}

}
