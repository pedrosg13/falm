package com.es.falm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JugadorDto {
		
	private String nombre;	

	private String apellidos;	
	
	private EquipoFalmDto equipoFalm;
	
	private String equipo;	
	
	private String posicion;
	
	private double precio;		

	private double puntosTotales;	
	
	private int goles;	
	
	private int expusiones;		
	
	private int estrellas;		
	
	private int guiones;	

}
