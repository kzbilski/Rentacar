package com.zbilski.rentacar.service;

import com.zbilski.rentacar.dto.ReservationDto;
import com.zbilski.rentacar.model.Car;
import com.zbilski.rentacar.model.Client;
import com.zbilski.rentacar.model.Reservation;
import com.zbilski.rentacar.repository.CarRepository;
import com.zbilski.rentacar.repository.ClientRepository;
import com.zbilski.rentacar.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {

    private ReservationRepository reservationRepository;
    private CarRepository carRepository;
    private ClientRepository clientRepository;

    public ReservationService(ReservationRepository reservationRepository, CarRepository carRepository,
                              ClientRepository clientRepository) {
        this.reservationRepository = reservationRepository;
        this.carRepository = carRepository;
        this.clientRepository = clientRepository;
    }

    public void addReservation(ReservationDto reservationDto) {
        Car car = carRepository.findById(reservationDto.getCarId()).orElseThrow(); //do obsluzenia wyjatek throw
        Client client  = clientRepository.findById(reservationDto.getClientId()).orElseThrow();
        Reservation reservation = new Reservation(car,client, reservationDto.getStart(),reservationDto.getEnd(),
                reservationDto.getPrice());
        System.out.println(reservation);
        reservationRepository.save(reservation);

    }


    public List<ReservationDto> getReservations() {
            List<Reservation> reservations = reservationRepository.findAll();
            List<ReservationDto> reservationDtos = new ArrayList<>();

        for (Reservation reservation : reservations) {
            ReservationDto reservationDto =new ReservationDto(reservation.getCar().getId(),reservation.getCar().getPlates(),
                    reservation.getClient().getId(), reservation.getClient().getName(), reservation.getStart(), reservation.getEnd(),
                    reservation.getPrice());
            reservationDtos.add(reservationDto);

        }
        return reservationDtos;

    }
}
