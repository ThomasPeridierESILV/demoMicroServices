package fr.nexworld.apiclient.controllers;


import fr.nexworld.apiclient.entities.Client;
import fr.nexworld.apiclient.services.ClientService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    Client get(@PathVariable Long id) {
        return this.clientService.get(id);
    }

    @GetMapping
    List<Client> getAll() {
        return this.clientService.getAll();
    }

    @PostMapping
    Client post(@RequestBody Client client) {
        return this.clientService.post(client);
    }

    @PutMapping("/{id}")
    Client put(@RequestBody Client client, @PathVariable Long id) {
        return this.clientService.put(client, id);
    }
	
	@GetMapping("/test")
    String get() {
        return "Hello, this is a Test!";
    }
}