package com.its.studenti.service.serviceImpl;

import com.its.studenti.entity.Studente;
import com.its.studenti.service.StudenteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudenteServiceImpl implements StudenteService {

    private List<Studente> studenti = new ArrayList<>();
    public StudenteServiceImpl() {
        Studente studente = new Studente();
        studente.setId(1);
        studente.setNome("Prof");
        studente.setCorso("Spring-boot");
        studenti.add(studente);

        Studente studente2 = new Studente();
        studente2.setId(2);
        studente2.setNome("Antonio");
        studente2.setCorso("Spring-boot");
        studenti.add(studente2);
    }

    @Override
    public List<Studente> getAll() {
        return studenti;
    }

    @Override
    public String create(Studente studente) {

        studenti.add(studente);

        return "Studente creato con successo";
    }

    @Override
    public String createAvanzata(Studente studente) {

        String msg = "";
        boolean studenteTrovato = false;
        if(studente!=null){

            for(Studente studenteLista : studenti){
                if (studente.getId() == studenteLista.getId()) {
                    msg = "Impossibile registrare 2 studenti con lo stesso id";
                    studenteTrovato = true;
                    break;
                }
            }

            if(!studenteTrovato){
                if(studente.getNome()!=null && studente.getCorso()!=null && studente.getId()>0){
                    studenti.add(studente);
                    msg = "Studente registrato com sucesso!";
                } else{
                    msg = "Impossibile registrare studente: valorizzare tutti i campi e inserire un id > 0!";
                }
            }

        } else {
            msg = "Impossibile registrare studente non valorizzato";
        }

        return  msg;
    }
}
