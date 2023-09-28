package learn.luv2code.dao;

import org.springframework.data.repository.CrudRepository;

import learn.luv2code.dto.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
