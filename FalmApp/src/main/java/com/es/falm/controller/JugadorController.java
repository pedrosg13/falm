package com.es.falm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.es.falm.dto.ExcelDto;
import com.es.falm.dto.JugadorDto;
import com.es.falm.service.ExcelLoadService;
import com.es.falm.service.JugadorService;

@RestController
public class JugadorController {
	
	@Autowired
	private JugadorService jugadorService;
	
	@Autowired
	private ExcelLoadService excelLoadService;

	@GetMapping("/jugadores/load")
	public ResponseEntity<String> loadDataFromExcel(){
		
		List<ExcelDto> list=excelLoadService.loadFromFile("src/test/resources/jugadores.xlsx");
		
		jugadorService.saveJugadoresFromExcelDto(list);

		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@GetMapping("/jugadores")
	public ResponseEntity<List<JugadorDto>> findAll(){			
		
		return ResponseEntity.ok(jugadorService.findAll());
	}
	
	@GetMapping("/jugadores/{id}")
	public ResponseEntity<JugadorDto> findJugadorById(@PathVariable Integer id){	
			
		return ResponseEntity.ok(jugadorService.findJugadorById(id));
	}
	
}
