package com.xworkz.supermarket.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.supermarket.market.Supermarket;

public class SuperMarketutil {

	public static void main(String[] args) {
		String configLocation="supermarket.xml";
		ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(configLocation);
		
		Supermarket supermarket = xmlApplicationContext.getBean(Supermarket.class);
		System.out.println(supermarket);
		
		ClassPathXmlApplicationContext path =(ClassPathXmlApplicationContext) xmlApplicationContext;
		path.close();

	}

}
