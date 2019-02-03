package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import com.fmi.department.student.education.DepartmentOfStudentEducation.Constants;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Semester extends Model {

    @Column(name = "year")
    @NotNull
    @Pattern(regexp = Constants.year_regex)
    private String year;

    @Column(name = "startDate")
    @NotNull
    private Date startDate;

    @Column(name = "endDate")
    @NotNull
    private Date endDate;

}
