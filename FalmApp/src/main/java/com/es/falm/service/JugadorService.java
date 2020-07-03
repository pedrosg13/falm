package com.es.falm.service;

import com.es.falm.entity.Jugador;

public interface JugadorService {

	public Jugador findByNameOrSurname(String name, String surname);

	public Jugador findById(int id);

	public void createJugador(Jugador jugador);

	public void updateJugador(Jugador jugador);

	public void deleteJugador(Jugador jugador);

	public void loadFromFile(String fileLocation);

}
