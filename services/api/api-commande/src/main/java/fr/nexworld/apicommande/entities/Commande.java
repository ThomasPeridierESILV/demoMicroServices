package fr.nexworld.apicommande.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long clientId;
    private Long produitId;
    private Date date;
    private Long quantite;
    private Float prix;


    public Long getId() {
        return id;
    }

    public Commande setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getClientId() {
        return clientId;
    }

    public Commande setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }

    public Long getProduitId() {
        return produitId;
    }

    public Commande setProduitId(Long produitId) {
        this.produitId = produitId;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Commande setDate(Date date) {
        this.date = date;
        return this;
    }

    public Long getQuantite() {
        return quantite;
    }

    public Commande setQuantite(Long quantite) {
        this.quantite = quantite;
        return this;
    }

    public Float getPrix() {
        return prix;
    }

    public Commande setPrix(Float prix) {
        this.prix = prix;
        return this;
    }
}
