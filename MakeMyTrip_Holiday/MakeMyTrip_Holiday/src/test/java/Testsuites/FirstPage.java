package Testsuites;

import org.testng.annotations.Test;

import pages.Firstpageholiday;

public class FirstPage 
{
   @Test
	public void firstPage_testing() throws InterruptedException
   {
	   Firstpageholiday fp=new Firstpageholiday();
	   fp.openurl();
	   fp.Home();
	   fp.searchbutton();
	   fp.secondpage();
   }
}
