package com.example.hakaton2.entidades;

import jakarta.persistence.*;


@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)

    private Long id;

    private String name;

    private String lastName;

    private String email;

    private String fullName;


    @OneToOne(mappedBy = "professor")
    private CourseAssessmentDetails courseAssessmentDetails;



    public Professor(){};
    public Professor(String name, String lastName, String email, String fullName){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.fullName = fullName;
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

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    
}
