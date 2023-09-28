package learn.luv2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learn.luv2code.model.FamilyDetailsWithConfigurationProperty;
import learn.luv2code.model.FamilyDetailsWithValue;

@SpringBootApplication
public class UseOfValueAndConfigurationProperties {

	public static void main(String[] args) {
		System.out.println("UseOfValueAndConfigurationProperties.main(1)");
		ApplicationContext context = SpringApplication.run(UseOfValueAndConfigurationProperties.class, args);
		System.out.println("UseOfValueAndConfigurationProperties.main(2)");
		FamilyDetailsWithValue withValue = context.getBean(FamilyDetailsWithValue.class);
		System.out.println(withValue);
		FamilyDetailsWithConfigurationProperty withConfigurationProperty = context
				.getBean(FamilyDetailsWithConfigurationProperty.class);
		System.out.println(withConfigurationProperty);
	}

}
