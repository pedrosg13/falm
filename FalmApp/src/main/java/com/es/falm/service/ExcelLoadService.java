package com.es.falm.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.es.falm.dto.ExcelDto;

@Service
public class ExcelLoadService {

	public List<ExcelDto> loadFromFile(String fileLocation) {

		List<ExcelDto> dtos = new ArrayList<ExcelDto>();

		FileInputStream file;
		Workbook workbook = null;
		try {
			file = new FileInputStream(new File(fileLocation));
			workbook = new XSSFWorkbook(file);

			Sheet sheet = workbook.getSheetAt(0);

			int i = 0;
			for (Row row : sheet) {
				if (i != 0) {

					ExcelDto dto = new ExcelDto();
					dto.setPosicion(row.getCell(0).getStringCellValue());
					dto.setNombre(row.getCell(1).getStringCellValue());
					dto.setPrecio(row.getCell(2).getNumericCellValue());
					dto.setEquipo(row.getCell(3).getStringCellValue());
					dto.setPropietario(row.getCell(4).getStringCellValue());

					dtos.add(dto);
				}
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return dtos;
	}

}
