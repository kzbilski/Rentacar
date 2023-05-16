package com.zbilski.rentacar.controller;

import com.zbilski.rentacar.dto.ReservationDto;
import com.zbilski.rentacar.model.Car;
import com.zbilski.rentacar.model.Client;
import com.zbilski.rentacar.model.Reservation;
import com.zbilski.rentacar.service.ClientService;
import com.zbilski.rentacar.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReservationController {

    private ReservationService reservationService;
    private ClientService clientService;

    public ReservationController(ReservationService reservationService, ClientService clientService) {
        this.reservationService = reservationService;
        this.clientService = clientService;
    }

    @GetMapping("/add-reservation/{carId}")
    public String getReservationForm(@PathVariable int carId, Model model) {
        List<Client> clients = clientService.getClients();
        System.out.println(clients);
        model.addAttribute("clients", clients);
        model.addAttribute("carId", carId);
        return "reservation.html";


    }


    @PostMapping("/add-reservation")
    public String addReservation(ReservationDto reservationDto) {
        System.out.println(reservationDto);
        reservationService.addReservation(reservationDto);
        return "index.html";
    }

    @GetMapping("/see-reservation")
    public String getListPage(Model model){     //?
        List<ReservationDto> reservations = reservationService.getReservations();
        System.out.println(reservations);
        model.addAttribute("reservations",reservations);  //model kontener
        return "reservation-list.html";

    }



}



