package com.example.hakaton2.entidades;

import jakarta.persistence.*;
@Entity
@Table(name = "periodo")
public class Periodo{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    private String name;

    private String code;

    

    @OneToOne(mappedBy = "periodo")
    private CourseAssessment courseAssessment;

    public Periodo(){};

    public Periodo(String name, String code){
        this.name = name;
        this.code = code;
    };



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


    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    
}
