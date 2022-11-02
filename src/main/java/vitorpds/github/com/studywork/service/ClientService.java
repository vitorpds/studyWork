package vitorpds.github.com.studywork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vitorpds.github.com.studywork.dto.ClientDTO;
import vitorpds.github.com.studywork.entities.Client;
import vitorpds.github.com.studywork.repositories.ClientRepository;
import vitorpds.github.com.studywork.service.translate.ClientTranslator;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientTranslator clientTranslator;

    public ClientDTO save(ClientDTO clientdto) {
        Client client = clientTranslator.from(clientdto);
        client = clientRepository.save(client);
        return clientTranslator.to(client);
    }
}
