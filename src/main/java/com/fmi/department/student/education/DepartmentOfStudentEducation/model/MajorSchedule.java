package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = false)
@Builder
public class MajorSchedule extends Model{
	
	//TODO [It has relation to Major]

}
