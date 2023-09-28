package learn.luv2code.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.luv2code.dao.DoctorRepo;
import learn.luv2code.dto.Doctor;
import learn.luv2code.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepo doctorRepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("Updating Doctor: " + doctor);
		doctor = doctorRepo.save(doctor);
		System.out.println("Updated Doctor: " + doctor);
		return doctor.getDocId().toString();
	}

	@Override
	public List<String> registerDoctors(List<Doctor> doctors) {
		System.out.println("Update following Doctors:");
		doctors.forEach(System.out::println);
		List<Doctor> iterable = (List<Doctor>) doctorRepo.saveAll(doctors);
		System.out.println("Updated doctors");
		iterable.forEach(System.out::println);
		return iterable.stream().map(doc -> doc.getDocId().toString()).toList();
	}

}
