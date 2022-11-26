package com.backend.rest;

import com.backend.model.Tipo_Contrato;
import com.backend.service.Tipo_contratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/contratos/")
public class Tipo_contratoREST {
    @Autowired
    private Tipo_contratoService contratosService;
    @GetMapping
    private ResponseEntity<List<Tipo_Contrato>> getAllcontratoss (){
        return ResponseEntity.ok(contratosService.findAll());
    }

    @PostMapping
    private ResponseEntity<Tipo_Contrato> saveContratos (@RequestBody Tipo_Contrato contratos){
        try {
            Tipo_Contrato contratosSave = contratosService.save(contratos);
            return ResponseEntity.created(new URI("/contratos/" + contratosSave.getId())).body(contratosSave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @DeleteMapping (value="delete/{id}")
    private ResponseEntity<Boolean> deleteContratos(@PathVariable ("id") Long id){
        contratosService.deleteById(id);
        return ResponseEntity.ok(contratosService.findById(id).isEmpty());
    }
}
