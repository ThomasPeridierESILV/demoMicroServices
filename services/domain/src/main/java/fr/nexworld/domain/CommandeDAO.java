package fr.nexworld.domain;

import java.util.Date;

public class CommandeDAO {

    private Long id;

    private ClientDAO client;
    private ProduitDAO produit;
    private Date date;
    private Long quantite;
    private Float prix;

    public Long getId() {
        return id;
    }

    public CommandeDAO setId(Long id) {
        this.id = id;
        return this;
    }

    public ClientDAO getClient() {
        return client;
    }

    public CommandeDAO setClient(ClientDAO client) {
        this.client = client;
        return this;
    }

    public ProduitDAO getProduit() {
        return produit;
    }

    public CommandeDAO setProduit(ProduitDAO produit) {
        this.produit = produit;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public CommandeDAO setDate(Date date) {
        this.date = date;
        return this;
    }

    public Long getQuantite() {
        return quantite;
    }

    public CommandeDAO setQuantite(Long quantite) {
        this.quantite = quantite;
        return this;
    }

    public Float getPrix() {
        return prix;
    }

    public CommandeDAO setPrix(Float prix) {
        this.prix = prix;
        return this;
    }
}
