package learn.luv2code.service;

import java.util.List;

import learn.luv2code.dto.Doctor;

/**
 * {@summary Interface for generic CRUD operations on a doctor type.}
 * 
 * @author Subarna
 */
public interface DoctorService {

	String registerDoctor(Doctor doctor);

	List<String> registerDoctors(List<Doctor> doctors);

	Doctor getDoctorByDoctorId(int id);

	List<Doctor> getAllDoctorsInTheHospital();

	List<Doctor> getDoctorsByGivenIds(List<Integer> ids);

	void deleteDoctor(Doctor doctor);

	void deleteDoctorById(int doctorId);

	void deleteDoctorsByIds(List<Integer> id);

	void closeHospital();
}
