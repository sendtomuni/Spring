package learn.luv2code.service;

import java.util.List;

import learn.luv2code.dto.Doctor;

public interface DoctorService {
	String registerDoctor(Doctor doctor);

	default List<String> registerDoctors(List<Doctor> doctors) {
		return null;
	}
}
