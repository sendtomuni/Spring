package learn.luv2code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import learn.luv2code.dto.EmployeeDTO;
import learn.luv2code.service.IEmployeeService;
import learn.luv2code.utility.EmployeeUtilitymapper;
import lombok.NonNull;

@Controller
public class EmployeeController {

	@Autowired
	IEmployeeService service;

	public String registerEmployee(@NonNull EmployeeDTO empDto) {
		if (empDto != null) {
			try {
				return service.registerEmployee(EmployeeUtilitymapper.mapFromEmployeeDTO(empDto));
			} catch (Exception e) {
				System.err.println("Unable to update employee details");
				e.printStackTrace();
				return "Failed";
			}
		}
		return "Employee Details cannot be null";
	}
}
