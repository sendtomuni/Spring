package learn.luv2code.decider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import learn.luv2code.executor.Executor;

@Component
public class Decider {

	@Autowired
	private Executor executor;

	public Decider() {
		System.out.println("Decider.Decider()");
	}

	public void executeSession() {
		System.out.println("Decider.executeSession(1)");
		executor.execute();
		System.out.println("Decider.executeSession(2)");
	}
}
