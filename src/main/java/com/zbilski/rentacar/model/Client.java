package com.zbilski.rentacar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;
@Entity
public class Client {

    @Id
    @GeneratedValue

    private Integer id;
    private String name;
    private String surname;
    private String birthdate;
    private String identity;
    private String pesel;
    private String address;
    private String phone;

    public Client(){       //pozostaje pusty w hibernate

    }

    public Client(String name, String surname, String birthdate, String identity, String pesel, String address, String phone) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.identity = identity;
        this.pesel = pesel;
        this.address = address;
        this.phone = phone;

    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getIdentity() {
        return identity;
    }

    public String getPesel() {
        return pesel;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }


}
