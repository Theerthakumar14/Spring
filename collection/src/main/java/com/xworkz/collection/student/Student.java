package com.xworkz.collection.student;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private List<String> name;
	private Set<Integer> age;
	private Map<Integer, String> map;

	

	public Student(List<String> name, Set<Integer> age, Map<Integer, String> map) {
		super();
		this.name = name;
		this.age = age;
		this.map = map;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	public Set<Integer> getAge() {
		return age;
	}

	public void setAge(Set<Integer> age) {
		this.age = age;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", map=" + map + "]";
	}

}
