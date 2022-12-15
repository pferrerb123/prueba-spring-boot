package com.example.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.bean.Cliente;
import com.example.prueba.business.ClienteService;

@RestController
@RequestMapping("/api/prueba")
public class ClienteController {
	
	@Autowired private ClienteService clienteService;
	
	// Save operation
	@RequestMapping(value = "/cliente/{codigoUnico}", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.CREATED)
	 public Cliente saveCliente(@PathVariable("codigoUnico") int codigoUnico,
		         @RequestBody Cliente cliente)
		    { 
		        cliente.setCodigoUnico(codigoUnico);
		        return clienteService.saveCliente(cliente);

		    }
	    

	 // Update operation
    @GetMapping("/cliente/{codigoUnico}")
    public Cliente
    getCliente(@PathVariable("codigoUnico") int codigoUnico)
    {
        return clienteService.getCliente(codigoUnico);
        
    }
   
	
	
}
