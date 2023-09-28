package learn.luv2code.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import learn.luv2code.dto.Doctor;
import learn.luv2code.enums.DoctorsProperty;
import learn.luv2code.service.DoctorService;

/**
 * Runner class to inititate the execution.
 * 
 * @see <a href=
 *      "https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/ApplicationRunner.html">ApplicationRunner</a>
 */
@Component
public class PagingAndSortingRunner implements ApplicationRunner {

	@Autowired
	DoctorService doctorService;

	/**
	 * Runner class given run method
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Starting fetch operation");
		System.out.println("============================================================");
		Page<Doctor> doctors_all = doctorService.fetchAllDoctors();
		System.out.println("Page Number: " + doctors_all.getNumber());
		System.out.println("Page Count: " + doctors_all.getTotalPages());
		System.out.println("Page Size: " + doctors_all.getSize());
		System.out.println("Page Element Count: " + doctors_all.getNumberOfElements());
		doctors_all.forEach(System.out::println);
		System.out.println("============================================================");
		Page<Doctor> doctors_name = doctorService.fetchAllDoctorsSortedBy(DoctorsProperty.NAME);
		System.out.println("Page Number: " + doctors_name.getNumber());
		System.out.println("Page Count: " + doctors_name.getTotalPages());
		System.out.println("Page Size: " + doctors_name.getSize());
		System.out.println("Page Element Count: " + doctors_name.getNumberOfElements());
		doctors_name.forEach(System.out::println);
		System.out.println("============================================================");
		Page<Doctor> doctors_id = doctorService.fetchAllDoctorsSortedByWithpageSize(DoctorsProperty.ID, 10, 1);
		System.out.println("Page Number: " + doctors_id.getNumber());
		System.out.println("Page Count: " + doctors_id.getTotalPages());
		System.out.println("Page Size: " + doctors_id.getSize());
		System.out.println("Page Element Count: " + doctors_id.getNumberOfElements());
		doctors_id.forEach(System.out::println);
		System.out.println("============================================================");
		Page<Doctor> doctors_specialisation = doctorService
				.fetchAllDoctorsSortedByWithpageSize(DoctorsProperty.SPECIALISATION, 10, 0);
		System.out.println("Page Number: " + doctors_specialisation.getNumber());
		System.out.println("Page Count: " + doctors_specialisation.getTotalPages());
		System.out.println("Page Size: " + doctors_specialisation.getSize());
		System.out.println("Page Element Count: " + doctors_specialisation.getNumberOfElements());
		doctors_specialisation.forEach(System.out::println);
		System.out.println("============================================================");

	}

}
