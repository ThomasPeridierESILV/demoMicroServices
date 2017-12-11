package fr.nexworld.springbootserver.controller;

import fr.nexworld.springbootserver.entities.Commande;
import fr.nexworld.springbootserver.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandes")
@CrossOrigin(origins = "*", allowedHeaders ="*")
public class CommandeController {

    private CommandeService commandeService;

    @Autowired
    public CommandeController(CommandeService commandeService){
        this.commandeService = commandeService;
    }

    @GetMapping("/{id}")
    Commande get(@PathVariable Long id){
        return commandeService.get(id);
    }

    @GetMapping
    List<Commande> getAll(){
        return commandeService.getAll();
    }

    @PostMapping
    Commande post(@RequestBody Commande commande){ return commandeService.post(commande);}

    @PutMapping("/{id}")
    Commande put(@RequestBody Commande commande, @PathVariable Long id){ return commandeService.put(commande, id);}
}
