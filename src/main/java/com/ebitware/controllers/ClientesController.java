package com.ebitware.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebitware.models.Clientes;
import com.ebitware.services.ClientesServices;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	ClientesServices clientesServices;
	
	@GetMapping()
	public List<Clientes> obtenerClientes(){
		return clientesServices.obtenerTodosClientes();
	}
	
	@PostMapping()
	private ResponseEntity<?> guardarCliente(@RequestBody Clientes cliente) {
		
		List<Clientes> validarRegistrosDuplicados = this.clientesServices.obtenerTodosClientes();
		
		 for (Clientes clienteValidar: validarRegistrosDuplicados) {

	            if (clienteValidar.getNombre_Usuario().equals(cliente.getNombre_Usuario())) {
	            	return new ResponseEntity<>(
	  			          "El nombre de usuario ya existe!", 
	  			          HttpStatus.BAD_REQUEST);
	            }
	            if (clienteValidar.getCorreo_Electronico().equals(cliente.getCorreo_Electronico())) {
	            	return new ResponseEntity<>(
	            			"El correo electronico ya existe!",
	  			          HttpStatus.BAD_REQUEST);
	            }
	        }
		 
		 	cliente.setFecha_Creacion(new Date());
		 
		return ResponseEntity.status(HttpStatus.CREATED).body(clientesServices.guardarCliente(cliente));
		
	}
	
	@GetMapping(path = "/{cliente_Id}")
	public Optional<Clientes> obtenerClientePorId(@PathVariable("cliente_Id") String cliente_Id ){
		return this.clientesServices.obtenerPorId(cliente_Id);
	}
	
	
	@PutMapping (path = "/{cliente_Id}")
	public ResponseEntity<?> modificarCliente(@RequestBody Clientes cliente, @PathVariable String cliente_Id) {
		Optional<Clientes> o = clientesServices.obtenerPorId(cliente_Id);
		
		if(o.isEmpty()) {
			ResponseEntity.notFound().build();
		}
		
		Clientes clienteBD = o.get();
		clienteBD.setPeso(cliente.getPeso());
		clienteBD.setFecha_Actualizacion( new Date());
		return ResponseEntity.status(HttpStatus.CREATED).body(clientesServices.guardarCliente(clienteBD));
	}
}
