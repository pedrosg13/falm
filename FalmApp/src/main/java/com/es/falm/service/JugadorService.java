package com.es.falm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.falm.domain.EquiposEnum;
import com.es.falm.domain.PosicionEnum;
import com.es.falm.dto.ExcelDto;
import com.es.falm.dto.JugadorDto;
import com.es.falm.entity.Jugador;
import com.es.falm.repository.EquipoFalmRepository;
import com.es.falm.repository.JugadorRepository;
import com.google.common.base.Function;

@Service
public class JugadorService {

	@Autowired
	JugadorRepository repository;
	
	@Autowired
	EquipoFalmRepository equipoFalmRepository;

	public Function<ExcelDto, JugadorDto> excelToDtoMapper = e -> {

		JugadorDto j = new JugadorDto();
		j.setNombre(e.getNombre());
		j.setPosicion(e.getPosicion());
		j.setPrecio(e.getPrecio());
		j.setEquipoFalm(e.getPropietario());
		j.setEquipo(e.getEquipo());

		return j;
	};

	public Function<JugadorDto, Jugador> dtoToEntity = d -> {

		Jugador j = new Jugador();
		j.setNombre(d.getNombre());
		j.setPrecio(d.getPrecio());
		j.setPosicion(PosicionEnum.valueOf(d.getPosicion()));
		j.setEquipo(EquiposEnum.getEnumByString(d.getEquipo()));
		j.setEquipoFalm(equipoFalmRepository.findByNombre(d.getEquipoFalm()));
		return j;
	};

	public void saveJugadoresFromExcelDto(List<ExcelDto> dtos) {
		dtos.stream().forEach(d -> {
			JugadorDto j = excelToDtoMapper.apply(d);
			repository.save(dtoToEntity.apply(j));
		});
	}
	
	public List<Jugador> findAll(){
		return repository.findAll();
	}
}
