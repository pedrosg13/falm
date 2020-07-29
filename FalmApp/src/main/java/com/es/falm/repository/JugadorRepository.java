package com.es.falm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.es.falm.entity.EquipoFalm;
import com.es.falm.entity.Jugador;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador,Integer>{

	public List<Jugador> findByEquipoFalm(EquipoFalm equipo);	
	

}
