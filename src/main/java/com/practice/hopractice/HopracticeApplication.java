package com.practice.hopractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class HopracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HopracticeApplication.class, args);
	}

}
