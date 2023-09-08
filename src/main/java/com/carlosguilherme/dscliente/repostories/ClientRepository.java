package com.carlosguilherme.dscliente.repostories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosguilherme.dscliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
