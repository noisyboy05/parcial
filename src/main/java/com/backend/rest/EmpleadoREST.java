package com.backend.rest;

import com.backend.model.Empleado;
import com.backend.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/empleado/")
public class EmpleadoREST {
    @Autowired
    private EmpleadoService empleadoService;
    @GetMapping
    private ResponseEntity<List<Empleado>> getAllempleados (){
        return ResponseEntity.ok(empleadoService.findAll());
    }

    @PostMapping
    private ResponseEntity<Empleado> saveEmpleado (@RequestBody Empleado empleado){
        try {
            Empleado empleadoSave = empleadoService.save(empleado);
            return ResponseEntity.created(new URI("/empleado/" + empleadoSave.getId())).body(empleadoSave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @DeleteMapping (value="delete/{id}")
    private ResponseEntity<Boolean> deleteempleado(@PathVariable ("id") Long id){
        empleadoService.deleteById(id);
        return ResponseEntity.ok(empleadoService.findById(id).isEmpty());
    }
}
