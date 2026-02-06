package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Getter
@Setter
@NoArgsConstructor
//faccio la stessa cosa per evitare i loop, escludo utente e postazione nella stampa
@ToString(exclude = {"utente", "postazione"})
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utente_username", nullable = false)
    private Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_codice", nullable = false)
    private Postazione postazione;

    @Column(nullable = false)
    private LocalDate data;

    public Prenotazione (Utente utente, Postazione postazione, LocalDate data) {
        this.utente = utente;
        this.postazione = postazione;
        this.data = data;
}
}
