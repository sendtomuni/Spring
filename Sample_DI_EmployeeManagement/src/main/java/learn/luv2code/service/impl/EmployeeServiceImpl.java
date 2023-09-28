package learn.luv2code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.luv2code.dao.IEmployeeDAO;
import learn.luv2code.model.EmployeeInfo;
import learn.luv2code.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDAO employeeDAO;

	@Override
	public String registerEmployee(EmployeeInfo employeeInfo) throws Exception {
		employeeInfo.setGrossSalary(employeeInfo.getSalary() * 1.04f);
		employeeInfo.setNetSalary(employeeInfo.getSalary() * 1.02f);

		int resultCount = employeeDAO.saveOrUpdate(employeeInfo);
		return resultCount > 0 ? "Employee details updated Successfully" : "Employee details failed to update";
	}

}
