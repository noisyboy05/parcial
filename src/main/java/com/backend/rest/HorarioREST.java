package com.backend.rest;

import com.backend.model.Horario;
import com.backend.service.HorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/horarios/")
public class HorarioREST {

    @Autowired
    private HorarioService horarioService;
    @GetMapping
    private ResponseEntity<List<Horario>> getAllHorarios (){
        return ResponseEntity.ok(horarioService.findAll());
    }

    @PostMapping
    private ResponseEntity<Horario> saveHorario (@RequestBody Horario horario){
        try {
            Horario horarioSave = horarioService.save(horario);
            return ResponseEntity.created(new URI("/horario/" + horarioSave.getId())).body(horarioSave);
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @DeleteMapping (value="delete/{id}")
    private ResponseEntity<Boolean> deleteHorario(@PathVariable ("id") Long id){
        horarioService.deleteById(id);
        return ResponseEntity.ok(horarioService.findById(id).isEmpty());
    }
    
}
