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
@EqualsAndHashCode(callSuper = false)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceList extends Model{

	@NotNull
	@Column(name = "name")
	@Length(min = 4, max = 64)
	private String name;
	
	@Column(name = "description")
	@Length(min = 4, max = 256)
	private String description;
	
	@Column(name = "file_link")
	@Length(min = 4, max = 512)
	private String fileLink;
}
