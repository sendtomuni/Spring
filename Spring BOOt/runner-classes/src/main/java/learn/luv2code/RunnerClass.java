package learn.luv2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class
 * 
 * @see SpringApplication
 * @see <a href=
 *      "https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html">
 *      SpringBootApplication </a>
 */
@SpringBootApplication
public class RunnerClass {

	/**
	 * Makes a call to {@link org.springframework.boot.SpringApplication} run method
	 * 
	 * @param args {@link String[]}
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html">SpringApplication</a>
	 */
	public static void main(String[] args) {
		SpringApplication.run(RunnerClass.class, args);

	}

}
