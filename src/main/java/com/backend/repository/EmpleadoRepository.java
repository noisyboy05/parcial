package com.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{

}
