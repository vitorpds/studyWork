package vitorpds.github.com.studywork.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vitorpds.github.com.studywork.entities.Client;
import vitorpds.github.com.studywork.repositories.ClientRepository;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping
    public Client saveClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }
}

