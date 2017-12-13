package fr.nexworld.apiproduit.entities;

import javax.persistence.*;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;


    public Long getId() {
        return id;
    }

    public Produit setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public Produit setNom(String nom) {
        this.nom = nom;
        return this;
    }
}
