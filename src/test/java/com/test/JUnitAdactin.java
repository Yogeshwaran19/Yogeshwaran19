package com.test;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class JUnitAdactin extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		loadUrl("http://www.adactinhotelapp.com/");
		maximize();
		
	}
	@AfterClass
	public static void afterclass() {
	
	}
	
	@Test
	public void test1() throws IOException, InterruptedException {
		WebElement txtUserName = findelementbyId("username");
		String data = getData("Sheet1", 0, 0);
		type(txtUserName, data);
		String userName = getAtribute(txtUserName);
		Assert.assertEquals("Verify Username", data, userName);
		
		WebElement txtPassword = findelementbyId("password");
		String data2 = getData("Sheet1", 1, 0);
		type(txtPassword, data2);
		String password = getAtribute(txtPassword);
		Assert.assertEquals("Verify Password", data2, password);
		
		WebElement btnLogin = findelementbyId("login");
		click(btnLogin);
		
		String title = getTitle();
		boolean titletxt = title.contains("title");
		Assert.assertTrue("Verify title", true);
		
		sleep(4000);
		
		WebElement dDnLocation = findelementbyId("location");
		selectByIndex(dDnLocation, 2);
		
		WebElement dDnhotel = findelementbyId("hotels");
		selectByIndex(dDnhotel, 3);
		
		WebElement dDnRoomType = findelementbyId("room_type");
		selectByIndex(dDnRoomType, 2);
		
		WebElement dDnRoomNo = findelementbyId("room_nos");
		selectByIndex(dDnRoomNo, 2);
		
		WebElement dDnAdult = findelementbyId("adult_room");
		selectByIndex(dDnAdult, 3);
		
		WebElement dDnChild = findelementbyId("child_room");
		selectByIndex(dDnChild, 0);
		
		WebElement btnSubmit = findelementbyId("Submit");
		click(btnSubmit);
		
		WebElement btnHotelName = findElementByXpath("//input[@id='radiobutton_0']");
		click(btnHotelName);
		
		WebElement btnCont = findelementbyId("continue");
		click(btnCont);
		
		WebElement txtFirstName = findelementbyId("first_name");
		type(txtFirstName, "Yogesh");
		
		WebElement txtLastname = findelementbyId("last_name");
		type(txtLastname, "Waran");
		
		WebElement txtAdd = findelementbyId("address");
		type(txtAdd, "Chennai");
		
		WebElement cardType = findelementbyId("cc_type");
		selectByIndex(cardType, 2);
		
		WebElement ccNum = findelementbyId("cc_num");
		type(ccNum, "1364799463264645");
		
		WebElement ccMonth = findelementbyId("cc_exp_month");
		selectByIndex(ccMonth, 6);
		
		WebElement ccYear = findelementbyId("cc_exp_year");
		selectByIndex(ccYear, 3);
		
		WebElement cvv = findelementbyId("cc_cvv");
		type(cvv, "325");
		
		WebElement btnBook = findelementbyId("book_now");
		click(btnBook);
		
		sleep(8000);
		
		WebElement orderNo = findElementByXpath("//input[@id='order_no']");
		String prntOrder = getAtribute(orderNo);
		writeData("Sheet1", 20, 0, prntOrder);
		
		
		
		
		
	}

}
