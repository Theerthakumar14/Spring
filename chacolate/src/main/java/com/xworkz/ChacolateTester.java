package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChacolateTester {

	public static void main(String[] args) {
		System.out.println("main method");
		String configLocation = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(configLocation);
		Chacolate chacolate = container.getBean(Chacolate.class);

		System.out.println(chacolate);
		chacolate.taste();
		chacolate.stressReliever();
	}

}
