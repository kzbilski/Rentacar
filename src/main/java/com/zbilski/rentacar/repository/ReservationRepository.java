package com.zbilski.rentacar.repository;

import com.zbilski.rentacar.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository <Reservation, Integer>{

}
