package fr.nexworld.springbootserver.service;

import fr.nexworld.springbootserver.entities.Commande;

import java.util.List;

public interface CommandeService {

    Commande get(Long id);

    List<Commande> getAll();

    Commande post(Commande commande);

    Commande put(Commande commande, Long id);
}
