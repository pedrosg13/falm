package com.es.falm.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppServiceTest {

	@Autowired
	private JugadorService jugadorService;

	@Test
	public void testLoadExcel() {

		jugadorService.loadFromFile("src/test/resources/jugadores.xlsx");

	}

}
