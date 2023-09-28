package org.luv2code.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {
	
	public GeneralConfiguration() {
		System.out.println("GeneralConfiguration.GeneralConfiguration()");
	}

	@Bean(name = "date")
	public LocalDate getCurrentDate() {
		System.out.println("GeneralConfiguration.getCurrentDate()");
		return LocalDate.now();
	}
}
