package com.zbilski.rentacar.dto;

public class CarDto {
    private String brand;
    private String model;
    private String classification;
    private String plates;
    private Integer productionYear;
    private Integer mileage;
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

    public String getBrand() {
        return brand;
    }

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
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", classification='" + classification + '\'' +
                ", plates='" + plates + '\'' +
                ", productionYear=" + productionYear +
                ", mileage=" + mileage +
                ", deadline='" + deadline + '\'' +
                '}';
    }
}
