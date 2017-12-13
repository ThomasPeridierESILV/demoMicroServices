package fr.nexworld.domain;


public class CatalogueDAO {

    private Long id;

    private ProduitDAO produit;

    private Float prix;

    private Boolean disponible;

    public Long getId() {
        return id;
    }

    public CatalogueDAO setId(Long id) {
        this.id = id;
        return this;
    }

    public ProduitDAO getProduit() {
        return produit;
    }

    public CatalogueDAO setProduit(ProduitDAO produit) {
        this.produit = produit;
        return this;
    }

    public Float getPrix() {
        return prix;
    }

    public CatalogueDAO setPrix(Float prix) {
        this.prix = prix;
        return this;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public CatalogueDAO setDisponible(Boolean disponible) {
        this.disponible = disponible;
        return this;
    }
}
