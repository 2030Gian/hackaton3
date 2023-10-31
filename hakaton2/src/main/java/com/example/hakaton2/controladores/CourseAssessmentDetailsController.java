package com.example.hakaton2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.hakaton2.entidades.CourseAssessmentDetails;
import com.example.hakaton2.repositorios.CourseAssessmentDetailsRepository;
import com.example.hakaton2.entidades.Course;

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

    @Autowired CourseAssessmentRepository courseAssessmentRepository;

    @Autowired PeriodoRepository periodoRepository;

    @Autowired CourseRepository courseRepository;

    @Autowired CourseTypeRepository courseTypeRepository;

    @GetMapping
    public ResponseEntity<List<CourseAssessmentDetails>> getCourseAssessmentDetails(){
        List<CourseAssessmentDetails> courseAssessmentDetails = courseAssessmentDetailsRepository.findAll();
        return new ResponseEntity<>(courseAssessmentDetails, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CourseAssessmentDetails> addCourseAssessmentDetails(@RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        CourseAssessmentDetails newCourseAssessmentDetails= courseAssessmentDetailsRepository.save(courseAssessmentDetails);
        return new ResponseEntity<>(newCourseAssessmentDetails,HttpStatus.CREATED);
    }

    

    /*
    @GetMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails> courseAssessmentDetailss(@PathVariable Long id){
    Optional<CourseAssessmentDetails> courseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
    
    if (courseAssessmentDetails.isPresent()) {
        return new ResponseEntity<>(courseAssessmentDetails.get(), HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourseAssessmentDetails(@PathVariable Long id) {
        Optional<CourseAssessmentDetails> optionalCourseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
        if (optionalCourseAssessmentDetails.isPresent()) { // el Optional 
            courseAssessmentDetailsRepository.deleteById(id);
            return ResponseEntity.status(200).body("Deleted");
        } else {
            return ResponseEntity.status(404).body("Not Found");
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<String> updateCourseAssessmentDetails(@PathVariable Long id, @RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        Optional<CourseAssessmentDetails> optionalCourseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
        if (optionalCourseAssessmentDetails.isPresent()) {
            CourseAssessmentDetails existingCourseAssessmentDetails = optionalCourseAssessmentDetails.get();
            existingCourseAssessmentDetails.setScore(courseAssessmentDetails.getScore());
            existingCourseAssessmentDetails.setSection(courseAssessmentDetails.getSection());
            existingCourseAssessmentDetails.setSectionGroup(courseAssessmentDetails.getSectionGroup());
            existingCourseAssessmentDetails.setCourseAssessment(courseAssessmentDetails.getCourseAssessment());
            existingCourseAssessmentDetails.setProfessor(courseAssessmentDetails.getProfessor());
            existingCourseAssessmentDetails.setStudent(courseAssessmentDetails.getStudent());
            courseAssessmentDetailsRepository.save(existingCourseAssessmentDetails);

            return ResponseEntity.status(200).body("Updated");
        } else {
            return ResponseEntity.status(404).body("Not Found");
        }
    }

    */

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
}


    