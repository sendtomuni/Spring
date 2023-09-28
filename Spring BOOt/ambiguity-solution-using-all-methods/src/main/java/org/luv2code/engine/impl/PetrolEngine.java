package org.luv2code.engine.impl;

import org.luv2code.engine.Engine;
import org.springframework.stereotype.Component;

@Component(value = "petrol")
public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");		
	}

}
