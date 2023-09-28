package learn.luv2code.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import learn.luv2code.dto.Doctor;

/**
 * Doctor Repository with support of Paging and sorting feature
 * 
 * @see <a href=
 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/PagingAndSortingRepository.html">
 *      PagingAndSortingRepository </a>
 * @see <a href=
 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html">
 *      CrudRepository </a>
 * 
 */
public interface DoctorRepo extends PagingAndSortingRepository<Doctor, Integer> {

}
