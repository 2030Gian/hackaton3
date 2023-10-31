package com.example.hakaton2.entidades;

import jakarta.persistence.*;


@Entity
@Table(name = "course_assessments")
public class CourseAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_course")
    private Course course;

    @OneToOne
    @JoinColumn(name = "id_periodo")
    private Periodo periodo;

    @OneToOne(mappedBy = "courseAssessment")
    private CourseAssessmentDetails courseAssessmentDetails;


    @Column
    private String title;

    @Column(name ="tipo_nota")
    private String tipoNota;
    
    @Column(name = "num_nota")
    private String numNota;

    @Column(name ="nomenclatura")
    private String nomenclatura;


    public CourseAssessment(){};

    public CourseAssessment(Course course, Periodo periodo, 
             String title, String tipoNota, String numNota,
             String nomenclatura){
        this.course = course; 
        this.periodo = periodo;       
        this.title = title;
        this.tipoNota = tipoNota;
        this.numNota = numNota;
        this.nomenclatura = nomenclatura;
    }

    public Long getId() {
        return this.id;
    }

    public Course getCourse(){
        return course;
    }

    public Periodo getPeriodo(){
        return periodo;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public String getNumNota() {
        return numNota;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setCourse(Course course){
        this.course = course;
        
    }

    public void setPeriodo(Periodo periodo){
        this.periodo = periodo;
        
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public void setNumNota(String numNota) {
        this.numNota = numNota;
    }


    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }    
}
