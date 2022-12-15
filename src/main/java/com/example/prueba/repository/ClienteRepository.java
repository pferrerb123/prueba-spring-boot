package com.example.prueba.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba.bean.Cliente;


//Annotation
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {


}
