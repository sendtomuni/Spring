package learn.luv2code.executor.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import learn.luv2code.executor.Executor;

@Component
@Profile("morning")
public class MorningExecutor implements Executor {
	public MorningExecutor() {
		System.out.println("MorningExecutor.MorningExecutor()");
	}

	@Override
	public void execute() {
		System.out.println("It's Morning Executor");
	}

}
