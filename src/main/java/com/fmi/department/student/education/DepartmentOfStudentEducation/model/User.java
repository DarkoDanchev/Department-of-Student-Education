package com.fmi.department.student.education.DepartmentOfStudentEducation.model;


import com.fmi.department.student.education.DepartmentOfStudentEducation.Constants;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = false)
public class User extends Model {

    @Column(name = "username")
    @NotNull
    @Length(min = 4, max = 64)
    private String username;

    @Column(name = "password")
    @NotNull
    @Length(min = 8,max = 128)
    private String password;

    @Column(name = "email")
    @NotNull
    @Length(min = 5,max = 64)
    @Pattern(regexp = Constants.email_regex)
    private String email;

    @Column(name = "pin")
    @NotNull
    private Long pin;

    @Column(name = "phoneNumber")
    @NotNull
    @Pattern(regexp = Constants.phone_regex)
    private String phoneNumber;

}
