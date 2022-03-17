package com.boot.bansis.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@SpringBootApplication
@EnableReactiveMongoAuditing
public class BansisClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BansisClientApplication.class, args);
	}

}
