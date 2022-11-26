package com.backend.rest;

import com.backend.model.Estado;
import com.backend.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/estado/")
public class EstadoREST {
    @Autowired
    private EstadoService estadoService;
    @GetMapping
    private ResponseEntity<List<Estado>> getAllEstados (){
        return ResponseEntity.ok(estadoService.findAll());
    }

    @PostMapping
    private ResponseEntity<Estado> saveEstado (@RequestBody Estado estado){
        try {
            Estado estadoSave = estadoService.save(estado);
            return ResponseEntity.created(new URI("/estado/" + estadoSave.getId())).body(estadoSave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @DeleteMapping (value="delete/{id}")
    private ResponseEntity<Boolean> deleteEstado(@PathVariable ("id") Long id){
        estadoService.deleteById(id);
        return ResponseEntity.ok(estadoService.findById(id).isEmpty());
    }
}
