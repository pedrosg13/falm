package com.es.falm.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.es.falm.domain.EquiposEnum;
import com.es.falm.domain.PosicionEnum;
import com.es.falm.entity.EquipoFalm;
import com.es.falm.entity.Jugador;
import com.es.falm.entity.Usuario;


@RunWith(SpringRunner.class)
@DataJpaTest
class EquipoFalmRepositoryITTest {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private JugadorRepository jugadorRepository;
	@Autowired
	private EquipoFalmRepository equipoFalmRepository;

	@Test
	void test() {
		
		EquipoFalm equipo= new EquipoFalm();
		equipo.setNombre("GOLDENBOYS");

		ArrayList<Usuario> usuarios= new ArrayList<Usuario>();		
		Usuario user1= new Usuario();
		user1.setNombre("JJ");
		user1.setPassword("JJ");
		user1.setEquipo(equipo);
		
		Usuario user2= new Usuario();
		user2.setNombre("Alfonso");
		user2.setPassword("Alfonso");
		user2.setEquipo(equipo);
		
		usuarios.add(user1);
		usuarios.add(user2);
		equipo.setUsuarios(usuarios);
		
		Jugador jugador= new Jugador();
		jugador.setNombre("Pacheco");
		jugador.setEquipo(EquiposEnum.Alaves.name());
		jugador.setPosicion(PosicionEnum.PORTERO);
		jugador.setPrecio(10.0);
		jugador.setEquipoFalm(equipo);			
		
		equipo=equipoFalmRepository.save(equipo);
		
		assertEquals(11, equipoFalmRepository.findAll().size());	
		assertEquals(2, usuarioRepository.findAll().size());			
				
		//recuperar jugadores equipo	
		
		List<Jugador> jugadores=jugadorRepository.findByEquipoFalm(equipo);		
		
		assertEquals(1, jugadores.size());
		
	}

	
	@Test
	void testFindByNombre() {
		
		assertNotNull(equipoFalmRepository.findByNombre("GOLDENBOYS"));	
		
	}
		

}
