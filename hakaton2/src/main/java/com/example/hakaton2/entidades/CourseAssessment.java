package com.example.hakaton2.entidades;

import jakarta.persistence.*;


@Entity
@Table(name = "course_assessment")
public class CourseAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)

    private Long id;



    private String title;

    private String tipoNota;

    private String numNota;

    private String nomenclatura;

    @OneToOne
    @JoinColumn(name = "id_periodo")
    private Periodo periodo;

    @OneToOne
    @JoinColumn(name = "id_course")
    private Course course;

    @OneToOne(mappedBy = "courseAssessment")
    private CourseAssessmentDetails courseAssessmentDetails;

    public CourseAssessment(){};

    public CourseAssessment(Periodo periodo, Course course,
            String title, String tipoNota, String numNota,
             String nomenclatura){
        this.title = title;
        this.tipoNota = tipoNota;
        this.numNota = numNota;
        this.nomenclatura = nomenclatura;
        this.course = course;
        this.periodo = periodo;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTipoNota() {
        return this.tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public String getNumNota() {
        return this.numNota;
    }

    public void setNumNota(String numNota) {
        this.numNota = numNota;
    }

    public String getNomenclatura() {
        return this.nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }


    public Periodo getPeriodo(){
        return this.periodo;
    }

    public Course getCourse(){
        return this.course;
    }

    public void setPeriodo(Periodo periodo){
        this.periodo = periodo;
        
    }
    
     public void setCourse(Course course){
        this.course = course;
        
    }  

    


   






    
}
