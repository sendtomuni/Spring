package learn.luv2code.dao;

import java.sql.SQLException;

import learn.luv2code.model.EmployeeInfo;

public interface IEmployeeDAO {

	int saveOrUpdate(EmployeeInfo info) throws SQLException;
}
