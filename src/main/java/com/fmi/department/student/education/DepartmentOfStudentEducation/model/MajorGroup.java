package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class MajorGroup extends Model {

    @Column(name = "name")
    @NotNull
    @Length(min = 4, max = 64)
    private String name;

    @Column(name = "description")
    @NotNull
    @Length(min = 8, max = 256)
    private String description;

    @Column(name = "numberOfStudents")
    @NotNull
    private Integer numberOfStudents;
}
