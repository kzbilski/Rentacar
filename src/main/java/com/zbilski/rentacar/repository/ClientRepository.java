package com.zbilski.rentacar.repository;

import com.zbilski.rentacar.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Integer>{

}
