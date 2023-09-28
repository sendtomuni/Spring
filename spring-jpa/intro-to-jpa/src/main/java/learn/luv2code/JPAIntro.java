package learn.luv2code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learn.luv2code.dto.Doctor;
import learn.luv2code.dto.Student;
import learn.luv2code.service.DoctorService;
import learn.luv2code.service.StudentService;

@SpringBootApplication
public class JPAIntro {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JPAIntro.class, args);

		Doctor doctor = Doctor.builder().docName("adwait").income(76000.0).specialization("neontalogist").build();

		DoctorService doctorService = context.getBean(DoctorService.class);
		doctorService.registerDoctor(doctor);

		Student student = Student.builder().studentName("adwait").grade(2).studentClass("LKG").build();

		StudentService studentService = context.getBean(StudentService.class);
		studentService.registerStudent(student);

	}

}
