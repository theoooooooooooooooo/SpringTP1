package com.example.demo.Model;

import jakarta.persistence.Entity;

import java.awt.*;

@Entity
public class TachePro extends Tache {

    private Boolean estPro;

    public TachePro(Long id, String nom, TextArea description, Boolean estPro) {
        super(id, nom, description);
        this.estPro = estPro;
    }

    public Boolean getEstPro() {
        return estPro;
    }

    public void setEstPro(Boolean estPro) {
        this.estPro = estPro;
    }
}