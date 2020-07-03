package com.es.falm.domain;

import com.es.falm.entity.EquipoFalm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resultado {
	
	private EquipoFalm equipoLocal;
	private ResultadoEnum resultadoEquipoLocal;
	private Double puntuacionEquipoLocal;
	
	private EquipoFalm equipoVisitante;
	private ResultadoEnum resultadoEquipoVisitante;
	private Double puntuacionEquipoVisitante;
	
	
	

}
