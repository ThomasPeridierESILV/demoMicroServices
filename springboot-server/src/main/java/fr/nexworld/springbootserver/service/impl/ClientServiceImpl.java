package fr.nexworld.springbootserver.service.impl;

import fr.nexworld.springbootserver.entities.Client;
import fr.nexworld.springbootserver.repository.ClientRepository;
import fr.nexworld.springbootserver.service.ClientService;
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
        return this.clientRepository.getOne(id);
    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Client post(Client client) {
        return null;
    }

    @Override
    public Client put(Client client, Long id) {
        return null;
    }
}
