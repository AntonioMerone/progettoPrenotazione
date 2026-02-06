package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "utenti")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Utente {

    @Id
    @Column(nullable = false, unique = true)
    private String username;

    @Column(name = "nome")
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

}
