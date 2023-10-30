package com.example.hakaton2.entidades;

import jakarta.persistence.*;


@Entity
@Table(name = "course")
public class Course{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    private String name;

    private Integer credits;

    private String code;

    private String hrGroup;

    private Integer cycle;

    private String vrGroup;


    @OneToOne
    @JoinColumn(name = "id_course_type")
    private CourseType courseType;

    @OneToOne(mappedBy = "course")
    private CourseAssessment courseAssessment;

    public Course(){};

    public Course(CourseType courseType,String name,
             Integer credits, String code, String hrGroup, 
             Integer cycle, String vrGroup){

        this.name = name;
        this.credits = credits;
        this.code = code;
        this.hrGroup = hrGroup;
        this.cycle = cycle;
        this.vrGroup = vrGroup;
        this.courseType = courseType;
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

    public Integer getCredits() {
        return this.credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHrGroup() {
        return this.hrGroup;
    }

    public void setHrGroup(String hrGroup) {
        this.hrGroup = hrGroup;
    }

    public Integer getCycle() {
        return this.cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public String getVrGroup() {
        return this.vrGroup;
    }

    public void setVrGroup(String vrGroup) {
        this.vrGroup = vrGroup;
    }


    public CourseType getCourseType() {
        return this.courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    
}
