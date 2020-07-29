package com.es.falm.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.es.falm.dto.ExcelDto;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppServiceTest {

	@Autowired
	private ExcelLoadService excelService;	
	
	@Autowired
	private JugadorService jugadorService;
	
	@Test
	public void testLoadExcel() {

		List<ExcelDto> jugadores=excelService.loadFromFile("src/test/resources/jugadores.xlsx");
		
		jugadorService.saveJugadoresFromExcelDto(jugadores);
		
		jugadorService.findAll().stream().forEach(System.out::println);
	}

}
