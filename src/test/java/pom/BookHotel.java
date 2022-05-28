package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass;

public class BookHotel extends BaseClass {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCcNum;
	
	@FindBy(id="cc_type")
	private WebElement dDnCcType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnExpMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement dDnExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtcVV;
	
	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNum() {
		return txtCcNum;
	}

	public WebElement getdDnCcType() {
		return dDnCcType;
	}

	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getTxtcVV() {
		return txtcVV;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	
	public void bookHotel(String firstName,String lastName,String address,String ccNum,String ccType,String ccMonth,String cVV) {
		type(txtFirstName, firstName);
		type(txtLastName, lastName);
		type(txtAddress, address);
		type(txtCcNum, ccNum);
		selectByText(dDnCcType, ccType);
		selectByText(dDnExpMonth, ccMonth);
		selectByText(dDnExpYear, "2022");
		type(txtcVV, cVV);
		click(btnBook);
		
			
		
	}





}
