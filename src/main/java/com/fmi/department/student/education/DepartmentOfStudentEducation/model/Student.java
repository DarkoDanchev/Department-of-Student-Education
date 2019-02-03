package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import com.fmi.department.student.education.DepartmentOfStudentEducation.Constants;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Student extends Model {

    @Column(name = "fullName")
    @NotNull
    @Length(min = 8, max = 64)
    @Pattern(regexp = Constants.name_regex)
    private String fullName;

    @Column(name = "studentId")
    @NotNull
    private Integer studentId;
}
