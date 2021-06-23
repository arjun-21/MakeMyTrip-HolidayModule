package Testsuites;

import org.testng.annotations.Test;

import pages.BookingHotelPage;


public class Bookinghotel_test {
	@Test
	void booking_hotel() throws Exception
	{
		BookingHotelPage bh=new BookingHotelPage();
		bh.selectRooms();
		bh.book();
		bh.packageDetails();
		bh.payments();
	}

}
