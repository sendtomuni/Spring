package learn.luv2code.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Application Runner
 * 
 * @see <a href=
 *      "https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/ApplicationRunner.html">ApplicationRunner</a>
 */
@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

	/**
	 * {@summary Calls the Run method}
	 * 
	 * This run method calls internally by SpringApplication's run method.
	 * 
	 * @param args {@link ApplicationArguments}
	 * @see <a href=
	 *      "https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/ApplicationArguments.html">ApplicationArguments</a>
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Non-option args: " + args.getNonOptionArgs());
		System.out.println("OPtion-args");
		for (String name : args.getOptionNames()) {
			System.out.println(name + "----->" + args.getOptionValues(name));
		}
	}

}
