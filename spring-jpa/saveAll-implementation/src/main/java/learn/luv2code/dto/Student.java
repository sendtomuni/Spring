package learn.luv2code.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "JPA_STUDENT_INFO")
@Data
@Builder
public class Student {
	@Column(name = "STUDENT_ID")
	@Id
	@GeneratedValue(generator = "STUDENT_ID_SEQUENCE")
	@SequenceGenerator(name = "STUDENT_ID_SEQUENCE", sequenceName = "STUDENT_ID_SEQUENCE", initialValue = 1, allocationSize = 1)
	private Integer studentId;
	@Column(name = "STUDENT_NAME", length = 25)
	private String studentName;
	@Column(name = "CLASS", length = 25)
	private String studentClass;
	@Column(name = "GRADE")
	private int grade;
}
