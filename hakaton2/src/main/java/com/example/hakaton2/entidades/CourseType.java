package com.example.hakaton2.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "course_types")
public class CourseType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    
    @OneToOne(mappedBy = "courseType")
    private Course course;

    public CourseType(){};

    public CourseType(String name){
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
