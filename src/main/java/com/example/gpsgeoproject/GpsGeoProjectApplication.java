package com.example.gpsgeoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GpsGeoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpsGeoProjectApplication.class, args);
	}

}
