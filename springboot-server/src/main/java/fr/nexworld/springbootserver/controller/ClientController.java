package fr.nexworld.springbootserver.controller;

import fr.nexworld.springbootserver.entities.Client;
import fr.nexworld.springbootserver.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@CrossOrigin(origins = "*", allowedHeaders ="*")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    Client get(@PathVariable Long id){
        return clientService.get(id);
    }

    @GetMapping
    List<Client> getAll(){
        return clientService.getAll();
    }

    @PostMapping
    Client post(@RequestBody Client client){ return clientService.post(client);}

    @PutMapping("/{id}")
    Client put(@RequestBody Client client, @PathVariable Long id){ return clientService.put(client, id);}
}
