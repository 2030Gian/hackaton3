package com.example.hakaton2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.hakaton2.entidades.CourseAssessmentDetails;
import com.example.hakaton2.repositorios.CourseAssessmentDetailsRepository;

import com.example.hakaton2.repositorios.CourseAssessmentRepository;
import com.example.hakaton2.entidades.CourseAssessment;


import com.example.hakaton2.repositorios.ProfessorRepository;
import com.example.hakaton2.entidades.Professor;


import com.example.hakaton2.entidades.Student; 
import com.example.hakaton2.repositorios.StudentRepository;

import com.example.hakaton2.entidades.Periodo;
import com.example.hakaton2.repositorios.PeriodoRepository;

import com.example.hakaton2.entidades.Course;
import com.example.hakaton2.repositorios.CourseRepository;

import com.example.hakaton2.entidades.CourseType;
import com.example.hakaton2.repositorios.CourseTypeRepository;


import java.util.List; 
import java.util.Optional;

@RestController("Controller")
@RequestMapping("/course_assessment_details")
public class CourseAssessmentDetailsController {

    @Autowired
    private CourseAssessmentDetailsRepository courseAssessmentDetailsRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CourseAssessmentRepository courseAssessmentRepository;

    @Autowired 
    private PeriodoRepository periodoRepository;

    @Autowired 
    private CourseRepository courseRepository;

    @Autowired 
    private CourseTypeRepository courseTypeRepository;

    @GetMapping
    public ResponseEntity<List<CourseAssessmentDetails>> getCourseAssessmentDetails(){
        List<CourseAssessmentDetails> courseAssessmentDetails = courseAssessmentDetailsRepository.findAll();
        return new ResponseEntity<>(courseAssessmentDetails, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails> getIdCourseAssessmentDetailss(@PathVariable Long id){
    Optional<CourseAssessmentDetails> optionalCourseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
    
    if (optionalCourseAssessmentDetails.isPresent()) {
        return new ResponseEntity<>(optionalCourseAssessmentDetails.get(), HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } }

    @PostMapping
    public ResponseEntity<String> addCourseAssessmentDetails(@RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        courseAssessmentDetailsRepository.save(courseAssessmentDetails);
        return ResponseEntity.status(201).body("New item created");
    }

    @PutMapping("{id}")
    public ResponseEntity<String> updateCourseAssessmentDetails(@PathVariable Long id, @RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        Optional<CourseAssessmentDetails> optionalCourseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
        if (optionalCourseAssessmentDetails.isPresent()) {
            CourseAssessmentDetails existingCourseAssessmentDetails = optionalCourseAssessmentDetails.get();
            existingCourseAssessmentDetails.setScore(courseAssessmentDetails.getScore());
            existingCourseAssessmentDetails.setSection(courseAssessmentDetails.getSection());
            existingCourseAssessmentDetails.setSectionGroup(courseAssessmentDetails.getSectionGroup());

            Optional<Student> optionalStudent = studentRepository.findById(courseAssessmentDetails.getStudent().getId());
            if (optionalStudent.isPresent()){
                Student existingStudent = optionalStudent.get();
                existingStudent.setName(courseAssessmentDetails.getStudent().getName());
                existingStudent.setEmail(courseAssessmentDetails.getStudent().getEmail());
                existingStudent.setCode(courseAssessmentDetails.getStudent().getCode());
                studentRepository.save(existingStudent);
            }
            
            Optional<Professor> optionalProfessor = professorRepository.findById(courseAssessmentDetails.getProfessor().getId());
            if (optionalProfessor.isPresent()){
                Professor existingProfessor = optionalProfessor.get();
                existingProfessor.setName(courseAssessmentDetails.getProfessor().getName());
                existingProfessor.setLastName(courseAssessmentDetails.getProfessor().getLastName());
                existingProfessor.setEmail(courseAssessmentDetails.getProfessor().getEmail());
                existingProfessor.setFullName(courseAssessmentDetails.getProfessor().getFullName());
                professorRepository.save(existingProfessor);
            }

            Optional<CourseAssessment> optionalCourseAssessment = courseAssessmentRepository.findById(courseAssessmentDetails.getCourseAssessment().getId());
            if (optionalCourseAssessment.isPresent()){
                CourseAssessment existingCourseAssessment = optionalCourseAssessment.get();
                existingCourseAssessment.setTitle(courseAssessmentDetails.getCourseAssessment().getTitle());
                existingCourseAssessment.setTipoNota(courseAssessmentDetails.getCourseAssessment().getTipoNota());
                existingCourseAssessment.setNumNota(courseAssessmentDetails.getCourseAssessment().getNumNota());
                existingCourseAssessment.setNomenclatura(courseAssessmentDetails.getCourseAssessment().getNomenclatura());

                Optional<Periodo> optionalPeriodo = periodoRepository.findById(courseAssessmentDetails.getCourseAssessment().getPeriodo().getId());
                if (optionalPeriodo.isPresent()){
                    Periodo existingPeriodo = optionalPeriodo.get();
                    existingPeriodo.setName(courseAssessmentDetails.getCourseAssessment().getPeriodo().getName());
                    existingPeriodo.setCode(courseAssessmentDetails.getCourseAssessment().getPeriodo().getCode());
                    periodoRepository.save(existingPeriodo);
                }

                Optional<Course> optionalCourse = courseRepository.findById(courseAssessmentDetails.getCourseAssessment().getCourse().getId());
                if (optionalCourse.isPresent()){
                    Course existingCourse = optionalCourse.get();
                    existingCourse.setName(courseAssessmentDetails.getCourseAssessment().getCourse().getName());
                    existingCourse.setCredits(courseAssessmentDetails.getCourseAssessment().getCourse().getCredits());
                    existingCourse.setCode(courseAssessmentDetails.getCourseAssessment().getCourse().getCode());
                    existingCourse.setHrGroup(courseAssessmentDetails.getCourseAssessment().getCourse().getHrGroup());
                    existingCourse.setCycle(courseAssessmentDetails.getCourseAssessment().getCourse().getCycle());
                    existingCourse.setVrGroup(courseAssessmentDetails.getCourseAssessment().getCourse().getVrGroup());

                    Optional<CourseType> optionalCourseType = courseTypeRepository.findById(courseAssessmentDetails.getCourseAssessment().getCourse().getCourseType().getId());
                    if (optionalCourseType.isPresent()){
                        CourseType existingCourseType = optionalCourseType.get();
                        existingCourseType.setName(courseAssessmentDetails.getCourseAssessment().getCourse().getCourseType().getName());
                        courseTypeRepository.save(existingCourseType);
                    }
                    courseRepository.save(existingCourse);
                }

                courseAssessmentRepository.save(existingCourseAssessment);
                
            }
            courseAssessmentDetailsRepository.save(existingCourseAssessmentDetails);

            return ResponseEntity.status(200).body("Updated");
        } else {
            return ResponseEntity.status(404).body("Not Found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourseAssessmentDetails(@PathVariable Long id) {
        Optional<CourseAssessmentDetails> optionalCourseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);

        if (optionalCourseAssessmentDetails.isPresent()) { 
            CourseAssessmentDetails existingCourseAssessmentDetails = optionalCourseAssessmentDetails.get();
            
            courseAssessmentDetailsRepository.deleteById(id);
            professorRepository.deleteById(existingCourseAssessmentDetails.getProfessor().getId());
            studentRepository.deleteById(existingCourseAssessmentDetails.getStudent().getId());
            courseAssessmentRepository.deleteById(existingCourseAssessmentDetails.getCourseAssessment().getId());
            periodoRepository.deleteById(existingCourseAssessmentDetails.getCourseAssessment().getPeriodo().getId());
            courseRepository.deleteById(existingCourseAssessmentDetails.getCourseAssessment().getCourse().getId());
            courseTypeRepository.deleteById(existingCourseAssessmentDetails.getCourseAssessment().getCourse().getCourseType().getId());
            return ResponseEntity.status(200).body("Deleted");
        } else {
            return ResponseEntity.status(404).body("Not Found");
        }
    }



      
}


    