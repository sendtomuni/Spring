package learn.luv2code.utility;

import learn.luv2code.dto.EmployeeDTO;
import learn.luv2code.model.EmployeeInfo;

public class EmployeeUtilitymapper {

	public static EmployeeInfo mapFromEmployeeDTO(EmployeeDTO edto) {
		return EmployeeInfo.builder().ename(edto.getEname()).desg(edto.getDesg())
				.salary(Double.parseDouble(edto.getSalary())).build();
	}

}
