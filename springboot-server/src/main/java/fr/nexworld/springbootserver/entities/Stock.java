package fr.nexworld.springbootserver.entities;

import javax.persistence.*;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Produit produit;
    
    private Long quantite;
    
    private Float prixMoyenPondere;

    public Long getId() {
        return id;
    }

    public Stock setId(Long id) {
        this.id = id;
        return this;
    }

    public Produit getProduit() {
        return produit;
    }

    public Stock setProduit(Produit produit) {
        this.produit = produit;
        return this;
    }

    public Long getQuantite() {
        return quantite;
    }

    public Stock setQuantite(Long quantite) {
        this.quantite = quantite;
        return this;
    }

    public Float getPrixMoyenPondere() {
        return prixMoyenPondere;
    }

    public Stock setPrixMoyenPondere(Float prixMoyenPondere) {
        this.prixMoyenPondere = prixMoyenPondere;
        return this;
    }
}
