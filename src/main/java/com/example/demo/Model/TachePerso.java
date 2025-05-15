package com.example.demo.Model;

import jakarta.persistence.Entity;

import java.awt.*;

@Entity
public class TachePerso extends Tache {

    private Boolean estPerso;

    public TachePerso(Long id, String nom, TextArea description, Boolean estPerso) {
        super(id, nom, description);
        this.estPerso = estPerso;
    }

    public Boolean getEstPerso() {
        return estPerso;
    }

    public void setEstPerso(Boolean estPerso) {
        this.estPerso = estPerso;
    }
}