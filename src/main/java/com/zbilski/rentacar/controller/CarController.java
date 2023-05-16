package com.zbilski.rentacar.controller;

import com.zbilski.rentacar.dto.CarDto;
import com.zbilski.rentacar.model.Car;
import com.zbilski.rentacar.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


     @GetMapping("/add-car")
      public String getCarPage(Model model){
         CarDto carDto = new CarDto();
         model.addAttribute(carDto);
      return "/index.html";
      }
    @PostMapping("/add-car")
    public String addCar(CarDto carDto) {
        // System.out.println(carDto);
        carService.addCar(carDto);
         return "/index.html";
    }

    @GetMapping("/see-car")
    public String getListPage(Model model){
        List<Car> cars = carService.getCars();
        System.out.println(cars);
        model.addAttribute("cars",cars);  //model kontener
        return "car-list.html";

    }



}
