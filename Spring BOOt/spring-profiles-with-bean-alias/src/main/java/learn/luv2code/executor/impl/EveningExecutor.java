package learn.luv2code.executor.impl;

import org.springframework.stereotype.Component;

import learn.luv2code.executor.Executor;

@Component("evening")
public class EveningExecutor implements Executor {
	public EveningExecutor() {
		System.out.println("EveningExecutor.EveningExecutor()");
	}

	@Override
	public void execute() {
		System.out.println("It's evening Executor");

	}

}
