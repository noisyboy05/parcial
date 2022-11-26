package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.Dni;

public interface DniRepository extends JpaRepository<Dni, Long>{

}