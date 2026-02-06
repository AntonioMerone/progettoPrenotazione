package com.example.demo.services;


import com.example.demo.repositories.PostazioneRepository;
import com.example.demo.repositories.PrenotazioneRepository;
import com.example.demo.repositories.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {
    private final PrenotazioneRepository prenotazioneRepository;
    private final UtenteRepository utenteRepository;
    private final PostazioneRepository postazioneRepository;

    @Autowired
    public PrenotazioneService(PrenotazioneRepository prenotazioneRepository, UtenteRepository utenteRepository, PostazioneRepository postazioneRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
        this.utenteRepository = utenteRepository;
        this.postazioneRepository = postazioneRepository;
    }

}
