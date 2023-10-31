package com.example.hakaton2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.hakaton2.entidades.CourseAssessmentDetails;
import com.example.hakaton2.repositorios.CourseAssessmentDetailsRepository;

import com.example.hakaton2.entidades.CourseAssessment;
import com.example.hakaton2.repositorios.CourseAssessmentRepository;


import com.example.hakaton2.repositorios.ProfessorRepository;
import com.example.hakaton2.entidades.Professor;


import com.example.hakaton2.entidades.Student; 
import com.example.hakaton2.repositorios.StudentRepository;

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
            existingCourseAssessmentDetails.setCourseAssessment(courseAssessmentDetails.getCourseAssessment());
            existingCourseAssessmentDetails.setProfessor(courseAssessmentDetails.getProfessor());

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
                Professor exiProfessor = optionalProfessor.get();
            }
            courseAssessmentDetailsRepository.save(existingCourseAssessmentDetails);

            return ResponseEntity.status(200).body("Updated");
        } else {
            return ResponseEntity.status(404).body("Not Found");
        }
    }
    
}


    