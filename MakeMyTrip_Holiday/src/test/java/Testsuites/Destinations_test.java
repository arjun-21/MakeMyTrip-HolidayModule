package Testsuites;

import org.testng.annotations.Test;

import pages.Destinations_themes;

public class Destinations_test {
	@Test
	public void destinatio_testing() throws InterruptedException
	{
	Destinations_themes dt=new Destinations_themes();
    dt.destinationsdomesticsearch();
    dt.destinationsinternationalsearch();
    dt.themessignaturejourneys();
    dt.themeshoneymoonholidays();
    dt.themesfamilyholidays();
    dt.themesoffbeatholidays();
	}

}
