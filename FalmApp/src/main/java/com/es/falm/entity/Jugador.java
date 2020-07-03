package com.es.falm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.es.falm.domain.EquiposEnum;
import com.es.falm.domain.PosicionEnum;

import lombok.Getter;
import lombok.Setter;


@Getter	
@Setter
@Entity
public class Jugador {
	
	@Id
	@Column
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private int numero;
	
	@ManyToOne(targetEntity = EquipoFalm.class,fetch = FetchType.EAGER)
	private EquipoFalm equipoFalm;

	@Column
	private EquiposEnum equipo;
	
	@Column
	private PosicionEnum posicion;
	
	@Column
	private double precio;	
	
	@Column
	private double puntosTotales;	
	
	@Column
	private int goles;
	
	@Column
	private int expusiones;	
	
	@Column
	private int estrellas;	
	
	@Column
	private int guiones;	



}
