package com.zbilski.rentacar.dto;

public class ReservationDto {
    private int carId;
    private String carPlates;  //String !!
    private int clientId;
    private String clientName;
    private String start;
    private String end;
    private double price;


    public ReservationDto() {    //przy uzytkowniku z formularza
    }

    public ReservationDto(int carId, String carPlates, int clientId, String clientName, String start, String end, double price) { //przy bazie dancyh
        this.carId = carId;
        this.carPlates = carPlates;
        this.clientId = clientId;
        this.clientName=clientName;
        this.start = start;
        this.end = end;
        this.price = price;
    }

    public String getCarPlates() {
        return carPlates;
    }

    public void setCarPlates(String carPlates) {
        this.carPlates = carPlates;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClientName() {return clientName;}

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;}

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ReservationDto{" +
                "carId=" + carId +
                ", carPlates=" + carPlates +
                ", clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", price=" + price +
                '}';
    }
}
