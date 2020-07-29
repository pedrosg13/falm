package com.es.falm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.es.falm.entity.EquipoFalm;

@Repository
public interface EquipoFalmRepository extends JpaRepository<EquipoFalm,Integer>{	
	
	public EquipoFalm findByNombre(String nombre);
	
}
