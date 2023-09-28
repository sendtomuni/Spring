package learn.luv2code.dao;

import org.springframework.data.repository.CrudRepository;

import learn.luv2code.dto.Doctor;

/**
 * JPA Supported repo class for all Doctor Related CRUD operations We can refer
 * to DOctor Table in the Learn Database to get the details.
 * 
 * @see <a href=
 *      "https://docs.spring.io/spring-data/jpa/docs/current/api/index.html">CrudRepository</a>
 * 
 * @author Subarna
 */
public interface DoctorRepo extends CrudRepository<Doctor, Integer> {

}
