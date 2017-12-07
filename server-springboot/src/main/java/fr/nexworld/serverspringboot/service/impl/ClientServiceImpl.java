package fr.nexworld.serverspringboot.service.impl;

import fr.nexworld.serverspringboot.entities.Client;
import fr.nexworld.serverspringboot.repository.ClientRepository;
import fr.nexworld.serverspringboot.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    
    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public Client get(Long id) {
        return clientRepository.findOne(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client post(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client put(Client client, Long id) {
        client.setId(id);
        return clientRepository.save(client);
    }
}
