package com.kodnest.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Demo2Application.class, args);
		Laptop laptop = (Laptop) ac.getBean("laptop");
		laptop.build();
	}

}
