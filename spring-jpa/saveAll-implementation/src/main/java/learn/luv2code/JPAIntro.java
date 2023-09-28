package learn.luv2code;

import java.util.List;

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

		Doctor doctor1 = Doctor.builder().docName("adwait1").income(76001.0).specialization("neontalogist1").build();
		Doctor doctor2 = Doctor.builder().docName("adwait2").income(76002.0).specialization("neontalogist2").build();
		Doctor doctor3 = Doctor.builder().docName("adwait3").income(76003.0).specialization("neontalogist3").build();
		List<Doctor> doctors = List.of(doctor1, doctor2, doctor3);

		DoctorService doctorService = context.getBean(DoctorService.class);
		System.out.println(doctorService.registerDoctors(doctors));

		Student student1 = Student.builder().studentName("adwait1").grade(1).studentClass("LKG").build();
		Student student2 = Student.builder().studentName("adwait2").grade(2).studentClass("UKG").build();
		Student student3 = Student.builder().studentName("adwait3").grade(3).studentClass("1").build();
		Student student4 = Student.builder().studentName("adwait4").grade(4).studentClass("2").build();
		List<Student> students = List.of(student1, student2, student3, student4);

		StudentService studentService = context.getBean(StudentService.class);
		System.out.println(studentService.registerStudents(students));

	}

}
