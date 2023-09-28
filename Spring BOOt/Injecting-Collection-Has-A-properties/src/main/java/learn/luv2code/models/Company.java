package learn.luv2code.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Company {
	private Integer id;
	private String name;
	private String address;
	private Long size;

	public Company() {
		System.out.println("Company.Company()");
	}
}
