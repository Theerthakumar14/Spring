package com.xworkz.collection.student;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collection.xml");
		Student student = applicationContext.getBean(Student.class);
		List<String> name = student.getName();
		System.out.println("Accessing list");
		System.out.println(name.get(0));
		System.out.println(name.get(1));

		System.out.println("Accessing set");
		Set<Integer> age2 = student.getAge();
		Iterator<Integer> iterator = age2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			}
		
		System.out.println("Accessing map");
		Map<Integer, String> map = student.getMap();
		System.out.println(map.get(0));
		System.out.println(map.get(1));

		ClassPathXmlApplicationContext path = (ClassPathXmlApplicationContext) applicationContext;
		path.close();

	}

}
