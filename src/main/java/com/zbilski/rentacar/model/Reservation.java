package com.zbilski.rentacar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int id;
    private int carId;
    private int clientId;
    @Column(name = "start_date")
    private String start;
    @Column(name = "end_date")
    private String end;
    private double price;


    public Reservation(int carId, int clientId, String start, String end, double price) {
        this.carId = carId;
        this.clientId = clientId;
        this.start = start;
        this.end = end;
        this.price = price;
    }

    public Reservation() {

    }

    public int getId() {
        return id;
    }

    public int getCarId() {
        return carId;
    }

    public int getClientId() {
        return clientId;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", carId=" + carId +
                ", clientId=" + clientId +
                ", start='" + start + '\'' +
                ", koniec='" + end + '\'' +
                ", price=" + price +
                '}';
    }
}
