package Testsuites;

import org.testng.annotations.Test;

import pages.Holiday_filters;

public class Filters 
{
   @Test
	public void filters_testing() throws InterruptedException
   {
	   Holiday_filters hf=new Holiday_filters();
	   hf.hotel_category();
	   hf.budget_filter();
	   hf.duration_filter();
	   hf.sortBy_filter();
	   hf.more_filters();
	   hf.Package_click();
   }
}
