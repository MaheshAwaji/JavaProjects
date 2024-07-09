package com.te.studentManagement.oneToManyEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data

public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "subject_name")
	private String subject_name;
	@Column(name = "fees")
	private Double subject_fees;
	@ManyToOne
	private Student1 student1;

}
