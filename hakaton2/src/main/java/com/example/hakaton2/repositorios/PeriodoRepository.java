package com.example.hakaton2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hakaton2.entidades.Periodo;

public interface PeriodoRepository extends JpaRepository<Periodo, Long> {
}
