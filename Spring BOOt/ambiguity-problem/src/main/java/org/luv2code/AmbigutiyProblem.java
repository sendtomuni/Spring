package org.luv2code;

import org.luv2code.Vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AmbigutiyProblem {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AmbigutiyProblem.class, args);
		System.out.println("AmbigutiyProblem.main(1)");
		Vehicle vehicle = context.getBean(Vehicle.class);
		System.out.println("AmbigutiyProblem.main(2)");
		vehicle.startYourJourney();
		System.out.println("AmbigutiyProblem.main(3)");
	}

}
