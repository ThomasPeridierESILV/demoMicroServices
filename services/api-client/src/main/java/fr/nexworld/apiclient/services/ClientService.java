package fr.nexworld.apiclient.services;

import fr.nexworld.domain.entities.Client;

import java.util.List;

public interface ClientService {

    Client get(Long id);

    List<Client> getAll();

    Client post(Client client);

    Client put(Client client, Long id);

}
