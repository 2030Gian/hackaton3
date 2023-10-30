package com.example.hakaton2.entidades;

import jakarta.persistence.*;


@Entity
@Table(name = "course_assessment_details")
public class CourseAssessmentDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    private String score;

    private String section;

    private String sectionGroup;


    @OneToOne
    @JoinColumn(name = "id_student")
    private Student student;

    @OneToOne
    @JoinColumn(name = "id_course_assessment")
    private CourseAssessment courseAssessment;

    @OneToOne
    @JoinColumn(name = "id_professor")
    private Professor professor;

    public CourseAssessmentDetails(){}

    public CourseAssessmentDetails(String score, String section,
                             String sectionGroup,
                             CourseAssessment courseAssessment, 
                             Professor professor, Student student){
                this.score = score;
                this.section = section;
                this.sectionGroup = sectionGroup;
                this.courseAssessment = courseAssessment;
                this.professor = professor;
                this.student = student;               
                             }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSectionGroup() {
        return this.sectionGroup;
    }

    public void setSectionGroup(String sectionGroup) {
        this.sectionGroup = sectionGroup;
    }

    public Student getStudent(){
        return this.student;
    }

    public CourseAssessment getCourseAssessment(){
        return this.courseAssessment;
    }

    public Professor getProfessor(){
        return this.professor;
    }


    public void setStudent(Student student){
        this.student = student;
    }

    public void setCourseAssessment(CourseAssessment courseAssessment){
        this.courseAssessment = courseAssessment;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }


    



    
}

