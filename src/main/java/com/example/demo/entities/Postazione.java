package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "postazioni")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//per evitare il loop durante la stampa escludo edificio
@ToString(exclude = "edificio")
public class Postazione {

    @Id
    @Column(nullable = false, unique = true)
    private String codice;

    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;

    @Column(name = "posti")
    private int numPostiMax;

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;


}
