package com.es.falm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipoFalmDto {

	private String nombre;		

	private Double puntuacionTotal;	
	
	private Double beneficio;

	public EquipoFalmDto(String nombre) {
		this.nombre = nombre;
	}

	

}
