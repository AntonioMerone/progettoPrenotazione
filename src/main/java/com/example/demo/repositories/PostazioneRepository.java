package com.example.demo.repositories;

import com.example.demo.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Postazione;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, String> {
    List<Postazione> findByTipoAndEdificioCitta(TipoPostazione tipo, String citta);
}