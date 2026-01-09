package com.kodnest.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	private OS os;
	
	@Autowired
	public void setOs(OS os) {
		this.os = os;
	}
	
	public void build() {
		System.out.println("BUILDING THE 1st APP");
		os.operating();
	}
}
