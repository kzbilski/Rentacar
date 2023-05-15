package com.zbilski.rentacar.controller;

import com.zbilski.rentacar.dto.CarDto;
import com.zbilski.rentacar.dto.ClientDto;
import com.zbilski.rentacar.model.Client;
import com.zbilski.rentacar.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClientController {

    private ClientService clientService;

    public ClientController (ClientService clientService) {this.clientService = clientService;}
    @GetMapping("/add-client")
    public String getClientPage(Model model){
        ClientDto carDto = new ClientDto();
        model.addAttribute(carDto);
        return "client-form.html";
    }
    @PostMapping("/add-client")
    public String addClient(ClientDto clientDto) {
        // System.out.println(carDto);
        clientService.addClient(clientDto);
        return "index.html";
    }

    @GetMapping("/see-client")
    public String getListPage(Model model) {
        List<Client> clients = clientService.getClients();
        System.out.println(clients);
        model.addAttribute("clients", clients);                      //model kontener
        return "client-list.html";
    }



}
