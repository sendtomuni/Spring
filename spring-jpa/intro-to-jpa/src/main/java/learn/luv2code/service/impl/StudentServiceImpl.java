package learn.luv2code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.luv2code.dao.StudentRepo;
import learn.luv2code.dto.Student;
import learn.luv2code.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public String registerStudent(Student student) {
		System.out.println("Updating Student: " + student);
		student = studentRepo.save(student);
		System.out.println("Updated Student: " + student);
		return "Success";
	}

}
