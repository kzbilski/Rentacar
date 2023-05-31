package com.zbilski.rentacar.dto;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;

public class CarDto {
    private Integer id;
    @Size (min=3,message = "Potrzebne minimum 3 znaki")
    private String brand;
    @Size (min=3,message = "Potrzebne minimum 3 znaki")
    private String model;
    @Size (min=3,message = "Potrzebne minimum 3 znaki")
    private String classification;
    @Pattern(regexp = "^[A-Z]{2}\\d{4,5}$", message = "wymagany format tablic jak ZS12345")
    private String plates;
    @Range (min=2000,max=2030, message = "zakres dat od 2000 do 2030")
    private Integer productionYear;
    private Integer mileage;
    @NotEmpty()
    private String deadline;


    public CarDto(String brand, String model, String classification, String plates, Integer productionYear, Integer mileage, String deadline) {
        this.brand = brand;
        this.model = model;
        this.classification = classification;
        this.plates = plates;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.deadline = deadline;
    }

    public CarDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {return brand;}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", classification='" + classification + '\'' +
                ", plates='" + plates + '\'' +
                ", productionYear=" + productionYear +
                ", mileage=" + mileage +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}
