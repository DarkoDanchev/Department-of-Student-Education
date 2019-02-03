package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.jws.HandlerChain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class Role extends Model {

    @Column(name = "name")
    @Length(min = 4,max = 32)
    @NotNull
    private String name;

    @Column(name = "description")
    @Length(min = 16,max = 256)
    @NotNull
    private String description;

}
