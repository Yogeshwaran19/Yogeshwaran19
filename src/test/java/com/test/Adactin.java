package com.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Adactin {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseClass bc = new BaseClass();
		Baseclass1 bc1 = new Baseclass1();

		bc.getDriver();
		bc.loadUrl("http://www.adactinhotelapp.com/");
		bc.maximize();

		WebElement txtUserName = bc.findelementbyId("username");
		bc.type(txtUserName, "yogesh1906");
		String userName = bc.getAtribute(txtUserName);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 0, 0, userName);
		
		WebElement txtPass = bc.findelementbyId("password");
		bc.type(txtPass, "yogesh1906");
		String pass = bc.getAtribute(txtPass);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 1, 0, pass);
		
		WebElement btnLog = bc.findelementbyId("login");
		bc.click(btnLog);
		Thread.sleep(4000);

		WebElement dDnLocation = bc.findelementbyId("location");
		bc.selectByIndex(dDnLocation, 3);
		String locationText = bc.getAtribute(dDnLocation);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 2, 0, locationText);

		WebElement dDnHotel = bc.findelementbyId("hotels");
		bc.selectByIndex(dDnHotel, 2);
		String hoteltxt = bc.getAtribute(dDnHotel);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 3, 0, hoteltxt);

		WebElement dDnRoomType = bc.findelementbyId("room_type");
		bc.selectByIndex(dDnRoomType, 2);
		String roomTypetxt = bc.getAtribute(dDnRoomType);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 4, 0, roomTypetxt);

		WebElement dDnNumRoom = bc.findelementbyId("room_nos");
		bc.selectByIndex(dDnNumRoom, 2);
		String roomcount = bc.getAtribute(dDnNumRoom);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 5, 0, roomcount);

		WebElement dDnAdult = bc.findelementbyId("adult_room");
		bc.selectByIndex(dDnAdult, 3);
		String adultCount = bc.getAtribute(dDnAdult);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 6, 0, adultCount);

		WebElement dDnChildRoom = bc.findelementbyId("child_room");
		bc.selectByIndex(dDnChildRoom, 0);
		String childCount = bc.getAtribute(dDnChildRoom);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 7, 0, childCount);

		WebElement btnSubmit = bc.findelementbyId("Submit");
		bc.click(btnSubmit);

		WebElement hotelSelect = bc.findElementByXpath("//input[@id='radiobutton_0']");
		bc.click(hotelSelect);
		WebElement btnContinue = bc.findelementbyId("continue");
		bc.click(btnContinue);

		WebElement txtFirstname = bc.findelementbyId("first_name");
		bc.type(txtFirstname, "Yogesh");
		String firstName = bc.getAtribute(txtFirstname);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 8, 0, firstName);

		WebElement txtLastName = bc.findelementbyId("last_name");
		bc.type(txtLastName, "Waran");
		String lastName = bc.getAtribute(txtLastName);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 9, 0, lastName);

		WebElement txtAddress = bc.findelementbyId("address");
		bc.type(txtAddress, "Chennai");
		String address = bc.getAtribute(txtAddress);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 10, 0, address);

		WebElement dDnCardType = bc.findelementbyId("cc_type");
		bc.selectByIndex(dDnCardType, 2);
		String cardType = bc.getAtribute(dDnCardType);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 11, 0, cardType);

		WebElement txtCcNum = bc.findelementbyId("cc_num");
		bc.type(txtCcNum, "5612456132147894");
		String ccNum = bc.getAtribute(txtCcNum);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 12, 0, ccNum);

		WebElement dDnccExpMon = bc.findelementbyId("cc_exp_month");
		bc.selectByIndex(dDnccExpMon, 6);
		String ccExpMon = bc.getAtribute(dDnccExpMon);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 13, 0, ccExpMon);

		WebElement dDnccExpYear = bc.findelementbyId("cc_exp_year");
		bc.selectByIndex(dDnccExpYear, 2);
		String ccExpYear = bc.getAtribute(dDnccExpYear);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 14, 0, ccExpYear);

		WebElement txtCVV = bc.findelementbyId("cc_cvv");
		bc.type(txtCVV, "325");
		String cvv = bc.getAtribute(txtCVV);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 15, 0, cvv);

		WebElement btnBook = bc.findelementbyId("book_now");
		bc.click(btnBook);

		Thread.sleep(10000);
		WebElement orderNo = bc.findElementByXpath("//input[@id='order_no']");
		String prnt = bc.getAtribute(orderNo);
		bc1.writeData("D:\\Tasks yogesh\\Excelomr\\excel\\Adactin.xlsx", "sheet1", 16, 0, prnt);

	}

}
