package fr.nexworld.apicommande.controllers;

import fr.nexworld.apicommande.entities.Commande;
import fr.nexworld.apicommande.services.CommandeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/commandes")
public class CommandeController {

    private CommandeService commandeService;

    @Autowired
    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping("/{id}")
    Commande get(@PathVariable Long id) {
        return this.commandeService.get(id);
    }

    @GetMapping
    List<Commande> getAll() {
        return this.commandeService.getAll();
    }

    @PostMapping
    Commande post(@RequestBody Commande commande) {
        return this.commandeService.post(commande);
    }

    @PutMapping("/{id}")
    Commande put(@RequestBody Commande commande, @PathVariable Long id) {
        return this.commandeService.put(commande, id);
    }
}