package learn.luv2code.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "JPA_DOCTOR_INFO")
@Data
@Builder
public class Doctor {
	@Column(name = "DOC_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer docId;
	@Column(name = "DOC_NAME", length = 25)
	private String docName;
	@Column(name = "SPECIALIZATION", length = 25)
	private String specialization;
	@Column(name = "INCOME")
	private Double income;
}
