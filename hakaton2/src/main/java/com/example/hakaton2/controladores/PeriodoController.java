package com.example.hakaton2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.http.HttpStatus;
import  org.springframework.http.ResponseEntity;
import  org.springframework.web.bind.annotation.*;


import com.example.hakaton2.entidades.Periodo;
import com.example.hakaton2.repositorios.PeriodoRepository;

import java.util.List;

@RestController("PeriodoController")
@RequestMapping("/periodos")
public class PeriodoController {

    @Autowired PeriodoRepository periodoRepository;

    
    @GetMapping
    public ResponseEntity<List<Periodo>> periodos(){
        List<Periodo> periodos = periodoRepository.findAll();
        return new ResponseEntity<>(periodos,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> periodo(@RequestBody Periodo periodo){
        periodoRepository.save(periodo);
        return ResponseEntity.status(201).body("Create periodo");
    }
    
}

