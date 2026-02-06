package com.example.demo.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("l'id cercato" + id + "non è trovato");
    }
}
