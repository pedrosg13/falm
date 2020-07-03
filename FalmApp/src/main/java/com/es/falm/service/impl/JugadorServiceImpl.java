package com.es.falm.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.es.falm.entity.Jugador;
import com.es.falm.service.JugadorService;

@Service
public class JugadorServiceImpl implements JugadorService {

	@Override
	public Jugador findByNameOrSurname(String name, String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jugador findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createJugador(Jugador jugador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateJugador(Jugador jugador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteJugador(Jugador jugador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadFromFile(String fileLocation) {
		FileInputStream file;
		Workbook workbook = null;
		try {
			file = new FileInputStream(new File(fileLocation));
			workbook = new XSSFWorkbook(file);
			
			Sheet sheet = workbook.getSheetAt(0);
			 
			Map<Integer, List<String>> data = new HashMap<>();
			int i = 0;
			for (Row row : sheet) {
			    data.put(i, new ArrayList<String>());
			    for (Cell cell : row) {
			      System.out.println(cell);
			    }
			    i++;
			}
			
		} catch (IOException e) {		
			e.printStackTrace();
		}
		finally {
			try {
				workbook.close();
			} catch (IOException e) {			
				e.printStackTrace();
			}
		}

	}

}
