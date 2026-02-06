package com.example.demo.services;


import com.example.demo.entities.Utente;
import com.example.demo.repositories.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {
    private final UtenteRepository utenteRepository;

@Autowired
    public UtenteService(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }
    public void saveUtente(Utente newUtente) {
    utenteRepository.save(newUtente);
        log.info("L'utente" + newUtente.getNome() + "è salvato");
    }
}
