package vitorpds.github.com.studywork.service.translate;

import org.springframework.stereotype.Service;
import vitorpds.github.com.studywork.dto.ClientDTO;
import vitorpds.github.com.studywork.entities.Client;
@Service
public class ClientTranslator {
    public Client from(ClientDTO clientdto) {
        Client client = new Client();
        client.setId(clientdto.getId());
        client.setName(clientdto.getName());
        client.setCpfCnpj(clientdto.getCpfCnpj());
        client.setAddress(clientdto.getAddress());
        client.setDateBirth(clientdto.getDateBirth());
        client.setStatus(clientdto.getStatus());
        return client;
    }

    public ClientDTO to(Client client) {
        ClientDTO clientdto = new ClientDTO();
        clientdto.setId(client.getId());
        clientdto.setAddress(client.getAddress());
        clientdto.setDuaDate(client.getDuaDate());
        clientdto.setCpfCnpj(client.getCpfCnpj());
        clientdto.setStatus(client.getStatus());
        clientdto.setName(client.getName());
        return clientdto;
    }
}
