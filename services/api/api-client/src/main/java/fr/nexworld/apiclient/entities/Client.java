package fr.nexworld.apiclient.entities;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nom;
    private String prenom;
    private String adresse;

    public Long getId() {
        return id;
    }

    public Client setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public Client setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public Client setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public String getAdresse() {
        return adresse;
    }

    public Client setAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }
}
