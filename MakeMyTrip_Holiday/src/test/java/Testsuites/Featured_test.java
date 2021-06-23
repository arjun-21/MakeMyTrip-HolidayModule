package Testsuites;

import org.testng.annotations.Test;

import pages.Featured;

public class Featured_test {
	
	@Test
	public void featured_testing() throws InterruptedException
	{
	Featured f=new Featured();    //feature-testing
	f.featuredexpertsrecommended();
	f.featuredbestsellingholidays();
	f.featuredshortbreak();
	f.featuredspecialoffers();
	}
}
