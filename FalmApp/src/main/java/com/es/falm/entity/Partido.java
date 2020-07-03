package com.es.falm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "partidos")
public class Partido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne(targetEntity = Jornada.class,fetch = FetchType.EAGER)
	private Jornada jornada;	
	@Column
	private int idEquipoLocal;	
	@Column
	private int idEquipoVisitante;	


}
