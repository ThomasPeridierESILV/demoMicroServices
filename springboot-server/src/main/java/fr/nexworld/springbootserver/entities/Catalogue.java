package fr.nexworld.springbootserver.entities;

import javax.persistence.*;

@Entity
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Produit produit;

    private Float prix;

    private Boolean disponible;

    public Long getId() {
        return id;
    }

    public Catalogue setId(Long id) {
        this.id = id;
        return this;
    }

    public Produit getProduit() {
        return produit;
    }

    public Catalogue setProduit(Produit produit) {
        this.produit = produit;
        return this;
    }

    public Float getPrix() {
        return prix;
    }

    public Catalogue setPrix(Float prix) {
        this.prix = prix;
        return this;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public Catalogue setDisponible(Boolean disponible) {
        this.disponible = disponible;
        return this;
    }
}
