package org.factoriaf5.gohome.controller;

import org.factoriaf5.gohome.repositories.Client;
import org.factoriaf5.gohome.repositories.ClientRepository;
import org.factoriaf5.gohome.repositories.GoHomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClientController {

    private ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {

        this.clientRepository = clientRepository;
    }

    @GetMapping("/homes/clientlist")
    String listClient(Model model) {
        List<Client> clients = (List<Client>) clientRepository.findAll();
        model.addAttribute("title", "Lista de Clientes");
        model.addAttribute("clients", clients);
        return "homes/clientlist";
    }

    @GetMapping("/homes/info")
    String newClient(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        model.addAttribute("title", "Solicitar Información");
        return "homes/info";
    }

    @PostMapping("/homes/info")
    String addClient(@ModelAttribute Client client) {
        clientRepository.save(client);
        return "redirect:/homes";
    }
}
