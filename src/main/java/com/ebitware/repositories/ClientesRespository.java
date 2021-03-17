package com.ebitware.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ebitware.models.Clientes;

public interface ClientesRespository extends MongoRepository<Clientes, String>{

}
