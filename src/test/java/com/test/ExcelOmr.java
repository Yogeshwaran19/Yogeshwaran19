package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelOmr {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign up']"));
		signUp.click();

		WebElement dDnMonth = driver.findElement(By.xpath("//select[@name='month']"));
		Select select = new Select(dDnMonth);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		// System.out.println(size);

		File file = new File("D:\\Tasks yogesh\\Excelomr\\excel\\Test2.xlsx");

		Workbook workbook = new XSSFWorkbook();

		Sheet sheet = workbook.createSheet("Datas");
		Thread.sleep(5000);
		for (int i = 0; i < size; i++) {

			String text = options.get(i).getText();
			System.out.println(text);

			Row row = sheet.createRow(i);

			Cell cell = row.createCell(0);
			cell.setCellValue(text);

			FileOutputStream out = new FileOutputStream(file);
			workbook.write(out);

		}

	}

}
