package learn.luv2code.service;

import org.springframework.data.domain.Page;

import learn.luv2code.dto.Doctor;
import learn.luv2code.enums.DoctorsProperty;
import learn.luv2code.service.impl.DoctorServiceImpl;

public interface DoctorService {

	/**
	 * Get List of all Doctors with pagination. page Size will be given from end
	 * user and it should be more than 0.
	 * 
	 * @param pageSize {@link Integer} @acceptedValue >0 How many records should
	 *                 placed in a page.
	 * @param pageNo   {@link Integer} Which page you want to view
	 * @return {@link Page}
	 * @throws IllegalArgumentException if pagesize is less than or equal to 0.
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html">Page</a>
	 */
	Page<Doctor> fetchAllDoctors(int pageSize, int pageNo);

	/**
	 * Get List of all Doctors. This will also apply pagination to chunk of records.
	 * pagesize for the records is default
	 * {@link DoctorServiceImpl#DEFAULT_PAGE_SIZE} and default pageNo to show is
	 * {@link DoctorServiceImpl#DEFAULT_PAGE_NUMBER}
	 * 
	 * @return {@link Page}
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html">Page</a>
	 */
	Page<Doctor> fetchAllDoctors();

	/**
	 * Get List of all Doctors with sorting by any of the doctor's property. <br>
	 * Accepted properties are {@link DoctorsProperty#NAME},
	 * {@link DoctorsProperty#ID} and {@link DoctorsProperty#SPECIALISATION}. <br>
	 * 
	 * @param doctorsProperty {@link DoctorsProperty}
	 * @return {@link Page}
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html">Page</a>
	 */
	Page<Doctor> fetchAllDoctorsSortedBy(DoctorsProperty doctorsProperty);

	/**
	 * Get List of all Doctors with sorting by any of the doctor's property. <br>
	 * Accepted properties are {@link DoctorsProperty#NAME},
	 * {@link DoctorsProperty#ID} and {@link DoctorsProperty#SPECIALISATION}. <br>
	 * It also has a page size, that can be given by end user and it should be more
	 * than 0.
	 * 
	 * @param doctorsProperty {@link DoctorsProperty} On which property Records will
	 *                        sorted/
	 * @param pageSize        {@link Integer} @acceptedValue >0 How many records
	 *                        should placed in a page.
	 * @param pageNo          {@link Integer} Which page you want to view
	 * @return {@link Page}
	 * @throws IllegalArgumentException if pagesize is less than or equal to 0.
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html">Page</a>
	 */
	Page<Doctor> fetchAllDoctorsSortedByWithpageSize(DoctorsProperty doctorsProperty, int pageSize, int pageNo);
}
