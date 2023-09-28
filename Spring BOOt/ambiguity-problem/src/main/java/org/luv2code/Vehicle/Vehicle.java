package org.luv2code.Vehicle;

import org.luv2code.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	@Autowired
	Engine engine;
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}
	
	public void startYourJourney() {
		System.out.println("Vehicle.startYourJourney()");
		engine.start();
		engine.stop();
		System.out.println("Vehicle.endYourJourney()");
	}

}
