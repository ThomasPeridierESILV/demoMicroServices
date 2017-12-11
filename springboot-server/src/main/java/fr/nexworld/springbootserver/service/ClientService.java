package fr.nexworld.springbootserver.service;

import fr.nexworld.springbootserver.entities.Client;

import java.util.List;

public interface ClientService {
    
    Client get(Long id);

    List<Client> getAll();

    Client post(Client client);

    Client put(Client client, Long id);
}
