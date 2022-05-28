package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass;

public class CancelBooking extends BaseClass {
	
	public CancelBooking() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="order_id_text")
	private WebElement txtOrderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement btnGo;
	
	@FindBy(name="ids[]")
	private WebElement btnCheckBox;

	@FindBy(name="cancelall")
	private WebElement btnCancelAll;
	
	
	
	public WebElement getTxtOrderId() {
		return txtOrderId;
	}



	public WebElement getBtnGo() {
		return btnGo;
	}



	public WebElement getBtnCheckBox() {
		return btnCheckBox;
	}



	public WebElement getBtnCancelAll() {
		return btnCancelAll;
	}



	public void cancelB(String orderIdNo) {
	type(txtOrderId, orderIdNo);
	click(btnGo);
	click(btnCheckBox);
	click(btnCancelAll);
	accept();

	}
	

}
