package com.zbilski.rentacar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    private String brand;
    private String model;
    private String classification;
    private String plates;
    private Integer productionYear;
    private Integer mileage;
    private String  deadline;
    public Car(String brand, String model, String classification, String plates, Integer year, Integer mileage, String deadline) {
        this.brand = brand;
        this.model = model;
        this.classification = classification;
        this.plates = plates;
        this.productionYear = year;
        this.mileage = mileage;
        this.deadline = deadline;


    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getClassification() {
        return classification;
    }

    public String getPlates() {
        return plates;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public Integer getMileage() {
        return mileage;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
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
