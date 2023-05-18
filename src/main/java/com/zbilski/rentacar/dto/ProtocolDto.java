package com.zbilski.rentacar.dto;

import com.zbilski.rentacar.model.Car;
import com.zbilski.rentacar.model.Client;

public class ProtocolDto {
    private CarDto carDto;
    private ClientDto clientDto;
    private ReservationDto reservationDto;

    public ProtocolDto(CarDto carDto, ClientDto clientDto, ReservationDto reservationDto) {
        this.carDto = carDto;
        this.clientDto = clientDto;
        this.reservationDto = reservationDto;
    }

    public CarDto getCarDto() {
        return carDto;
    }

    public ClientDto getClientDto() {
        return clientDto;
    }

    public ReservationDto getReservationDto() {
        return reservationDto;
    }
}
