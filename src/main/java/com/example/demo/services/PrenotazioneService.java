package com.example.demo.services;

import com.example.demo.entities.Prenotazione;
import com.example.demo.repositories.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {

    private final PrenotazioneRepository prenotazioneRepository;

    @Autowired
    public PrenotazioneService(PrenotazioneRepository prenotazioneRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
    }

    public void savePrenotazione(Prenotazione newPrenotazione) {
        prenotazioneRepository.save(newPrenotazione);
        log.info("Prenotazione salvata:", newPrenotazione);
    }
}

