package com.es.falm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.es.falm.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

}
