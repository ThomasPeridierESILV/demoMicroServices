package fr.nexworld.apiproduit.entities;

import javax.persistence.*;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Long getId() {
        return id;
    }

    public Produit setId(Long id) {
        this.id = id;
        return this;
    }
}
