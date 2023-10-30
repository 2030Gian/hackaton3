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

    private String HRgroup;

    private Integer cycle;

    private String VRGroup;


    @OneToOne
    @JoinColumn(name = "id_course_type")
    private CourseType courseType;

    @OneToOne(mappedBy = "course")
    private CourseAssessment courseAssessment;

    public Course(){};

    public Course(CourseType courseType,String name,
             Integer credits, String code, String HRgroup, 
             Integer cycle, String VRGroup){

        this.name = name;
        this.credits = credits;
        this.code = code;
        this.HRgroup = HRgroup;
        this.cycle = cycle;
        this.VRGroup = VRGroup;
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

    public String getHRgroup() {
        return this.HRgroup;
    }

    public void setHRgroup(String HRgroup) {
        this.HRgroup = HRgroup;
    }

    public Integer getCycle() {
        return this.cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public String getVRGroup() {
        return this.VRGroup;
    }

    public void setVRGroup(String VRGroup) {
        this.VRGroup = VRGroup;
    }


    public CourseType getCourseType() {
        return this.courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    
}
