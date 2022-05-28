package pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass;

public class ConfirmBooking extends BaseClass {
	public ConfirmBooking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "order_no")
	private WebElement orderNo;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement btnItinerary;

	

	public WebElement getOrderNo() {
		return orderNo;
	}



	public WebElement getBtnItinerary() {
		return btnItinerary;
	}



	public void confirmBooking(String sheetName, int  rowNum, int cellNum) throws IOException, InterruptedException {
		sleep(8000);
		String text = getAtribute(orderNo);
		writeData(sheetName, rowNum, cellNum, text);
		click(btnItinerary);
		
	}

}
