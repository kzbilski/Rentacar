package com.zbilski.rentacar.controller;

import com.zbilski.rentacar.dto.ProtocolDto;
import com.zbilski.rentacar.service.ProtocolService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProtocolController {

    private ProtocolService protocolService;

    public ProtocolController(ProtocolService protocolService) {
        this.protocolService = protocolService;
    }

    @GetMapping ("/protocol/{reservationId}")
    public String getProtocol(@PathVariable int reservationId, Model model) {
        System.out.println(reservationId);
        ProtocolDto protocolDto= protocolService.getProtocolDto(reservationId);
        model.addAttribute("protocol",protocolDto);

        //na html rzucamy Dto a na bazie dancych encje (entity)z modelu
       return "protocol.html";
    }

}
