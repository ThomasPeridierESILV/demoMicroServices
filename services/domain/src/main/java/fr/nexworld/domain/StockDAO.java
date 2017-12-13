package fr.nexworld.domain;

public class StockDAO {

    private Long id;

    private ProduitDAO produit;
    private Long quantite;
    private Float prixMoyenPondere;

    public Long getId() {
        return id;
    }

    public StockDAO setId(Long id) {
        this.id = id;
        return this;
    }

    public ProduitDAO getProduit() {
        return produit;
    }

    public StockDAO setProduit(ProduitDAO produit) {
        this.produit = produit;
        return this;
    }

    public Long getQuantite() {
        return quantite;
    }

    public StockDAO setQuantite(Long quantite) {
        this.quantite = quantite;
        return this;
    }

    public Float getPrixMoyenPondere() {
        return prixMoyenPondere;
    }

    public StockDAO setPrixMoyenPondere(Float prixMoyenPondere) {
        this.prixMoyenPondere = prixMoyenPondere;
        return this;
    }
}
