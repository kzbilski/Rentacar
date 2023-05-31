package com.zbilski.rentacar.controller;

import com.zbilski.rentacar.dto.CarDto;
import com.zbilski.rentacar.model.Car;
import com.zbilski.rentacar.service.CarService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


     @GetMapping("/add-car")
      public String getCarPage(Model model, Integer id){
        // System.out.println("ID DO EDYCJI: " + id);
        //parametr id jest opcjonalny, domyślnie null.
         // Jeśłi wynosi null to dodajemy nowy samochód. Jeśli nie to edytujemy
         CarDto carDto;
         if (id==null) {
             carDto = new CarDto();
            // System.out.println();
         } else {

             carDto = carService.getCar(id);

         }

         model.addAttribute("car",carDto);
      return "/car-form.html";
      }

    @PostMapping("/add-car")
    public String addCar(@Valid @ModelAttribute("car") CarDto carDto, BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            System.out.println(carDto);
            carService.addCar(carDto);
            return "redirect:/see-car";
        }

        return "/car-form.html";
    }

    @GetMapping("/see-car")
    public String getListPage(Model model){
        List<Car> cars = carService.getCars();
        System.out.println(cars);
        model.addAttribute("cars",cars);  //model kontener
        return "car-list.html";

    }



}
