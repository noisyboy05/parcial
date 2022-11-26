package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.Horario;

public interface HorarioRepository extends JpaRepository<Horario, Long>{

}