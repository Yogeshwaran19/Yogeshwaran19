package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinJUnit {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void afterClass() {
		driver.quit();
	}

	@Before
	public void beforeMethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
	}

	@Test
	public void test() {

		WebElement txtUserName = driver.findElement(By.id("http://www.adactinhotelapp.com/"));
		txtUserName.sendKeys("yogesh1906");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("yogesh1906");
		WebElement btnLogIn = driver.findElement(By.id("login"));
		btnLogIn.click();

	}

	@After
	public void afterMethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
	}

}
