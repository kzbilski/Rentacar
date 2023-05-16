package com.zbilski.rentacar.model;

import jakarta.persistence.*;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Car car;
    @ManyToOne
    private Client client;
    @Column(name = "start_date")
    private String start;
    @Column(name = "end_date")
    private String end;
    private double price;


    public Reservation(Car car, Client client, String start, String end, double price) {
        this.car = car;
        this.client = client;
        this.start = start;
        this.end = end;
        this.price = price;
    }

    public Reservation() {

    }

    public int getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }

    public Client getClient() {
        return client;
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
                ", car=" + car +
                ", client=" + client +
                ", start='" + start + '\'' +
                ", koniec='" + end + '\'' +
                ", price=" + price +
                '}';
    }
}
