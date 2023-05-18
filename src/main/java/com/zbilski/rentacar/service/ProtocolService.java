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
        //dane w bazie danych sa wyciagane przez repozytorium jako obiekty z pakietu model (maja adnotacje @Entity z hibernate)
        //na bazie tych obiektow budyjeny obiekty DTO ktore transportuje dane do html
        //uzyskanie Reservation -wymaga ID rezerwacji po ktorym wyszkumay w bazie danych przez repozytorium reservationRepository
        Reservation reservation= reservationRepository.findById(reservationId).orElseThrow();   //jak nie znajdzie to wyrzuc wyjatek
        System.out.println(reservation);
        //uzyskanie obiektow car i client
        Car car = reservation.getCar();
        System.out.println(car);
        Client client = reservation.getClient();
        System.out.println(client);
        //uzyskanie carDto ,clientDto
        CarDto carDto = new CarDto(car.getBrand(), car.getModel(), car.getClassification(), car.getPlates(),
                car.getProductionYear(), car.getMileage(), car.getDeadline());
        ClientDto clientDto = new ClientDto(client.getName(), client.getSurname(), client.getBirthdate(),
                client.getIdentity(), client.getPesel(), client.getAddress(), client.getPhone());
        //uzyskanie ReservatioDto -na jej podstawie wiadomo jaki client i car
        ReservationDto  reservationDto = new ReservationDto(reservation.getId(), reservation.getStart(),
                reservation.getEnd(), reservation.getPrice());


        // aby zrobic protocolDto musi byc ClientDto, CarDto, ReservationDto
        ProtocolDto protocolDto = new ProtocolDto(carDto, clientDto, reservationDto);

        return protocolDto;
    }


}


/*
*  modyfikatory|typ zwracany | nazwa z małej litery | (parametry jako zmienne) | { ciało metody zawierajace instrukcje }
* public Car getCar(int carId){
*     return new Car(carId);
* }
*
* typ może być prymitywny: int, long, double, boolean itd.
* każdy inny typ to referencyjny inaczej obiektowy
*  jest z dużej litery od nazwy klasy: Car, String, Client, HomeController
* klasy to jedyna rzecz którą piszemy w javie z dużej litery
*
* deklaracja zmiennej: typ | nazwa
* np: Clint client;
*     int liczba;
*
* do zadeklarowanej zmiennej można coś wstawić.
* do prymitywnej wartość, do obiektowej obiekt
*
* instr. tworzenia obiektu: new | typ referencyjny | (argumenty konstrultora)
*       new Car(10);
*
* stworzyć obiekt i zapisać do zmiennej:
*       Client client = new Client();
*
* przywołanie zmiennej to odniesienie się do jej nazwy (tej z małej litery):
*
* System.out.println(client.getId());
* odnosi się do zmiennej, wywołuje na obiekcie z ta zmienna getera i drukuje to co wyciągnął
* */