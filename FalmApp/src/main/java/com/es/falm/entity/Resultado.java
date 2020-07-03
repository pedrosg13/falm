package com.es.falm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.es.falm.domain.ResultadoEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "resultados")
public class Resultado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String equipoLocal;
	@Column
	private ResultadoEnum resultadoEquipoLocal;
	@Column
	private Double puntuacionEquipoLocal;
	
	@Column
	private String equipoVisitante;
	@Column
	private ResultadoEnum resultadoEquipoVisitante;
	@Column
	private Double puntuacionEquipoVisitante;
	@Column
	private Date fecha;
	@Column
	private int jornada;
	
	

}
