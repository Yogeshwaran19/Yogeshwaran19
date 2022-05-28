package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotel;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnRoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckIn;
	
	@FindBy(id="datepick_out")
	private WebElement txtChechOut;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultPerRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildPerRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtChechOut() {
		return txtChechOut;
	}

	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}

	public WebElement getdDnChildPerRoom() {
		return dDnChildPerRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	public void sHotels(String location,String hotel,String roomType,String noOfRoom, String adultRoom,String childRoom) {
	selectByText(dDnLocation, location);
	selectByText(dDnHotel, hotel);
	selectByText(dDnRoomType, roomType);
	selectByText(dDnRoomNos, noOfRoom);
	selectByText(dDnAdultPerRoom, adultRoom);
	selectByText(dDnChildPerRoom, childRoom);
	click(btnSubmit);
	
	}
	
	
	
	
}
