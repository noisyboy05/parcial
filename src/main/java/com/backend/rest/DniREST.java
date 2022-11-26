package com.backend.rest;

import com.backend.model.Dni;
import com.backend.service.DniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/dni/")
public class DniREST {

    @Autowired
    private DniService dniService;
    @GetMapping
    private ResponseEntity<List<Dni>> getAllDNIs (){
        return ResponseEntity.ok(dniService.findAll());
    }

    @PostMapping
    private ResponseEntity<Dni> saveDni (@RequestBody Dni dni){
        try {
            Dni dniSave = dniService.save(dni);
            return ResponseEntity.created(new URI("/dni/" + dniSave.getId())).body(dniSave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @DeleteMapping (value="delete/{id}")
    private ResponseEntity<Boolean> deleteDni(@PathVariable ("id") Long id){
        dniService.deleteById(id);
        return ResponseEntity.ok(dniService.findById(id).isEmpty());
    }
}
