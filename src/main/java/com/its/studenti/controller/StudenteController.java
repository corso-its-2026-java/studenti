package com.its.studenti.controller;

import com.its.studenti.entity.Studente;
import com.its.studenti.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/studenti")
public class StudenteController {

    @Autowired
    private StudenteService studenteService;

    @GetMapping("/elenco")
    public List<Studente> getAll() {
        return studenteService.getAll();
    }

    @PostMapping("/salva-studente")
    public String create(@RequestBody Studente studente) {
        return studenteService.create(studente);
    }

    @PostMapping("/salva-studente-avanzato")
    public String createAvanzata(@RequestBody Studente studente) {
        return studenteService.createAvanzata(studente);
    }

}
