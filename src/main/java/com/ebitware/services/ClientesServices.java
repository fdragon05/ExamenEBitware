package com.ebitware.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebitware.models.Clientes;
import com.ebitware.repositories.ClientesRespository;

@Service
public class ClientesServices {
	
	@Autowired
	ClientesRespository clientesRespository;
	
	public List<Clientes> obtenerTodosClientes() {
		return clientesRespository.findAll();
	}
	
	public Clientes guardarCliente(Clientes cliente) {
		return clientesRespository.save(cliente);
	}
	
	public Optional<Clientes> obtenerPorId(String cliente_Id){
		return clientesRespository.findById(cliente_Id);
	}

}
