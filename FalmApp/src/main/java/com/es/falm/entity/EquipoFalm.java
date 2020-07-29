package com.es.falm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "equiposfalm")
@NoArgsConstructor
@AllArgsConstructor
public class EquipoFalm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;	
	
	@Column(nullable = true)
	private Double puntuacionTotal;
	
	@Column(nullable = true)
	private Double beneficio;
	
	@OneToMany(targetEntity = Usuario.class,cascade = CascadeType.ALL)
	private List<Usuario> usuarios;	 

}
