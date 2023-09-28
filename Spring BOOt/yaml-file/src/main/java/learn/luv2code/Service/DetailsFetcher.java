package learn.luv2code.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.luv2code.models.Employee;

@Service
public class DetailsFetcher {

	@Autowired
	Employee employee;

	public DetailsFetcher() {
		System.out.println("DetailsFetcher.DetailsFetcher()");
	}

	public void fetchAndShowDetails() {
		System.out.println("DetailsFetcher.fetchAndShowDetails(1)");
		System.out.println(employee);
		System.out.println("DetailsFetcher.fetchAndShowDetails(2)");
	}
}
