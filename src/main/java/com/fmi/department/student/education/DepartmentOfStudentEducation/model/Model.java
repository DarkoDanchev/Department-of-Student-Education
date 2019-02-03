package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public abstract class Model implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial",name="id")
    @Id
    private UUID id;

    @NotNull
    private Timestamp createdAt;

    @NotNull
    private Timestamp modifiedAt;
}
