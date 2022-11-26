package com.backend.rest;

import com.backend.model.Empresa;
import com.backend.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/empresa/")
public class EmpresaREST {
    @Autowired
    private EmpresaService empresaService;
    @GetMapping
    private ResponseEntity<List<Empresa>> getAllEmpresas (){
        return ResponseEntity.ok(empresaService.findAll());
    }

    @PostMapping
    private ResponseEntity<Empresa> saveempresa (@RequestBody Empresa empresa){
        try {
            Empresa empresaSave = empresaService.save(empresa);
            return ResponseEntity.created(new URI("/empresa/" + empresaSave.getId())).body(empresaSave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @DeleteMapping (value="delete/{id}")
    private ResponseEntity<Boolean> deleteEmpresa(@PathVariable ("id") Long id){
        empresaService.deleteById(id);
        return ResponseEntity.ok(empresaService.findById(id).isEmpty());
    }
}
