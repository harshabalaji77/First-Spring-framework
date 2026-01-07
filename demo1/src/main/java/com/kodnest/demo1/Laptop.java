package com.kodnest.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private OS os;
	
	@Autowired
	public Laptop(OS os) {
		this.os = os;
	}
	
	public void build() {
		System.out.println("BUILDING THE 1st APP");
		os.operating();
	}
}
