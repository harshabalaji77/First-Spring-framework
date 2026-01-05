package com.kodnest.ThirdSpring;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id = 1;
	String name = "Omkar";
	Department dept;
	
	void work() {
		dept.work();
	}

	public Employee(Department dept) {
		super();
		this.dept = dept;
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
	
}
