package learn.luv2code.service.impl;

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
		return "Success";
	}

}
