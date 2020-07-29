package com.es.falm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.falm.domain.EquiposEnum;
import com.es.falm.dto.EquipoFalmDto;
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
	ModelMapper mapper;

	@Autowired
	EquipoFalmRepository equipoFalmRepository;

	public Function<ExcelDto, JugadorDto> excelToDtoMapper = e -> {

		JugadorDto j = new JugadorDto();
		j.setNombre(e.getNombre());
		j.setPosicion(e.getPosicion());
		j.setPrecio(e.getPrecio());
		j.setEquipoFalm(new EquipoFalmDto(e.getPropietario()));
		j.setEquipo(e.getEquipo());

		return j;
	};

	public Function<JugadorDto, Jugador> dtoToEntity = d -> {

		Jugador e = new Jugador();
		e.setNombre(d.getNombre());
		e.setPrecio(d.getPrecio());
		e.setPosicion(d.getPosicion());
		e.setEquipo(EquiposEnum.getEnumByString(d.getEquipo()));		
	
		if(d.getEquipoFalm()!=null) {
			e.setEquipoFalm(equipoFalmRepository.findByNombre(d.getEquipoFalm().getNombre()));
		}	
		
		return e;
	};

	public Function<Jugador, JugadorDto> entityToDto = e -> {

		JugadorDto d = new JugadorDto();
		d.setNombre(e.getNombre());
		d.setPrecio(e.getPrecio());
		d.setPosicion(e.getPosicion());
		d.setEquipo(e.getEquipo());
		
		if(e.getEquipoFalm()!=null) {
			d.setEquipoFalm(mapper.map(equipoFalmRepository.findByNombre(e.getEquipoFalm().getNombre()), EquipoFalmDto.class));
		}

		return d;
	};

	public void saveJugadoresFromExcelDto(List<ExcelDto> dtos) {
		dtos.stream().forEach(d -> {
			JugadorDto j = excelToDtoMapper.apply(d);
			repository.save(dtoToEntity.apply(j));
		});
	}

	public List<JugadorDto> findAll(){
		
		return repository.findAll().stream().
		       map(e->entityToDto.apply(e)).collect(Collectors.toList());				 
	}

	public JugadorDto findJugadorById(Integer id) {
		return mapper.map(repository.findById(id), JugadorDto.class);
	}
}
