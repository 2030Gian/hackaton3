package com.example.hakaton2.controladores;


import org.springframework.beans.factory.annotation.Autowired; // para inyectar el Jpa
import org.springframework.http.HttpStatus;     // para el estado si es 200, 400, 500 etc
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*;

import com.example.hakaton2.entidades.Student; 
import com.example.hakaton2.repositorios.StudentRepository;

import java.util.Optional;
import java.util.List;

@RestController("StudentController")
@RequestMapping("/student")
public class StudentController {

    @Autowired StudentRepository studentRepository; // nos sirve para usar el Jpa para hacer consultas 
    // a nuestra base de datos

    /*
    @GetMapping
    public ResponseEntity<List<Student>> students(){
        List<Student> students = studentRepository.findAll();
        return new ResponseEntity<>(students,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> student(@RequestBody Student student){
        studentRepository.save(student);
        return ResponseEntity.status(201).body("create student");

    }
    */

    
}
