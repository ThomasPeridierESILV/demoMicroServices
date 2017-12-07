package fr.nexworld.serverspringboot.service;

import fr.nexworld.serverspringboot.entities.Client;

import java.util.List;

public interface ClientService {
    
    Client get(Long id);

    List<Client> getAll();

    Client post(Client client);

    Client put(Client client, Long id);
}
