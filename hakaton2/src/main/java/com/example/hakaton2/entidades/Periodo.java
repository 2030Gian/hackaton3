package com.example.hakaton2.entidades;

import jakarta.persistence.*;
@Entity
@Table(name = "periodos")
public class Periodo{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "name")
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    
}
