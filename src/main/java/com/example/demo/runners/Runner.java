package com.example.demo.runners;


import com.example.demo.entities.*;
import com.example.demo.repositories.PostazioneRepository;
import com.example.demo.repositories.PrenotazioneRepository;
import com.example.demo.services.EdificioService;
import com.example.demo.services.PostazioneService;
import com.example.demo.services.PrenotazioneService;
import com.example.demo.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private EdificioService edificioService;

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    @Autowired
    private PostazioneService postazioneService;

    @Override
    public void run(String... args) throws Exception {

        //creazione edifici
        Edificio edificio = new Edificio("Palazzo_Rotelli", "Via delle rimembranze", "Milano");
        edificioService.saveEdificio(edificio);

        Edificio edificio1 = new Edificio("Palazzo_Palazzi", "via Brombeis", "Napoli");
        edificioService.saveEdificio(edificio1);

        //utenti
        Utente utente = new Utente("Bob54", "Roberto_Roberti", "robertoroberti@roberto.com");
        utenteService.saveUtente(utente);

        Utente utente1 = new Utente("TheChicc", "Giuseppe_Abete", "peppeochic@gmail.com");
        utenteService.saveUtente(utente1);


        //postazioni
        Postazione postazione = new Postazione("P1","Posto al sole", TipoPostazione.OPENSPACE, 40, edificio1);
        postazioneService.savePostazione(postazione);


        //prenotazioni
        Prenotazione prenotazione = new Prenotazione(utente, postazione, LocalDate.now());
        prenotazioneService.savePrenotazione(prenotazione);



    }
}
