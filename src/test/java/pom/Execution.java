package pom;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.test.BaseClass;

import junit.framework.Assert;

public class Execution extends BaseClass {

	@BeforeClass
	public static void browserSetUp() {
		getDriver();
		loadUrl("http://www.adactinhotelapp.com/");
		maximize();
	}

	@Test
	public void searchHotels() throws IOException, InterruptedException {
		LogInPage loginPage = new LogInPage();
		loginPage.logIn(getData("Sheet2", 2, 0), getData("Sheet2", 2, 1));
		Assert.assertEquals("Verify Username", "yogesh1906", getData("Sheet2", 2, 0));

		SearchHotelPage searchHotel = new SearchHotelPage();
		searchHotel.sHotels(getData("Sheet2", 2, 2), getData("Sheet2", 2, 3), getData("Sheet2", 2, 4),
				getData("Sheet2", 2, 5), getData("Sheet2", 2, 8), getData("Sheet2", 2, 9));
		String title1 = getTitle();
		boolean b = title1.contains("Hello");
		Assert.assertTrue("Text", b);
		
		
		SelectHotel selectHotel = new SelectHotel();
		selectHotel.hotel();

		BookHotel bookHotel = new BookHotel();
		bookHotel.bookHotel(getData("Sheet2", 2, 10), getData("Sheet2", 2, 11), getData("Sheet2", 2, 12),
				getData("Sheet2", 2, 13), getData("Sheet2", 2, 14), getData("Sheet2", 2, 15), getData("Sheet2", 2, 17));

		ConfirmBooking confirm = new ConfirmBooking();
		confirm.confirmBooking("Sheet2", 12, 10);

		CancelBooking cancel = new CancelBooking();
		cancel.cancelB(getData("Sheet2", 12, 10));

	}

	@AfterClass
	public static void browserclose() {
		closeall();

	}
}
