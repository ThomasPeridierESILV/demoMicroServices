package fr.nexworld.apicommande.services.impl;

import fr.nexworld.domain.entities.Commande;
import fr.nexworld.apicommande.repositories.CommandeRepository;
import fr.nexworld.apicommande.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {

    private CommandeRepository commandeRepository;

    @Autowired
    public CommandeServiceImpl(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Override
    public Commande get(Long id) {
        return this.commandeRepository.findOne(id);
    }

    @Override
    public List<Commande> getAll() {
        return this.commandeRepository.findAll();
    }

    @Override
    public Commande post(Commande commande) {
        return this.commandeRepository.save(commande);
    }

    @Override
    public Commande put(Commande commande, Long id) {
        commande.setId(id);
        return this.commandeRepository.save(commande);
    }
}
