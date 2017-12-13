package fr.nexworld.domain;

public class PromotionDAO {

    private Long id;

    private ClientDAO clientDAO;
    private Float reduction;


    public Long getId() {
        return id;
    }

    public PromotionDAO setId(Long id) {
        this.id = id;
        return this;
    }

    public ClientDAO getClientDAO() {
        return clientDAO;
    }

    public PromotionDAO setClientDAO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
        return this;
    }

    public Float getReduction() {
        return reduction;
    }

    public PromotionDAO setReduction(Float reduction) {
        this.reduction = reduction;
        return this;
    }
}
