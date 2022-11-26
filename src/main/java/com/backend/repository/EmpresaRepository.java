package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}