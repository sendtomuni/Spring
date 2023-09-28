package learn.luv2code.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeInfo {
	@Override
	public String toString() {
		return "EmployeeInfo [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", salary=" + salary
				+ ", grossSalary=" + grossSalary + ", netSalary=" + netSalary + "]";
	}

	private int eno;
	private String ename;
	private String desg;
	private double salary;
	private double grossSalary;
	private double netSalary;

}
