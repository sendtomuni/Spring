package learn.luv2code.runner;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

	/**
	 * {@summary Calls the Run method}
	 * 
	 * This run method calls internally by SpringApplication's run method. Hence
	 * {@link ApplicationRunner} is also there, so {@link ApplicationRunner}'s run
	 * method will execute prior to this
	 * 
	 * @param args {@link String}
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("==========================================");
		System.out.println("Command Line Runner");
		for (String arg : args) {
			System.out.println(arg);
		}
	}

}
