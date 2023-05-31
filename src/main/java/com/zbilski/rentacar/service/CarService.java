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
        car.setId(carDto.getId());
        carRepository.save(car);

    }

    public List<Car> getCars(){
       return carRepository.findAll();

    }


    public CarDto getCar(Integer id) {
        Car car = carRepository.findById(id).orElseThrow();
        CarDto carDto = new CarDto(car.getBrand(), car.getModel(), car.getClassification(), car.getPlates(),
                car.getProductionYear(), car.getMileage(), car.getDeadline());
        carDto.setId(id);
        return carDto;
    }
}