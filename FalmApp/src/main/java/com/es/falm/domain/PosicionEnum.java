package com.es.falm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PosicionEnum {
	
	PORTERO(5,2), DEFENSA(4,1), CENTROCAMPISTA(3,0), DELANTERO(2,0);

	private int puntosGol; 
	private int imbatido; 	
	
	
}
