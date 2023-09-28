package learn.luv2code.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import learn.luv2code.dao.IEmployeeDAO;
import learn.luv2code.dao.Queries;
import learn.luv2code.model.EmployeeInfo;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

	@Autowired
	DataSource dataSource;

	@Override
	public int saveOrUpdate(EmployeeInfo info) throws SQLException {
		try {
			System.out.println(dataSource.getClass().getName());// com.zaxxer.hikari.HikariDataSourceHikariDataSource
			Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(Queries.EMPLOYEE_INSERT_DETAILS.toString());

			ps.setString(1, info.getEname());
			ps.setString(2, info.getDesg());
			ps.setDouble(3, info.getSalary());
			ps.setDouble(4, info.getGrossSalary());
			ps.setDouble(5, info.getNetSalary());

			return ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getCause());
			throw e;
		}

	}

}
