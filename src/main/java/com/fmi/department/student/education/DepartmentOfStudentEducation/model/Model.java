package com.fmi.department.student.education.DepartmentOfStudentEducation.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public abstract class Model implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial",name="id")
    private Long id;

    public Model(Long id) {
        this.id = id;
    }

    public Model(){
        this.id = 0L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
