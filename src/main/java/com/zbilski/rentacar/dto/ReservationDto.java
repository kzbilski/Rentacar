package com.zbilski.rentacar.dto;

public class ReservationDto {
    private int carId;
    private int clientId;
    private String start;
    private String end;
    private double price;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

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
                ", clientId=" + clientId +
                ", start='" + start + '\'' +
                ", koniec='" + end + '\'' +
                ", price=" + price +
                '}';
    }
}
