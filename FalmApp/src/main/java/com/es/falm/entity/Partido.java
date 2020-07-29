package com.es.falm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Partido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne(targetEntity = Jornada.class, fetch = FetchType.EAGER)
	private Jornada jornada;
	
	@Column
	private Date fecha;
	
	@OneToOne(targetEntity = EquipoFalm.class)
	private EquipoFalm local;
	
	@OneToOne(targetEntity = EquipoFalm.class)
	private EquipoFalm visitante;	

	@OneToOne(targetEntity = Alineacion.class)
	private Alineacion alineacionLocal;
	
	@OneToOne(targetEntity = Alineacion.class)
	private Alineacion alineacionVisitante;
	
	@OneToOne(targetEntity = Resultado.class)
	private Resultado resultado;
}
