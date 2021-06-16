package com.xworkz.sanitizer.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.sanitizer.sanitiser.Sanitizer;

public class SanitiserUtil {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sanitizer.xml");
		
		Sanitizer sanitizer = applicationContext.getBean(Sanitizer.class);
		System.out.println(sanitizer);
		
		ClassPathXmlApplicationContext path=(ClassPathXmlApplicationContext) applicationContext;
		path.close();
		
		
	}

}
