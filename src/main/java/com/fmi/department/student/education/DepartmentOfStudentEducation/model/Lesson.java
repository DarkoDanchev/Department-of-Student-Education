package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Lesson extends Model{

	@NotNull
	@Column(name = "name")
	@Length(min = 4, max = 64)
	private String name;
	
	@Column(name = "description")
	@Length(min = 4, max = 512)
	private String description;
}
