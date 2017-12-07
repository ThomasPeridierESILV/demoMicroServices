package fr.nexworld.serverspringboot.entities;

import javax.persistence.*;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Produit produit;

    @OneToOne
    private Client client;

    private Float prix;

    private Long quantite;

    public Long getId() {
        return id;
    }

    public Commande setId(Long id) {
        this.id = id;
        return this;
    }

    public Produit getProduit() {
        return produit;
    }

    public Commande setProduit(Produit produit) {
        this.produit = produit;
        return this;
    }

    public Client getClient() {
        return client;
    }

    public Commande setClient(Client client) {
        this.client = client;
        return this;
    }

    public Float getPrix() {
        return prix;
    }

    public Commande setPrix(Float prix) {
        this.prix = prix;
        return this;
    }

    public Long getQuantite() {
        return quantite;
    }

    public Commande setQuantite(Long quantite) {
        this.quantite = quantite;
        return this;
    }
}
