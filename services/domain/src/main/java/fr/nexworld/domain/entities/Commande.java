package fr.nexworld.domain.entities;

import javax.persistence.*;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Long getId() {
        return id;
    }

    public Commande setId(Long id) {
        this.id = id;
        return this;
    }
}
