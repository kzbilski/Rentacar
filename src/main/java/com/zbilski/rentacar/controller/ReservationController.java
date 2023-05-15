package com.zbilski.rentacar.controller;

import com.zbilski.rentacar.dto.ClientDto;
import com.zbilski.rentacar.dto.ReservationDto;
import com.zbilski.rentacar.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController {

    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/add-reservation/{id}")
    public String getReservationForm(@PathVariable int id, Model model) {
        //System.out.println(id);
        model.addAttribute("id",id);
        return "reservation.html";

    }


    @PostMapping("/add-reservation")
    public String addReservation(ReservationDto reservationDto) {
        System.out.println(reservationDto);
        reservationService.addReservation(reservationDto);
        return "index.html";
    }


}



