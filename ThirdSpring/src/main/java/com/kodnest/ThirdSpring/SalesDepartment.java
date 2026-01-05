package com.kodnest.ThirdSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SalesDepartment implements Department{

	@Override
	public void work() {
		System.out.println("Employee should work under sales department and meet the targets.");
	}

}
