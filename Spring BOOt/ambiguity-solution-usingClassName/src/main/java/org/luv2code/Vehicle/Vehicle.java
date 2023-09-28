package org.luv2code.Vehicle;

import org.luv2code.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "vehicle")
public class Vehicle {
	
	@Autowired
	Engine petrolEngine;
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}
	
	public void startYourJourney() {
		System.out.println("Vehicle.startYourJourney()");
		petrolEngine.start();
		petrolEngine.stop();
		System.out.println("Vehicle.endYourJourney()");
	}

}
