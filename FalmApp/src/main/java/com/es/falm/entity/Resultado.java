package com.es.falm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Resultado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne( targetEntity = Partido.class)
	private Partido partido;
	
	@Column
	private Double puntosLocal;
	
	@Column
	private Double puntoVisitante;
	
	
	
	

	
	

}
