package com.kodnest.SecondSpring;

import org.springframework.stereotype.Component;

@Component
public class Student {
	int id = 12;
	String name = "Omkar";
	Address addr;
	
	public Student(Address addr) {
		super();
		this.addr = addr;
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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
}
