package com.es.falm.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jornadas")
public class Jornada {

	@Id	
	private int id;	
	@Column
	private Date fecha;
	@OneToMany(targetEntity = Partido.class,cascade = CascadeType.ALL)
	private List<Partido> partidos;
	

}
