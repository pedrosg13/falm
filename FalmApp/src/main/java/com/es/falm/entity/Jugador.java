package com.es.falm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter	
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Jugador {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	@Column
	private String nombre;
	
	@ManyToOne(targetEntity = EquipoFalm.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private EquipoFalm equipoFalm;
	
	@Column
	private String equipo;
	
	@Column
	private String posicion;
	
	@Column
	private Double precio;	
	
	@Column
	private Double puntosTotales;	
	
	@Column
	private int goles;
	
	@Column
	private int expulsiones;	
	
	@Column
	private int estrellas;	
	
	@Column
	private int guiones;	



}
