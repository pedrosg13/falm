package com.es.falm.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultadoEnum {
	
	VICTORIA(3),VICTORIA_MINIMA(2),EMPATE(1.5),DERROTA_MINIMA(1),DERROTA(0);	
	
	private double puntos;				

}
