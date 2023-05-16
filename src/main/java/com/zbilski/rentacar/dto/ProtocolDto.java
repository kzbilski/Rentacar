package com.zbilski.rentacar.dto;

import com.zbilski.rentacar.model.Car;
import com.zbilski.rentacar.model.Client;

public class ProtocolDto {
    private Car car;
    private Client client;
    private ReservationDto reservationDto;

    public ProtocolDto(Car car, Client client, ReservationDto reservationDto) {
        this.car = car;
        this.client = client;
        this.reservationDto = reservationDto;
    }

    public Car getCar() {
        return car;
    }

    public Client getClient() {
        return client;
    }

    public ReservationDto getReservationDto() {
        return reservationDto;
    }
}
