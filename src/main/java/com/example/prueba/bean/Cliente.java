package com.example.prueba.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@Column(name = "codigounico" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoUnico;
	 

    @Column(name = "numerodocumento", nullable = false, unique = false)
	private String numeroDocumento;
	   
	@Column(name = "tipodocumento", nullable = false, unique = false)
	private String tipoDocumento;	
	
    @Column(name = "nombres", nullable = false, unique = false)
    private String nombres;
      
    @Column(name = "apellidos", nullable = false, unique = false)
    private String apellidos;
   
   
	
	

}
