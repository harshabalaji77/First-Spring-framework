package com.kodnest.ThirdSpring;

import org.springframework.stereotype.Component;

@Component
public class ITDepartment implements Department {

	@Override
	public void work() {
		System.out.println("Employee should work under IT deparment and build projects.");
	}
}
