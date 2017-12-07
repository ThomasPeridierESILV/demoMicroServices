package fr.nexworld.serverspringboot;

import fr.nexworld.serverspringboot.entities.*;
import fr.nexworld.serverspringboot.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;

@Component
public class Initializer {

    private CatalogueRepository catalogueRepository;
    private ClientRepository clientRepository;
    private CommandeRepository commandeRepository;
    private ProduitRepository produitRepository;
    private StockRepository stockRepository;

    @Autowired
    public Initializer(CatalogueRepository catalogueRepository,
                       ClientRepository clientRepository,
                       CommandeRepository commandeRepository,
                       ProduitRepository produitRepository,
                       StockRepository stockRepository) {
        this.catalogueRepository = catalogueRepository;
        this.clientRepository = clientRepository;
        this.commandeRepository = commandeRepository;
        this.produitRepository = produitRepository;
        this.stockRepository = stockRepository;

    }

    // Annotation à commenter après la première initialisation
    @PostConstruct
    public void init() {
        System.out.println("In initializer");
        produitRepository.save(
                new Produit()
                        .setNom("Caramel au beurre salé")
        );
        produitRepository.save(
                new Produit()
                        .setNom("Caramel au chocolat")
        );
        produitRepository.save(
                new Produit()
                        .setNom("Caramel au lait")
        );
        produitRepository.save(
                new Produit()
                        .setNom("Caramel praliné")
        );

        catalogueRepository.save(
                new Catalogue()
                        .setProduit(produitRepository.findOne(1L))
                        .setPrix(4f)
                        .setDisponible(true)
        );
        catalogueRepository.save(
                new Catalogue()
                        .setProduit(produitRepository.findOne(2L))
                        .setPrix(5.5f)
                        .setDisponible(true)
        );
        catalogueRepository.save(
                new Catalogue()
                        .setProduit(produitRepository.findOne(3L))
                        .setPrix(3f)
                        .setDisponible(true)
        );
        catalogueRepository.save(
                new Catalogue()
                        .setProduit(produitRepository.findOne(4L))
                        .setPrix(6.5f)
                        .setDisponible(true)
        );

        clientRepository.save(
                new Client()
                        .setNom("Doe")
                        .setPrenom("John")
                        .setAdresse("5 rue de John Doe")
        );
        clientRepository.save(
                new Client()
                        .setNom("Tub")
                        .setPrenom("Guy")
                        .setAdresse("25 rue des clairières")
        );

        stockRepository.save(
                new Stock()
                        .setProduit(produitRepository.findOne(1L))
                        .setPrixMoyenPondere(4f)
                        .setQuantite(40L)
        );
        stockRepository.save(
                new Stock()
                        .setProduit(produitRepository.findOne(2L))
                        .setPrixMoyenPondere(5.5f)
                        .setQuantite(25L)
        );
        stockRepository.save(
                new Stock()
                        .setProduit(produitRepository.findOne(3L))
                        .setPrixMoyenPondere(3f)
                        .setQuantite(60L)
        );
        stockRepository.save(
                new Stock()
                        .setProduit(produitRepository.findOne(4L))
                        .setPrixMoyenPondere(6.5f)
                        .setQuantite(58L)
        );

        commandeRepository.save(
                new Commande()
                        .setClient(clientRepository.findOne(1L))
                        .setProduit(produitRepository.findOne(1L))
                        .setQuantite(10L)
                        .setPrix(catalogueRepository.findOne(1L).getPrix() * 10L)
        );
        commandeRepository.save(
                new Commande()
                        .setClient(clientRepository.findOne(2L))
                        .setProduit(produitRepository.findOne(2L))
                        .setQuantite(5L)
                        .setPrix(catalogueRepository.findOne(2L).getPrix() * 5L)
        );
    }

}
