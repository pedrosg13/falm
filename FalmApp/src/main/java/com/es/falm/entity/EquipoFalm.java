package com.es.falm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "equiposfalm")
public class EquipoFalm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String nombre;
	
	@OneToMany(targetEntity = Jugador.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Jugador> jugadores;
	
	@Column
	private double puntuacionTotal;
	
	@Column
	private double beneficio;
	
	@OneToMany(targetEntity = Usuario.class,cascade = CascadeType.ALL)
	private List<Usuario> usuarios;	 

}
