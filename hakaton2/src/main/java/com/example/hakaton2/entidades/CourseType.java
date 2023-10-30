package com.example.hakaton2.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "course_type")
public class CourseType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

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

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
