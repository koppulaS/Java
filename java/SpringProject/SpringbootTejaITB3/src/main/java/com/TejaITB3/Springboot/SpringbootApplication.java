package com.TejaITB3.Springboot;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringbootApplication {
	
	public static final org.apache.logging.log4j.Logger logger=LogManager.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("main method 1");
		System.out.println("main method 2");
		System.out.println("main method 3");
		   
		logger.info("info method");
		logger.warn("warn method");
		logger.error("error method");
		logger.debug("Debug method");
	}

}
 