package learn.luv2code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import learn.luv2code.dao.DoctorRepo;
import learn.luv2code.dto.Doctor;
import learn.luv2code.enums.DoctorsProperty;
import learn.luv2code.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	private static final int DEFAULT_PAGE_SIZE = 10;
	private static final int DEFAULT_PAGE_NUMBER = 0;

	@Autowired
	DoctorRepo doctorRepo;

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
	@Override
	public Page<Doctor> fetchAllDoctors(int pageSize, int pageNo) {
		if (pageSize < 1) {
			throw new IllegalArgumentException("Page Size should have to be minimum 1");
		}
		return doctorRepo.findAll(PageRequest.of(pageNo, pageSize));
	}

	/**
	 * This will get list of all doctors. This will also apply pagination to chunk
	 * of records. pagesize for the records is default
	 * {@link DoctorServiceImpl#DEFAULT_PAGE_SIZE} and default pageNo to show is
	 * {@link DoctorServiceImpl#DEFAULT_PAGE_NUMBER}
	 * 
	 * @return {@link Page}
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html">Page</a>
	 */
	@Override
	public Page<Doctor> fetchAllDoctors() {
		// TODO Auto-generated method stub
		return this.fetchAllDoctors(DEFAULT_PAGE_SIZE, DEFAULT_PAGE_NUMBER);
	}

	/**
	 * Get List of all Doctors with sorting by any of the doctor's property. <br>
	 * Accepted properties are {@link DoctorsProperty#NAME},
	 * {@link DoctorsProperty#ID} and {@link DoctorsProperty#SPECIALISATION}. <br>
	 * 
	 * This will also apply pagination to chunk of records. pagesize for the records
	 * is default {@link DoctorServiceImpl#DEFAULT_PAGE_SIZE} and default pageNo to
	 * show is {@link DoctorServiceImpl#DEFAULT_PAGE_NUMBER}
	 * 
	 * @param doctorsProperty {@link DoctorsProperty}
	 * @return {@link Page}
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html">Page</a>
	 */
	@Override
	public Page<Doctor> fetchAllDoctorsSortedBy(DoctorsProperty doctorsProperty) {
		return this.fetchAllDoctorsSortedByWithpageSize(doctorsProperty, DEFAULT_PAGE_SIZE, DEFAULT_PAGE_NUMBER);
	}

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
	@Override
	public Page<Doctor> fetchAllDoctorsSortedByWithpageSize(DoctorsProperty doctorsProperty, int pageSize, int pageNo) {
		if (pageSize < 1) {
			throw new IllegalArgumentException("Page Size should have to be minimum 1");
		}
		switch (doctorsProperty) {
		case ID:
			return this.fetchAllDoctorsSortById(pageSize, pageNo);
		case NAME:
			return this.fetchAllDoctorsSortByName(pageSize, pageNo);
		case SPECIALISATION:
			return this.fetchAllDoctorsSortBySpecialisation(pageSize, pageNo);
		default:
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Get List of all Doctors with sorting by any of the doctor's property. <br>
	 * Accepted properties are {@link DoctorsProperty#NAME}.
	 * 
	 * This will also apply pagination to chunk of records. pagesize for the records
	 * is default {@link DoctorServiceImpl#DEFAULT_PAGE_SIZE} and default pageNo to
	 * show is {@link DoctorServiceImpl#DEFAULT_PAGE_NUMBER}
	 * 
	 * @return {@link Page}
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html">Page</a>
	 */
	private Page<Doctor> fetchAllDoctorsSortByName() {
		return this.fetchAllDoctorsSortByName(DEFAULT_PAGE_SIZE, DEFAULT_PAGE_NUMBER);
	}

	/**
	 * Get List of all Doctors with sorting by any of the doctor's property. <br>
	 * Accepted properties are {@link DoctorsProperty#NAME}. <br>
	 * It also has a page size, that can be given by end user and it should be more
	 * than 0.
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
	private Page<Doctor> fetchAllDoctorsSortByName(int pageSize, int pageNo) {
		if (pageSize < 1) {
			throw new IllegalArgumentException("Page Size should have to be minimum 1");
		}
		return doctorRepo.findAll(PageRequest.of(pageNo, pageSize, Direction.ASC, "docName"));
	}

	/**
	 * Get List of all Doctors with sorting by any of the doctor's property. <br>
	 * Accepted properties are {@link DoctorsProperty#ID}. <br>
	 * 
	 * This will also apply pagination to chunk of records. pagesize for the records
	 * is default {@link DoctorServiceImpl#DEFAULT_PAGE_SIZE} and default pageNo to
	 * show is {@link DoctorServiceImpl#DEFAULT_PAGE_NUMBER}
	 * 
	 * @return {@link Page}
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html">Page</a>
	 */
	private Page<Doctor> fetchAllDoctorsSortById() {
		return this.fetchAllDoctorsSortById(DEFAULT_PAGE_SIZE, DEFAULT_PAGE_NUMBER);
	}

	/**
	 * Get List of all Doctors with sorting by any of the doctor's property. <br>
	 * Accepted properties are {@link DoctorsProperty#ID}. <br>
	 * It also has a page size, that can be given by end user and it should be more
	 * than 0.
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
	private Page<Doctor> fetchAllDoctorsSortById(int pageSize, int pageNo) {
		if (pageSize < 1) {
			throw new IllegalArgumentException("Page Size should have to be minimum 1");
		}
		return doctorRepo.findAll(PageRequest.of(pageNo, pageSize, Direction.ASC, "docId"));
	}

	/**
	 * Get List of all Doctors with sorting by any of the doctor's property. <br>
	 * Accepted properties are {@link DoctorsProperty#SPECIALISATION}. <br>
	 * 
	 * This will also apply pagination to chunk of records. pagesize for the records
	 * is default {@link DoctorServiceImpl#DEFAULT_PAGE_SIZE} and default pageNo to
	 * show is {@link DoctorServiceImpl#DEFAULT_PAGE_NUMBER}
	 * 
	 * @return {@link Page}
	 * 
	 * @see <a href=
	 *      "https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html">Page</a>
	 */
	private Page<Doctor> fetchAllDoctorsSortBySpecialisation() {
		return this.fetchAllDoctorsSortBySpecialisation(DEFAULT_PAGE_SIZE, DEFAULT_PAGE_NUMBER);
	}

	/**
	 * Get List of all Doctors with sorting by any of the doctor's property. <br>
	 * Accepted properties are {@link DoctorsProperty#SPECIALISATION}. <br>
	 * It also has a page size, that can be given by end user and it should be more
	 * than 0.
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
	private Page<Doctor> fetchAllDoctorsSortBySpecialisation(int pageSize, int pageNo) {
		if (pageSize < 1) {
			throw new IllegalArgumentException("Page Size should have to be minimum 1");
		}
		return doctorRepo.findAll(PageRequest.of(pageNo, pageSize, Direction.ASC, "specialization"));
	}

}
