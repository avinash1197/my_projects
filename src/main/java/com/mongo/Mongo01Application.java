package com.mongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mongo01Application {
	
	static Logger log = LoggerFactory.getLogger(Mongo01Application.class);

	public static void main(String[] args) {
		log.info("Mongo Db App Executed");
		SpringApplication.run(Mongo01Application.class, args);
	}

}
