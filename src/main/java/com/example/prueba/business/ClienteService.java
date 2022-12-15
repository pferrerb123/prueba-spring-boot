package com.example.prueba.business;

import com.example.prueba.bean.Cliente;

public interface ClienteService {
	
	// Save operation
    Cliente saveCliente(Cliente cliente);
 

    // Update operation
    Cliente getCliente(int codigoUnico);




}
