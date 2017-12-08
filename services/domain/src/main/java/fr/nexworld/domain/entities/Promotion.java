package fr.nexworld.domain.entities;

import javax.persistence.*;

@Entity
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Long getId() {
        return id;
    }

    public Promotion setId(Long id) {
        this.id = id;
        return this;
    }
}
