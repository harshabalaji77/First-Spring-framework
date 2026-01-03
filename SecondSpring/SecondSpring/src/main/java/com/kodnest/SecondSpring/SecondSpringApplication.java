package com.kodnest.SecondSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondSpringApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SecondSpringApplication.class, args);
		Student ref = ac.getBean(Student.class);
		System.out.println(ref);
	}

}
