package learn.luv2code.models;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@ConfigurationProperties(prefix = "emp")
@Component
public class Employee {
	// Primitive Types
	private Integer eno;
	private String ename;

	// Array Types
	private String[] favColors;

	// Collection Types
	private List<String> nickNames;
	private Set<Long> phoneNumbers;
	private Map<String, String> details;

	// Has-A Types
	private Company company;

	public Employee() {
		System.out.println("Employee.Employee()");
	}
}
