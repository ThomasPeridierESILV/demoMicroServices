package fr.nexworld.apisav.entities;

import javax.persistence.*;

@Entity
public class Interne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;


    public Long getId() {
        return id;
    }

    public Interne setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public Interne setNom(String nom) {
        this.nom = nom;
        return this;
    }
}
