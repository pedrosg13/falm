package com.es.falm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.es.falm.entity.Jornada;

@Repository
public interface JornadaRepository extends JpaRepository<Jornada,Integer>{	
	
}
