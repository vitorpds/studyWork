package vitorpds.github.com.studywork.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vitorpds.github.com.studywork.dto.ClientDTO;
import vitorpds.github.com.studywork.service.ClientService;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ClientDTO saveClient(@Valid @RequestBody ClientDTO clientdto) {
        return clientService.save(clientdto);
    }
}

