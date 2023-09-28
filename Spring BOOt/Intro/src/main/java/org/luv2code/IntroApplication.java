package org.luv2code;

import org.luv2code.service.SessionFinderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IntroApplication {

	public static void main(String[] args) {
		System.out.println("IntroApplication.main()_1");
		ApplicationContext applicationContext = SpringApplication.run(IntroApplication.class, args);
		System.out.println("IntroApplication.main(_2)");
		SessionFinderService finderService = applicationContext.getBean(SessionFinderService.class);
		System.out.println("IntroApplication.main()_3");
		String seasonName = finderService.findSeason();
		System.out.println("Session Name: " + seasonName);
		((ConfigurableApplicationContext) applicationContext).close();
	}

}
