package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_read {

	public static void main(String[] args) throws IOException {

		
		File file = new File("C:\\Users\\Magesh\\eclipse-workspace\\Adactin_Project\\Data set\\Data_read.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cell.getCellType().STRING)) {
			System.err.println(cell.getStringCellValue());
			}
			else if (cellType.equals(cell.getCellType().NUMERIC)) {
					System.err.println(cell.getNumericCellValue());
			}
		}
	}


