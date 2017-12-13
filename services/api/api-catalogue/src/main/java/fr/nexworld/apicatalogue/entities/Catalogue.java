package fr.nexworld.apicatalogue.entities;

import javax.persistence.*;

@Entity
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public Catalogue setId(Long id) {
        this.id = id;
        return this;
    }
}
