package com.zbilski.rentacar.service;

import com.zbilski.rentacar.dto.CarDto;
import com.zbilski.rentacar.model.Car;
import com.zbilski.rentacar.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public void addCar(CarDto carDto) {
        System.out.println("dodanie samochodu");
        Car car = new Car (carDto.getBrand(), carDto.getModel(), carDto.getClassification(), carDto.getPlates(),
                carDto.getProductionYear(), carDto.getMileage(), carDto.getDeadline());
        carRepository.save(car);

    }

    public List<Car> getCars(){
       return carRepository.findAll();

    }


}