package com.zbilski.rentacar.service;

import com.zbilski.rentacar.dto.CarDto;
import com.zbilski.rentacar.dto.ClientDto;
import com.zbilski.rentacar.dto.ProtocolDto;
import com.zbilski.rentacar.dto.ReservationDto;
import com.zbilski.rentacar.model.Car;
import com.zbilski.rentacar.model.Client;
import com.zbilski.rentacar.model.Reservation;
import com.zbilski.rentacar.repository.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ProtocolService {

    private ReservationRepository reservationRepository ;

    public ProtocolService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public ProtocolDto getProtocolDto (int reservationId) {

        Reservation reservation= reservationRepository.findById(reservationId).orElseThrow();   //jak nie znajdzie to wyrzuc wyjatek
        System.out.println(reservation);

        Car car = reservation.getCar();
        System.out.println(car);
        Client client = reservation.getClient();
        System.out.println(client);

        CarDto carDto = new CarDto(car.getBrand(), car.getModel(), car.getClassification(), car.getPlates(),
                car.getProductionYear(), car.getMileage(), car.getDeadline());
        ClientDto clientDto = new ClientDto(client.getName(), client.getSurname(), client.getBirthdate(),
                client.getIdentity(), client.getPesel(), client.getAddress(), client.getPhone());

        ReservationDto  reservationDto = new ReservationDto(reservation.getId(), reservation.getStart(),
                reservation.getEnd(), reservation.getPrice());



        ProtocolDto protocolDto = new ProtocolDto(carDto, clientDto, reservationDto);

        return protocolDto;
    }


}


