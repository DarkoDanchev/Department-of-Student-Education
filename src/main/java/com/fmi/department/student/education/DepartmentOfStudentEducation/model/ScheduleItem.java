package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class ScheduleItem extends Model {

    @Column(name = "date")
    @NotNull
    private Date date;

    @Column(name = "day")
    @NotNull
    @Length(min = 4,max = 12)
    private String day;

    @Column(name = "duration")
    @NotNull
    private Short duration;
}
