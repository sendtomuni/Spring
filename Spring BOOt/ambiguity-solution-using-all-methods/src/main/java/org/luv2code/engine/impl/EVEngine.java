package org.luv2code.engine.impl;

import org.luv2code.engine.Engine;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "ev")
@Primary
public class EVEngine implements Engine {
	
	public EVEngine() {
		System.out.println("EVEngine.EVEngine()");
	}

	@Override
	public void start() {
		System.out.println("EVEngine.start()");
	}

	@Override
	public void stop() {
		System.out.println("EVEngine.stop()");
	}

}