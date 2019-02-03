package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import com.fmi.department.student.education.DepartmentOfStudentEducation.Constants;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class MajorPart extends Model {

    @Column(name = "description")
    @NotNull
    @Length(min = 16, max = 512)
    private String description;

    @Column(name = "majorPartId")
    @NotNull
    private String majorPartId;

    @Column(name = "startYear")
    @NotNull
    @Pattern(regexp = Constants.year_regex)
    private String startYear;

    @Column(name = "endYear")
    @NotNull
    @Pattern(regexp = Constants.year_regex)
    private String endYear;

    @Column(name = "course")
    @Length(min = 8, max = 64)
    private String course;

}
