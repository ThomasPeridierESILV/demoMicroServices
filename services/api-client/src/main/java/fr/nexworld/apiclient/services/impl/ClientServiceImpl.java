package fr.nexworld.apiclient.services.impl;

import fr.nexworld.domain.entities.Client;
import fr.nexworld.apiclient.repositories.ClientRepository;
import fr.nexworld.apiclient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client get(Long id) {
        return this.clientRepository.findOne(id);
    }

    @Override
    public List<Client> getAll() {
        return this.clientRepository.findAll();
    }

    @Override
    public Client post(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    public Client put(Client client, Long id) {
        client.setId(id);
        return this.clientRepository.save(client);
    }
}
