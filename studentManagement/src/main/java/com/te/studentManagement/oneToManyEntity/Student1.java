package com.te.studentManagement.oneToManyEntity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "student_info_oneToMany")
@Data
public class Student1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer s_id;
	@Column(name = "student_name",nullable = false)
	private String s_name;
	@Column(name = "student_mobile")
	private Long s_mobile;
	@OneToMany(mappedBy = "student1")
	private List<Subject> subjects;
	

}
