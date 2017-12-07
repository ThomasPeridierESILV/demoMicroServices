package fr.nexworld.serverspringboot.service.impl;

import fr.nexworld.serverspringboot.entities.Commande;
import fr.nexworld.serverspringboot.repository.CommandeRepository;
import fr.nexworld.serverspringboot.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {
    
    private CommandeRepository commandeRepository;
    
    @Autowired
    public CommandeServiceImpl(CommandeRepository commandeRepository){
        this.commandeRepository = commandeRepository;
    }

    @Override
    public Commande get(Long id) {
        return commandeRepository.findOne(id);
    }

    @Override
    public List<Commande> getAll() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande post(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande put(Commande commande, Long id) {
        commande.setId(id);
        return commandeRepository.save(commande);
    }
}
