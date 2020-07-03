package com.es.falm.domain;

import java.util.Map;

import com.es.falm.entity.Jugador;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EquipoLFP {
	
	private String nombre;	
	private Map<String, Jugador> plantilla;

}
