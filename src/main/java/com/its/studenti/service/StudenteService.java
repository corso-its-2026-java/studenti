package com.its.studenti.service;

import com.its.studenti.entity.Studente;

import java.util.List;

public interface StudenteService {

    String getAll();

    String create(Studente studente);

    String createAvanzata(Studente studente);

    Studente getbyId(int id);

    String deleteById(int id);
}
