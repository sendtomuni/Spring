package learn.luv2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import learn.luv2code.decider.Decider;

@SpringBootApplication
@ImportResource("application-context.xml")
public class SpringProfilesWithBeanAliasTest {
	public static void main(String[] args) {
		System.out.println("SpringProfilesTest.main(1)");
		ApplicationContext context = SpringApplication.run(SpringProfilesWithBeanAliasTest.class, args);
		System.out.println(context.getEnvironment());
		System.out.println(context.getEnvironment().getActiveProfiles());
		System.out.println("SpringProfilesTest.main(2)");
		Decider decider = context.getBean(Decider.class);
		System.out.println("SpringProfilesTest.main(3)");
		decider.executeSession();
		System.out.println("SpringProfilesTest.main(4)");
	}
}
