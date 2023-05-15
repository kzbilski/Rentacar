package com.zbilski.rentacar.service;

import com.zbilski.rentacar.dto.ReservationDto;
import com.zbilski.rentacar.model.Reservation;
import com.zbilski.rentacar.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public void addReservation(ReservationDto reservationDto) {
        Reservation reservation = new Reservation(reservationDto.getCarId(),reservationDto.getClientId(),
                reservationDto.getStart(),reservationDto.getEnd(),reservationDto.getPrice());
        System.out.println(reservation);
        reservationRepository.save(reservation);

    }




}
