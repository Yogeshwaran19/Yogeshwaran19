package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Element;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void click(WebElement element) {
		element.click();
	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void closeall() {
		driver.quit();
	}

	public WebElement findelementbyId(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;

	}

	public WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public WebElement findElementByClassname(String name) {
		WebElement element = driver.findElement(By.className(name));
		return element;

	}

	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;

	}

	public void selectByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public void selectValue(WebElement element, String t) {
		Select select = new Select(element);
		select.selectByValue(t);
	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public List<WebElement> getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public List<WebElement> getSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelected = select.getAllSelectedOptions();
	return allSelected;	
	}
	

	public void selectOptionsByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
}

	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public void deSelectIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deselctByVisible(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deSelectValue(WebElement element, String t) {
		Select select = new Select(element);
		select.deselectByValue(t);
	}


	

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getAtribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public List<WebElement> getAllSelect(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public WebElement getFirst(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public void typeJs(String text, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'," + text + ")", element);
	}

	public Object getJSAttribute(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("arguments[0].getAttribute('value')", element);
		return executeScript;
	}

	public void scrollDown(WebElement down) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].ScrollIntoView(true)", down);
	}

	public void scrollUp(WebElement up) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].ScrollIntoView(false)", up);
	}

	public void text(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
	}
	public void clear(WebElement element) {
		element.clear();
	}
	public void accept() {
		Alert al = driver.switchTo().alert();
				al.accept();
	}

	public void dismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();

	}

	public void alertText(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}

	public String alertText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	public void frameid(int index) {
		driver.switchTo().frame(index);

	}

	public void frameWeb(String name) {
		driver.switchTo().frame(name);
	}

	public void framename(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

	public List<WebElement> frame(String text) {
		List<WebElement> findElements = driver.findElements(By.tagName(text));
		return findElements;
	}

	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
		;
	}

	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}

	public void moveToElement(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();

	}

	public void dragDrop(WebElement s, WebElement d) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d);
	}

	public void windowurl(String url) {
		driver.switchTo().window(url);
	}

	public String getWindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getwindows() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public File ss() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		return screenshotAs;
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void navigateUrl(String url) {
		driver.navigate().to(url);
	}
	
	public void sleep(int ms) throws InterruptedException {
		Thread.sleep(ms);
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void quit() {
		driver.quit();
	}
	
	public String getData(String sheetName, int rowNum, int cellNum) throws IOException {

		String res = null;
		File file = new File("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet(sheetName);
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
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
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

	public void writeData(String sheetName, int rowNum, int cellNum, String data) throws IOException {
		File file = new File("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook1 = new XSSFWorkbook(stream);
		Sheet sheet = workbook1.getSheet(sheetName);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook1.write(out);

	}

}
