package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Baseclass1 {
	WebDriver driver;

	public String getData(String path, String sheetNum, int rowNum, int cellNum) throws IOException {

		String res = null;
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet("sheetName");
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();

			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
				res = dateFormat.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal d = BigDecimal.valueOf(numericCellValue);
				res = d.toString();

			}

		default:
			break;
		}
		return res;

	}

	public void updateData(String sheetName, int rowNum, int cellNum, String oldData, String newData)
			throws IOException {
		File file = new File("D:\\Tasks yogesh\\Excelomr\\excel\\TaskOMR.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell1 = row.getCell(cellNum);
		String value = cell1.getStringCellValue();
		if (value.equals(oldData)) {
			cell1.setCellValue(newData);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	public void writeData(String path, String sheetName, int rowNum, int cellNum, String data) throws IOException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook1 = new XSSFWorkbook(stream);
		Sheet sheet = workbook1.getSheet(sheetName);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream s = new FileOutputStream(file);
		workbook1.write(s);

	}
}
