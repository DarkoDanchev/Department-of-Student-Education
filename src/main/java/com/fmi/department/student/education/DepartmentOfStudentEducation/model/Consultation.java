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
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Consultation extends Model{
	
	@NotNull
	@Length(min = 4, max = 32)
	@Column(name = "name")
	private String name;
	
	@Length(min = 4, max = 512)
	@Column(name = "description")
	private String description;

}
