package com.example.demo.services;

import com.example.demo.entities.Postazione;
import com.example.demo.entities.TipoPostazione;
import com.example.demo.repositories.PostazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostazioneService {
    private final PostazioneRepository postazioneRepository;

    public PostazioneService(PostazioneRepository postazioneRepository) {
        this.postazioneRepository = postazioneRepository;
    }

    @Autowired

 public void savePostazione(Postazione newPostazione){
        postazioneRepository.save(newPostazione);
        log.info("la postazione" + newPostazione.getCodice()+ "è salvata");
    }

    public List<Postazione> cercaPostazioni(TipoPostazione tipo, String citta) {
        log.info("ricerca posto", tipo,citta);
        return postazioneRepository.findByTipoAndEdificio_Citta(tipo,citta);
    }

}
