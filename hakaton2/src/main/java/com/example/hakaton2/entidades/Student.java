package com.example.hakaton2.entidades;


import jakarta.persistence.*;


@Entity
@Table(name =  "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    private String name;

    private String email;

    private String code;


    @OneToOne(mappedBy = "student")
    private CourseAssessmentDetails courseAssessmentDetails;

    public Student(){};

    public Student(String name, String email, String code){
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    

}
