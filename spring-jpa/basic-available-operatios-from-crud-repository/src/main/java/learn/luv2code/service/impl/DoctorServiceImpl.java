package learn.luv2code.service.impl;

import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import learn.luv2code.dao.DoctorRepo;
import learn.luv2code.dto.Doctor;
import learn.luv2code.service.DoctorService;

/**
 * To deal with all services for doctor CRUD operation
 * 
 */
@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepo doctorRepo;

	/**
	 * {@summary Insert or update a doctor.} </br>
	 * 
	 * 
	 * @param doctor {@link Doctor}
	 * @return {@link String} result
	 */
	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("Updating Doctor: " + doctor);
		doctor = doctorRepo.save(doctor);
		System.out.println("Updated Doctor: " + doctor);
		return "Success";
	}

	/**
	 * {@summary Insert or update list of doctors.}</br>
	 * 
	 * 
	 * @param doctors {@link List<Doctor>}
	 * @return {@link List<String>} result
	 */
	@Override
	public List<String> registerDoctors(List<Doctor> doctors) {
		System.out.println("Updating Doctors list: ");
		doctors.forEach(System.out::println);
		doctors = (List<Doctor>) doctorRepo.saveAll(doctors);
		System.out.println("Updated DOctors List: ");
		doctors.forEach(System.out::println);
		return doctors.stream().map(Doctor::getDocName).toList();
	}

	/**
	 * {@summary Fetch a doctor with his/her ID}</br>
	 * 
	 * 
	 * @param id {@link Integer}
	 * @return {@link Doctor} result
	 * @throws HibernateException
	 */
	@Override
	public Doctor getDoctorByDoctorId(int id) {
		System.out.println("Fetch Doctor details with id: " + id);
		Optional<Doctor> fetchedDoctor = doctorRepo.findById(id);
		System.out.println(fetchedDoctor.isPresent() ? "Dcotr Details with id: " + id + " is: " + fetchedDoctor.get()
				: "Dcotr Details with id: " + id + " is: ");
		return fetchedDoctor.orElse(null);
	}

	/**
	 * {@summary get All Doctors of a hospital} </br>
	 * 
	 * 
	 * @return {@link List<Doctor>} fetchedDoctors
	 */
	@Override
	public List<Doctor> getAllDoctorsInTheHospital() {
		System.out.println("Fetch all Doctors of the hospital: ");
		List<Doctor> fetchedDoctors = (List<Doctor>) doctorRepo.findAll();
		System.out.println("Doctors in the hospitals are: ");
		fetchedDoctors.forEach(System.out::println);
		return fetchedDoctors;
	}

	/**
	 * {@summary get All Doctors of a hospital with ids} </br>
	 * 
	 * @param ids {@link List<Integer>}
	 * @return {@link List<Doctor>} fetchedDoctors
	 */
	@Override
	public List<Doctor> getDoctorsByGivenIds(List<Integer> ids) {
		System.out.println("Fetch Doctors with ids: ");
		ids.forEach(System.out::println);
		List<Doctor> fetchedDoctors = (List<Doctor>) doctorRepo.findAllById(ids);
		System.out.println("Doctors with ids: " + ids + " are: ");
		fetchedDoctors.forEach(System.out::println);
		return fetchedDoctors;
	}

	/**
	 * {@summary Delete a doctor} </br>
	 * 
	 * This can throw EmptyResultDataAccessException if given doctor entity not
	 * found in the system
	 * 
	 * @param doctor {@link Doctor}
	 * @throws EmptyResultDataAccessException if given doctor entity not found in
	 *                                        the system
	 * @see <a href=
	 *      "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/dao/EmptyResultDataAccessException.html">EmptyResultDataAccessException</a>
	 */
	@Override
	public void deleteDoctor(Doctor doctor) {
		System.out.println("Delete this doctor: " + doctor);
		doctorRepo.delete(doctor);
	}

	/**
	 * {@summary Delete a doctor by his/her id} </br>
	 * 
	 * This can throw <a href=
	 * "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/dao/EmptyResultDataAccessException.html">EmptyResultDataAccessException</a>
	 * if there is no doctor record found with given id
	 * 
	 * @param doctorId {@link Integer}
	 * @throws EmptyResultDataAccessException if doctor not found with given id
	 */
	@Override
	public void deleteDoctorById(int doctorId) {
		System.out.println("Delete this doctor with id: " + doctorId);
		doctorRepo.deleteById(doctorId);
	}

	/**
	 * {@summary Delete All doctors in a hospital} </br>
	 * 
	 */
	@Override
	public void closeHospital() {
		System.out.println("Delete All Doctor record from Hospital");
		doctorRepo.deleteAll();
	}

	/**
	 * {@summary Delete All doctors by given Ids.} </br>
	 * 
	 * This can throw <a href=
	 * "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/dao/EmptyResultDataAccessException.html">EmptyResultDataAccessException</a>
	 * if there is no doctor record found with any of the given ID.
	 * 
	 * @param ids {@link List<Integer>}
	 * @throws EmptyResultDataAccessException When record not found with any of the
	 *                                        id.
	 */
	@Override
	public void deleteDoctorsByIds(List<Integer> ids) {
		System.out.println("Delete Doctors having ids:");
		ids.forEach(System.out::println);
		doctorRepo.deleteAllById(ids);
	}

}
