package fr.nexworld.domain;

public class ProduitDAO {

    private Long id;

    private String nom;


    public Long getId() {
        return id;
    }

    public ProduitDAO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNom() {
        return nom;
    }

    public ProduitDAO setNom(String nom) {
        this.nom = nom;
        return this;
    }
}
