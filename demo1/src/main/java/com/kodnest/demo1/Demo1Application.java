package com.kodnest.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Demo1Application.class, args);
		Laptop laptop = (Laptop) ac.getBean(Laptop.class);
		laptop.build();
	}

}
