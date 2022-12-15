package com.example.prueba.bussiness.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.bean.Cliente;
import com.example.prueba.business.ClienteService;
import com.example.prueba.repository.ClienteRepository;

//Annotation
@Service
public class ClienteServiceImpl implements ClienteService {
	
	 @Autowired
	    private ClienteRepository clienteRepository;
	 
	    // Save operation
	    public Cliente saveCliente(Cliente cliente)
	    {
	        return clienteRepository.save(cliente);
	    }
	 
	   
	 
	    // Update operation
	    public Cliente
	    getCliente(int codigoUnico)
	    {
	        Cliente cliDB
	            = clienteRepository.findById(codigoUnico)
	                  .get();
	 
	      
	 
	        return cliDB;
	    }

	 

}
