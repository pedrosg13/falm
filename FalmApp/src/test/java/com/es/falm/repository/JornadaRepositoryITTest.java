package com.es.falm.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.es.falm.entity.EquipoFalm;
import com.es.falm.entity.Jornada;
import com.es.falm.entity.Partido;
import com.es.falm.entity.Usuario;

@RunWith(SpringRunner.class)
@DataJpaTest
class JornadaRepositoryITTest {
	
	@Autowired
	private JornadaRepository jornadaRepository;
	@Autowired
	private PartidoRepository partidoRepository;
	@Autowired
	private EquipoFalmRepository equipoFalmRepository;

	@Test
	void test() {
		
		//declaro 2 equipos
		EquipoFalm equipoLocal= new EquipoFalm();
		equipoLocal.setNombre("GOLDENBOYS");		
		ArrayList<Usuario> usuariosEquipoLocal= new ArrayList<Usuario>();		
		Usuario user1= new Usuario();
		user1.setName("JJ");
		user1.setPassword("JJ");
		user1.setEquipo(equipoLocal);		
		Usuario user2= new Usuario();
		user2.setName("Alfonso");
		user2.setPassword("Alfonso");
		user2.setEquipo(equipoLocal);
		equipoLocal.setUsuarios(usuariosEquipoLocal);
		
		EquipoFalm equipoVisitante= new EquipoFalm();
		equipoVisitante.setNombre("XAVALEO");		
		ArrayList<Usuario> usuariosEquipoVisitante= new ArrayList<Usuario>();		
		Usuario user3= new Usuario();
		user3.setName("Patri");
		user3.setPassword("PAtri");
		user3.setEquipo(equipoLocal);		
		equipoVisitante.setUsuarios(usuariosEquipoVisitante);
		
		equipoFalmRepository.save(equipoLocal);
		equipoFalmRepository.save(equipoVisitante);
		
		//declaro jornada		
		Jornada jornada= new Jornada();
		jornada.setId(1);
		jornada.setFecha(Calendar.getInstance().getTime());
		
		jornadaRepository.save(jornada);
				
		assertEquals("1",String.valueOf(jornadaRepository.findById(1).get().getId()));
		
		Partido partido= new Partido();
		partido.setJornada(jornada);
		partido.setIdEquipoLocal(1);
		partido.setIdEquipoLocal(equipoLocal.getId());
		partido.setIdEquipoVisitante(equipoVisitante.getId());
		partido.setJornada(jornada);
		
		assertNotNull(partidoRepository.save(partido));			
		
	}

}
