package com.es.falm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.es.falm.entity.Partido;

@Repository
public interface PartidoRepository extends JpaRepository<Partido,Integer>{	
	
}
