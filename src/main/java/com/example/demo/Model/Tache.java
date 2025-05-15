package com.example.demo.Model;

import jakarta.persistence.*;

import java.awt.*;

@Entity
@Table(name = "tache")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;
    private TextArea description;

    public Tache() {}

    public Tache(Long id, String nom, TextArea description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TextArea getDescription() {
        return description;
    }

    public void setDescription(TextArea description) {
        this.description = description;
    }
}