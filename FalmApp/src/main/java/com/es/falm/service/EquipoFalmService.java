package com.es.falm.service;

import com.es.falm.entity.EquipoFalm;
import com.es.falm.entity.Jugador;
import com.es.falm.entity.Usuario;

public interface EquipoFalmService {
	
	public EquipoFalm findById(int id);
	
	public EquipoFalm findByNombre(String nombre);
	
	public void create(EquipoFalm equipo);
	
	public void addUsuario(Usuario user,EquipoFalm equipo);
	
	public void addJugador(Jugador user,EquipoFalm equipo);
	
	

}
