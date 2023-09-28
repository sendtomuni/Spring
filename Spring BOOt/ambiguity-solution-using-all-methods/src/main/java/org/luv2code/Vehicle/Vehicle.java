package org.luv2code.Vehicle;

import org.luv2code.engine.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "vehicle")
public class Vehicle {
	
	@Autowired
	@Qualifier("diesel")
	Engine petrol;
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle()");
	}
	
	public void startYourJourney() {
		System.out.println("Vehicle.startYourJourney()");
		petrol.start();
		petrol.stop();
		System.out.println("Vehicle.endYourJourney()");
	}

}
