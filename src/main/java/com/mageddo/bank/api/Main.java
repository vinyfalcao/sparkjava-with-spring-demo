package com.mageddo.bank.api;

import com.mageddo.bank.api.config.SparkConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAutoConfiguration(exclude = SparkConfiguration.class)
@Import(SparkConfiguration.class)
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
