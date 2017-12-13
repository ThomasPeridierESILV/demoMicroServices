package fr.nexworld.domain;

public class ClientDAO {

    private Long id;

    private String nom;
    private String prenom;
    private String adresse;


    public Long getId() {
        return id;
    }

    public ClientDAO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public ClientDAO setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public String getPrenom() {
        return prenom;
    }

    public ClientDAO setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public String getAdresse() {
        return adresse;
    }

    public ClientDAO setAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }
}
