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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Major extends Model {
	
	@Column(name = "name")
	@NotNull
	@Length(min = 4, max = 20)
	private String name;
	
	//TODO It has List<MajorPart>

}
