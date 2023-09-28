package learn.luv2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learn.luv2code.controller.EmployeeController;
import learn.luv2code.dto.EmployeeDTO;

@SpringBootApplication
public class SampleDiEmployeeManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SampleDiEmployeeManagementApplication.class, args);

		EmployeeController controller = context.getBean(EmployeeController.class);
		EmployeeDTO edto = EmployeeDTO.builder().ename("Subarna").desg("junior").salary("80000.80").build();
		String reString = controller.registerEmployee(edto);
		System.out.println(reString);
	}

}
