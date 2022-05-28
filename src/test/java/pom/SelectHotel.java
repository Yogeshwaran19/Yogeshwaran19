package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement btnHotel;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getBtnHotel() {
		return btnHotel;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void hotel() {
		click(btnHotel);
		click(btnContinue);
	}
	
	
	
	
	

}
