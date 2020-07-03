package com.es.falm.domain;

import java.util.Map;

import com.es.falm.entity.Jornada;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Liga {
	
	private Map<String, Jornada> jornadas;

}
