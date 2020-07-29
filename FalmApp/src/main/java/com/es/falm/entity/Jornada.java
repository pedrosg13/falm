package com.es.falm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Jornada {

	@Id	
	private int id;	
	
	@Column
	private String nombre;
		
	@OneToMany(targetEntity = Partido.class,cascade = CascadeType.ALL)
	private List<Partido> partidos;
	

}
