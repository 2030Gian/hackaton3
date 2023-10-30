package com.example.hakaton2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.hakaton2.repositorios.ProfessorRepository;
import com.example.hakaton2.entidades.Professor;

import java.util.List;
import java.util.Optional;
@RestController("ProfessorController")
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired ProfessorRepository professorRepository;

    /*
    @GetMapping
    public ResponseEntity<List<Professor>> professors(){
        List<Professor> professors = professorRepository.findAll();
        return new ResponseEntity<>(professors, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> professor(@RequestBody Professor professor){
        professorRepository.save(professor);
        return  ResponseEntity.status(201).body("Create professor");


    }
    */
    
}
