package com.example.hakaton2.entidades;

import jakarta.persistence.*;


@Entity
@Table(name = "course_assessment_details")
public class CourseAssessmentDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;

    private String score;

    private String section;

    @OneToOne
    @JoinColumn(name = "id_student")
    private Student student;

    @OneToOne
    @JoinColumn(name = "id_professor")
    private Professor professor;

    @OneToOne
    @JoinColumn(name = "id_course_assessment")
    private CourseAssessment courseAssessment;

    private String sectionGroup;

    public CourseAssessmentDetails(){}

    public CourseAssessmentDetails(String score, String section,
           Student student, Professor professor,
           CourseAssessment courseAssessment,
           String sectionGroup){ 
            this.score = score;
            this.section = section;
            this.student = student;
            this.professor = professor;
            this.courseAssessment = courseAssessment;
            this.sectionGroup = sectionGroup;}

    public Long getId() {
        return this.id;
    }

    public String getScore() {
        return score;
    }

    public String getSection() {
        return section;
    }

    public Student getStudent(){
        return student;
    }

    public Professor getProfessor(){
        return professor;
    }

    public CourseAssessment getCourseAssessment(){
        return courseAssessment;
    }

    public String getSectionGroup() {
        return sectionGroup;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public void setCourseAssessment(CourseAssessment courseAssessment){
        this.courseAssessment = courseAssessment;
    }

    public void setSectionGroup(String sectionGroup) {
        this.sectionGroup = sectionGroup;
    }
    
}

