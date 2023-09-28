package learn.luv2code.dao;

import org.springframework.data.repository.CrudRepository;

import learn.luv2code.dto.Doctor;

public interface DoctorRepo extends CrudRepository<Doctor, Integer> {

}
