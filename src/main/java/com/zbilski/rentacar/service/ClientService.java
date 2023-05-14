package com.zbilski.rentacar.service;

import com.zbilski.rentacar.dto.CarDto;
import com.zbilski.rentacar.dto.ClientDto;
import com.zbilski.rentacar.model.Client;
import com.zbilski.rentacar.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;
    //public ClientService(ClientRepository)

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void addClient(ClientDto clientDto) {
    Client client = new Client (clientDto.getName(), clientDto.getSurname(), clientDto.getBirthdate(), clientDto.getIdentity(), clientDto.getPesel(),
    clientDto.getAddress(), clientDto.getPhone());

    clientRepository.save(client);

}


}
