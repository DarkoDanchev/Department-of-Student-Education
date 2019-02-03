package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
public abstract class Model implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial",name="id")
    @Id
    private UUID id;

    public Model(UUID id) {
        this.id = id;
    }

    public Model(){
        this.id = new UUID(32,32);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
