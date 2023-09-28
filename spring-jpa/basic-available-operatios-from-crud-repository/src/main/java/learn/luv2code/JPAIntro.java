package learn.luv2code;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import learn.luv2code.dto.Doctor;
import learn.luv2code.service.DoctorService;

/**
 * 
 * {@summary Entry point for all operations}
 * 
 * it can be considered as the entry point, so all the services can be executed
 * 
 * @see <a href=
 *      "https://docs.spring.io/spring-data/jpa/docs/current/api/index.html">SpringBootApplication</a>
 */
@SpringBootApplication
public class JPAIntro {

	/**
	 * Entry or start point to execution.
	 * 
	 * @param args- Runtime inputs {@link String[]}
	 */
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JPAIntro.class, args);

		Doctor doctor_0 = Doctor.builder().docName("adwait").income(76000.0).specialization("neontalogist").build();
		Doctor doctor_10 = Doctor.builder().docName("adwait10").income(76010.0).specialization("neontalogist10")
				.build();
		Doctor doctor_20 = Doctor.builder().docName("adwait20").income(76020.0).specialization("neontalogist20")
				.build();
		Doctor doctor_30 = Doctor.builder().docName("adwait30").income(76030.0).specialization("neontalogist30")
				.build();
		Doctor doctor_40 = Doctor.builder().docName("adwait40").income(76040.0).specialization("neontalogist50")
				.build();
		List<Doctor> doctors = List.of(doctor_10, doctor_20, doctor_30, doctor_40);

		DoctorService doctorService = context.getBean(DoctorService.class);

		System.out.println("Register a doctor: " + doctor_0);
		String registeredDoctor = doctorService.registerDoctor(doctor_0);
		System.out.println(registeredDoctor);
		System.out.println("====================================================================");
		sleep(5);

		System.out.println("Register doctors: " + doctors);
		List<String> registeredDoctors = doctorService.registerDoctors(doctors);
		registeredDoctors.forEach(System.out::println);
		System.out.println("====================================================================");
		sleep(5);

		System.out.println("Find all doctor: ");
		List<Doctor> getAllDoctors = doctorService.getAllDoctorsInTheHospital();
		getAllDoctors.forEach(System.out::println);
		System.out.println("====================================================================");
		sleep(5);

		System.out.println("find a doctor by id: " + getAllDoctors.stream().findFirst().get().getDocId());
		Doctor getDoctorById = doctorService.getDoctorByDoctorId(getAllDoctors.stream().findFirst().get().getDocId());
		System.out.println(getDoctorById);
		System.out.println("====================================================================");
		sleep(5);

		System.out.println("find doctors by ids: " + doctors.stream().map(Doctor::getDocId).toList());
		List<Doctor> getDoctorsByGivenIds = doctorService
				.getDoctorsByGivenIds(doctors.stream().map(Doctor::getDocId).toList());
		getDoctorsByGivenIds.forEach(System.out::println);
		System.out.println("====================================================================");
		sleep(5);

		System.out.println("delete doctors: " + getDoctorsByGivenIds.stream().findFirst().get());
		doctorService.deleteDoctor(getDoctorsByGivenIds.stream().findFirst().get());
		System.out.println("Doctor deleted, lets find it with id: "
				+ getDoctorsByGivenIds.stream().findFirst().get().getDocId() + " again aand expect no record");
		Doctor deletedDoctor = doctorService
				.getDoctorByDoctorId(getDoctorsByGivenIds.stream().findFirst().get().getDocId());
		System.out.println(deletedDoctor);
		System.out.println("====================================================================");
		sleep(5);

		int deletedById = getDoctorsByGivenIds.get(1).getDocId();
		System.out.println("delete doctor by Id: " + deletedById);
		doctorService.deleteDoctorById(deletedById);
		System.out.println("Doctor deleted, lets find it with id: " + deletedById + " again aand expect no record");
		Doctor deletedDoctorById = doctorService.getDoctorByDoctorId(deletedById);
		System.out.println(deletedDoctorById);
		System.out.println("====================================================================");
		sleep(5);

		List<Integer> ids = doctorService.getAllDoctorsInTheHospital().stream().map(Doctor::getDocId).toList();
		System.out.println("delete doctor by Id: " + ids);
		doctorService.deleteDoctorsByIds(ids);
		System.out.println("====================================================================");
		sleep(5);

		List<Doctor> getAllDoctorsBeforeDelete = doctorService.getAllDoctorsInTheHospital();
		System.out.println("All doctors in the hospital before delete: " + getAllDoctorsBeforeDelete);
		System.out.println("Lets clear the doctors");
		doctorService.closeHospital();
		System.out.println("All Doctors list cleared. Lets check by program");
		List<Doctor> getAllDoctorsAfterDelete = doctorService.getAllDoctorsInTheHospital();
		System.out.println("All doctors in the hospital before delete: " + getAllDoctorsAfterDelete);
		sleep(30);

		doctorService.registerDoctors(getAllDoctorsBeforeDelete);
	}

	/**
	 * This is an abstraction to sleep method from {@link Thread} class. Unlike
	 * {@link Thread} class's sleep method, this gives unchecked Exception.
	 * 
	 * @param time {@link Long} second to sleep
	 */
	public static void sleep(long time) {
		System.out.println("Sleep 30 second beofre next operations");
		try {
			Thread.sleep(time * 1000);
		} catch (Exception e) {
			System.err.println("I know this exception");
		}
	}

}
