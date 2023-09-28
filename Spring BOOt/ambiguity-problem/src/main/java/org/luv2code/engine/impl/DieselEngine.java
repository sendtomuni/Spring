package org.luv2code.engine.impl;

import org.luv2code.engine.Engine;
import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {
	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}

	@Override
	public void start() {
		System.out.println("DieselEngine.start()");		
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stop()");
	}

}
