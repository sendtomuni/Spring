package learn.luv2code.service;

import java.util.List;

import learn.luv2code.dto.Student;

public interface StudentService {
	String registerStudent(Student student);

	List<String> registerStudents(List<Student> students);
}
