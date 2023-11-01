package com.example.hakaton2.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "credits")
    private Integer credits;

    private String code;

    private String hrGroup;

    private Integer cycle;

    private String vrGroup;

    @OneToOne(mappedBy = "course")
    private CourseAssessment courseAssessment;

    @OneToOne
    @JoinColumn(name = "id_course_type")
    private CourseType courseType;

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
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHrGroup() {
        return hrGroup;
    }

    public void setHrGroup(String hrGroup) {
        this.hrGroup = hrGroup;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public String getVrGroup() {
        return vrGroup;
    }

    public void setVrGroup(String vrGroup) {
        this.vrGroup = vrGroup;
    }


    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
    
}
