package com.kodnest.FirstSpring;

import org.springframework.stereotype.Component;

@Component
public class Student {
	int id = 1;
	String name = "Omkar";
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}