package com.example.homeworkspringlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HomeWorkSpringLogApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HomeWorkSpringLogApplication.class, args);
		ClassForLog classForLog = context.getBean(ClassForLog.class);
		classForLog.writeSampleMessageInLog();
	}

}
