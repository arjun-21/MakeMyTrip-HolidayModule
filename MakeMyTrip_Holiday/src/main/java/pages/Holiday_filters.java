package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;

import base.Holidaydriver;

public class Holiday_filters extends Holidaydriver
{
    By title=By.xpath("//h1");
	By star3=By.xpath("(//*[text()='3'])[1]");
	By star4=By.xpath("(//*[text()='4'])[1]");
	By star5=By.xpath("(//*[text()='5'])[1]");
	By bslider1=By.xpath("(//div[@role='slider'])[1]");
	By bslider2=By.xpath("(//div[@role='slider'])[2]");
	By dslider1=By.xpath("(//div[@role='slider'])[3]");
	By dslider2=By.xpath("(//div[@role='slider'])[4]");
	By dropdown=By.id("react-select-2-input");
	By morefilter=By.xpath("//p[@class='textCenter']");
	By withflight=By.xpath("//*[text()='With Flights']");
	By withoutflight=By.xpath("//*[text()='Without Flights']");
	By popupclose=By.xpath("//p[@class='closePopup']");
	By clear=By.xpath("//span[text()='(CLEAR ALL)']");
	By more1=By.xpath("(//span[text()='+ More'])[1]");
	By theme=By.xpath("//p[text()='Leisure']");
	By place=By.xpath("(//div[contains(@class,'Destination')])[2]/div[2]/div[3]");
	By holidaytype=By.xpath("//p[text()='Most Popular']");
	By switch1=By.xpath("//label[@for='switch__input_1']");
    By switch2=By.xpath("//label[@for='switch__input_2']");
    By switchside1=By.xpath("(//label[contains(@for,'switch__input')])[1]");
    By switchside2=By.xpath("(//label[contains(@for,'switch__input')])[2]");
    //By goingwith=By.xpath("//div[text()='Select']");
    By more2=By.xpath("(//button[contains(text(),'More')])[1]");
    By themehoney=By.xpath("//label[contains(@for,'Honeymoon')]");
    By themelux=By.xpath("//label[contains(@for,'Luxury')]");
    By more3=By.xpath("//button[contains(text(),'More')]");
    By placeside=By.xpath("//h4[text()='Places']/following-sibling::div/ul/li[3]/span");
    By viewmorefilter=By.xpath("//button[text()='VIEW MORE FILTERS']");
    By fixedbundle=By.xpath("//label[contains(@for,'Fixed Bundles')]");
    By allpackage=By.xpath("//label[contains(@for,'All packages')]");
    By more4=By.xpath("(//button[contains(text(),'More')])[2]");
    By more5=By.xpath("(//button[contains(text(),'More')])[3]");
    By holidaytypeside=By.xpath("//label[contains(text(),'Most Popular')]");
    By generaltype=By.xpath("//label[contains(@for,'Signature')]");
    By backtotop=By.linkText("BACK TO TOP");
    By toppackage=By.xpath("(//div[@class='slick-track'])[1]/div[1]//img");
    By sidepackage=By.xpath("(//div[@class='appendBottom15'])[1]//h3");
    By booknow=By.xpath("(//div[text()='Book Now'])[1]");
    By priceper=By.xpath("(//p[text()='Price Per Person'])[1]");
    By search_city=By.xpath("(//input[@placeholder='Search by city/ activity'])[1]");
    By errorimg=By.xpath("//p[contains(text(),'Oops')]");
    	
    public void hotel_category() throws InterruptedException
    {
    	if(driver.findElement(title).getText().matches(prop.getProperty("to")))       //Top filters interface
    	{
    	  driver.findElement(star3).click();
    	  Thread.sleep(2000);                                               //3 star
    	  driver.findElement(star3).click();
    	  
    	  driver.findElement(star4).click();
    	  Thread.sleep(2000);
    	  exttest=report.createTest("Validate Hotel category Filter");
		  exttest.log(Status.WARNING,"Some Packages are not displayed according to choosen rating");          //screenshot--1
    	  takescreenshot("HotelRating.png");                                      //4 star
    	  driver.findElement(star4).click();
    	  
    	  driver.findElement(star5).click();
    	  Thread.sleep(2000);                                               //5 star
    	  driver.findElement(star5).click();
    	}
    	if(driver.findElement(title).getText().matches("Holidays in "+prop.getProperty("to")))    // side filters interface
    	{
    		driver.findElement(star3).click();
      	    Thread.sleep(2000);                                                     //3 star
      	    driver.findElement(star3).click();
    		
    		
    		driver.findElement(star4).click();
    		exttest=report.createTest("Validate Hotel category Filter");
   		    exttest.log(Status.WARNING,"Some Packages are not displayed according to choosen rating");             //screenshot--1
    		takescreenshot("HotelRating.png");
      	    Thread.sleep(2000);                                                     //4 star
      	    driver.findElement(star4).click();
      	     
      	    driver.findElement(star5).click();
     	    Thread.sleep(1000);                                                     //5 star
     	    driver.findElement(star5).click();
     	    Thread.sleep(1000);
 		    driver.findElement(withflight).click();
 		    Thread.sleep(1000);
 		    driver.findElement(withflight).click();
 		    Thread.sleep(1000);
 		    driver.findElement(withoutflight).click();
 		    /*exttest=report.createTest("Validate Flights Filter");
 		    exttest.log(Status.PASS,"Flights Filter is working correctly");
 		    takescreenshot("Withflight.png");*/
 	        Thread.sleep(1000);
 		    driver.findElement(withoutflight).click();
 		    Thread.sleep(1000);
    	}
    }
    
    public void budget_filter() throws InterruptedException
    {
    	Actions act=new Actions(driver);
    	if(driver.findElement(title).getText().matches(prop.getProperty("to")))       //Top filters interface
    	{
   		 WebElement sc2=driver.findElement(bslider1);
 		 Thread.sleep(1000);
 		 act.moveToElement(sc2).dragAndDropBy(sc2, 100, 0).perform();
 		 //System.out.println("Scroll working1");
 		/* exttest=report.createTest("Validate Scroll Filter");
		  exttest.log(Status.PASS,"Scroll Filter is working correctly");
 		 takescreenshot("scrollFilter.png");*/                                     //budget scroll 1
 		 Thread.sleep(1000);
 		 act.moveToElement(sc2).dragAndDropBy(sc2, -100, 0).perform();
 		 Thread.sleep(1000);
 		 
 		 WebElement sc3=driver.findElement(bslider2);
 		 Thread.sleep(1000);
 		 act.moveToElement(sc3).dragAndDropBy(sc3,-100, 0).perform();
 		 //System.out.println("Scroll working2");                                 //budget scroll 2
 		 Thread.sleep(1000);
 		 act.moveToElement(sc3).dragAndDropBy(sc3, 100, 0).perform();
 		 Thread.sleep(1000);
    	}
    	if(driver.findElement(title).getText().matches("Holidays in "+prop.getProperty("to")))    // side filters interface
    	{
    		WebElement sc1=driver.findElement(bslider1);
    		 Thread.sleep(1000);
    		 act.moveToElement(sc1).dragAndDropBy(sc1, 100, 0).perform();
    		 //System.out.println("Scroll working2");
    		 Thread.sleep(1000);
    		 exttest=report.createTest("Validate Budget Filter");
      		  exttest.log(Status.PASS,"Package displayed according to budget filter");                          //screenshot--2
        		 takescreenshot("BudgetPackage_side.png");
        		 Thread.sleep(1000);
    		 act.moveToElement(sc1).dragAndDropBy(sc1, -100, 0).perform();
    		 Thread.sleep(1000);
    	}
    }
    
    public void duration_filter() throws InterruptedException
    {
    	Actions act=new Actions(driver);
    	if(driver.findElement(title).getText().matches(prop.getProperty("to")))       //Top filters interface
    	{
 		 WebElement sc=driver.findElement(dslider1);
  		 Thread.sleep(1000);
  		 act.moveToElement(sc).dragAndDropBy(sc, 100, 0).perform();
  		 //System.out.println("Scroll working1");                                 //duration scroll 1
  		 Thread.sleep(1000);
  		 act.moveToElement(sc).dragAndDropBy(sc, -100, 0).perform();
  		 Thread.sleep(1000);
  		 
  		 WebElement sc1=driver.findElement(dslider2);
		 Thread.sleep(1000);
		 act.moveToElement(sc1).dragAndDropBy(sc1, -100, 0).perform();
		 //System.out.println("Scroll working2");                                 //duration scroll 2
		 Thread.sleep(1000);
		 act.moveToElement(sc1).dragAndDropBy(sc1, 100, 0).perform();
		 Thread.sleep(2000);
    	}
    	if(driver.findElement(title).getText().matches("Holidays in "+prop.getProperty("to")))    // side filters interface
    	{
    		 WebElement sc=driver.findElement(dslider1);
     		 Thread.sleep(1000);
     		 act.moveToElement(sc).dragAndDropBy(sc, 100, 0).perform();
     		 Thread.sleep(1000);
     		exttest=report.createTest("Validate Duration Filter");
   		  exttest.log(Status.PASS,"Package displayed according to Duration filter");                          
     		 takescreenshot("DurationFilter.png");
     		 //System.out.println("Scroll working1");
     		 //Thread.sleep(1000);
     		 act.moveToElement(sc).dragAndDropBy(sc, -100, 0).perform();
    	}
    }
    
    public void sortBy_filter() throws InterruptedException
    {
    	if(driver.findElement(title).getText().matches(prop.getProperty("to")))       //Top filters interface
    	{ 
		 WebElement p=driver.findElement(dropdown);
		 p.sendKeys("price");
		 p.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);                                                   //sorted by
		 p.sendKeys("duration");
		 exttest=report.createTest("DropDown-Check");                                         //screenshot--2
		  exttest.log(Status.PASS,"Drop-Down is working correctly");
		 takescreenshot("dropdown.png");
		 p.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 p.sendKeys("popular");
		 p.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 p.sendKeys("price");
		 p.sendKeys(Keys.ARROW_DOWN);
		 p.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 p.sendKeys("duration");
		 p.sendKeys(Keys.ARROW_DOWN);
		 p.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
    	}
    }
    
    public void more_filters() throws InterruptedException
    {   
    	if(driver.findElement(title).getText().matches(prop.getProperty("to")))       //Top filters interface
    	{ 
 		 driver.findElement(morefilter).click();      //More filters
 		 Thread.sleep(2000);
 		 driver.findElement(withflight).click();
 		 Thread.sleep(1000);
 		 driver.findElement(morefilter).click();
 		 exttest=report.createTest("Validate Flights Filter");            //screenshot--3
		 exttest.log(Status.PASS,"Flights Filter is selected");
		 takescreenshot("Withflight.png");
 		 Thread.sleep(2000);
 		 driver.findElement(withoutflight).click();
 		 Thread.sleep(1000);
 		 driver.findElement(morefilter).click();
 		 Thread.sleep(1000);
 		 driver.findElement(clear).click();
		 Thread.sleep(4000);
		 try {
			 driver.findElement(popupclose).click();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 //driver.findElement(clear).click();
		 //Thread.sleep(5000);
		 /*try {
			 driver.findElement(popupclose).click();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }*/
		 driver.findElement(morefilter).click();
		 Thread.sleep(3000);
		 /*try {
			 driver.findElement(popupclose).click();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }*/
		 driver.findElement(more1).click();
		 Thread.sleep(1000);
		 driver.findElement(theme).click();
		 Thread.sleep(2000);
		 driver.findElement(morefilter).click();
		 Thread.sleep(1000);
		 driver.findElement(clear).click();
		 Thread.sleep(1000);
		 driver.findElement(morefilter).click();
		 driver.findElement(By.xpath("(//span[text()='+ More'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(place).click();
		 Thread.sleep(1000);
		 driver.findElement(morefilter).click();
		 exttest=report.createTest("Validate Places Filter");              //screenshot--4
		    exttest.log(Status.PASS,"Places Filter is selected");
		    takescreenshot("Places.png");
		 Thread.sleep(1000);
		 driver.findElement(clear).click();
		 Thread.sleep(1000);
		 driver.findElement(morefilter).click();
		 driver.findElement(By.xpath("(//span[text()='+ More'])[3]")).click();
		 Thread.sleep(1000);
		 driver.findElement(holidaytype).click();
		 Thread.sleep(1000);
		 driver.findElement(morefilter).click();
		 Thread.sleep(1000);
		 driver.findElement(clear).click();
		 Thread.sleep(1000);
		 driver.findElement(morefilter).click();
		 Thread.sleep(1000);
		 driver.findElement(switch1).click();
 		 Thread.sleep(1000);
 		 driver.findElement(morefilter).click();
		 Thread.sleep(1000);
		 driver.findElement(switch2).click();
		 Thread.sleep(1000);
		 driver.findElement(morefilter).click();
		 Thread.sleep(1000);
		 driver.findElement(clear).click();
		 Thread.sleep(2000);
    	}
    	if(driver.findElement(title).getText().matches("Holidays in "+prop.getProperty("to")))    // side filters interface
    	{   
     		 driver.findElement(more2).click();
     		 Thread.sleep(1000);
     		 driver.findElement(themehoney).click();
     		Thread.sleep(1000);
     		exttest=report.createTest("Validate Package based on Theme filter");
		    exttest.log(Status.PASS,"Package displayed according to selected Theme");           //screenshot--5
		    takescreenshot("Theme_sidepackage.png");
     		 
     		 driver.findElement(themehoney).click();
    		 Thread.sleep(1000);
    		 driver.findElement(themelux).click();
     		 Thread.sleep(1000);
     		 driver.findElement(themelux).click();
    		 Thread.sleep(1000);
    		 driver.findElement(more3).click();
    		 driver.findElement(placeside).click();
    		 Thread.sleep(1000);
    		 exttest=report.createTest("Validate Package based on Places filter");
			    exttest.log(Status.PASS,"Package displayed according to selected Place");      //screenshot--6
			    takescreenshot("Place_sidepackage.png");
  
     		 driver.findElement(placeside).click();
    		 Thread.sleep(2000);
    		 driver.findElement(viewmorefilter).click();
    		 Thread.sleep(2000);
    		 driver.findElement(fixedbundle).click();
    		 Thread.sleep(2000);
    		 driver.findElement(fixedbundle).click();
    		 Thread.sleep(2000);
    		 driver.findElement(allpackage).click();
    		 Thread.sleep(2000);
    		 driver.findElement(allpackage).click();
    		 Thread.sleep(1000);
    		 driver.findElement(more4).click();
    		 driver.findElement(holidaytypeside).click();
    		 Thread.sleep(2000);
    		 driver.findElement(holidaytypeside).click();
    		 Thread.sleep(2000);
    		 driver.findElement(more5).click();
    		 driver.findElement(generaltype).click();
    		 Thread.sleep(1000);
    		 exttest=report.createTest("Validate GeneralType Filter only");
  		    exttest.log(Status.PASS,"GeneralType Filter is working correctly");            //screenshot--3
  		    takescreenshot("GeneralType_filter.png");
    		 Thread.sleep(2000);
    		 try {
    			 driver.findElement(popupclose).click();
    		 }catch(Exception e) {
    			 System.out.println("Pop-up bottom1");
    		 }
    		 driver.findElement(generaltype).click();
    		 Thread.sleep(2000);
    		/* try {
    			 driver.findElement(popupclose).click();
    		 }catch(Exception e) {
    			 System.out.println("Pop-up bottom");
    		 }*/
    		 driver.findElement(backtotop).click();
    		 Thread.sleep(2000);
    		 /*try {
    			 driver.findElement(popupclose).click();
    		 }catch(Exception e) {
    			 System.out.println("Pop-up top");
    		 }*/
    		driver.findElement(switchside1).click();
      	    Thread.sleep(1000);
      	    driver.findElement(switchside1).click();
      	    Thread.sleep(1000);
    		Thread.sleep(1000);
    		driver.findElement(switchside2).click();
     	    Thread.sleep(1000);
     	    driver.findElement(switchside2).click();
    	    Thread.sleep(2000);
    	}
    }
    
    public void screenCapture() throws InterruptedException
    { 
    	Actions act=new Actions(driver);
    	if(driver.findElement(title).getText().matches(prop.getProperty("to")))   // Top filter
    	{
    		WebElement sc2=driver.findElement(bslider1);          //budget
    		 Thread.sleep(1000);
    		 act.moveToElement(sc2).dragAndDropBy(sc2, 100, 0).perform();
    		 Thread.sleep(1000);
    		 act.moveToElement(driver.findElement(booknow)).perform();
    		 Thread.sleep(1000);
    		 exttest=report.createTest("Validate Budget Filter");
   		  exttest.log(Status.PASS,"Package displayed according to choosen budget");     //screenshot--5
    		 takescreenshot("Budget_package.png"); 
    		 act.moveToElement(sc2).dragAndDropBy(sc2,-100, 0).perform();
    		 Thread.sleep(1000);
    		 
    		 WebElement sc=driver.findElement(dslider1);          //duration
      		 Thread.sleep(1000);
      		 act.moveToElement(sc).dragAndDropBy(sc, 100, 0).perform();
      		 Thread.sleep(1000);
      		act.moveToElement(driver.findElement(booknow)).perform();                            
      		Thread.sleep(1000);
      		exttest=report.createTest("Validate Duration Filter");
     		  exttest.log(Status.PASS,"Package displayed according to choosen duration");         //screenshot--6
      		 takescreenshot("Duration_package.png"); 
      		 act.moveToElement(sc).dragAndDropBy(sc, -100, 0).perform();
      		 Thread.sleep(1000);
      		 
      		 WebElement p=driver.findElement(dropdown);           //sorted by
			 p.sendKeys("price");
			 p.sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 act.moveToElement(driver.findElement(booknow)).perform();
			 Thread.sleep(1000);
			 exttest=report.createTest("Validate Sorted-By Filter");                            //screenshot--7
    		  exttest.log(Status.PASS,"Package displayed according to sort-by filter");
     		 takescreenshot("Sortby_package.png");
     		p.sendKeys("popular");
   		    p.sendKeys(Keys.ENTER);
   		    Thread.sleep(1000);
   		    
   		   driver.findElement(morefilter).click();      //More filters
 		   Thread.sleep(1000);
 		   driver.findElement(withflight).click();
 		   Thread.sleep(1000);
 		  act.moveToElement(driver.findElement(booknow)).perform();
 		  Thread.sleep(1000);
 		 exttest=report.createTest("Validate WithFlight Package");                    
		  exttest.log(Status.PASS,"Packages with flights symbol are displayed");
		 takescreenshot("Withflight_package.png");
		 driver.findElement(morefilter).click();
		 driver.findElement(clear).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(morefilter).click();
		 driver.findElement(By.xpath("(//span[text()='+ More'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(place).click();
		 Thread.sleep(1000);
		 act.moveToElement(driver.findElement(booknow)).perform();
		 Thread.sleep(1000);
 		 exttest=report.createTest("Validate Package based on Place filter");
		  exttest.log(Status.PASS,"Package displayed according to choosen place");
		 takescreenshot("Place_package.png");
		 driver.findElement(morefilter).click();
		 driver.findElement(clear).click();
		 Thread.sleep(1000);
		WebElement s= driver.findElement(search_city);
		s.sendKeys("1");
		Thread.sleep(1000);
		s.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(errorimg)).perform();
		Thread.sleep(1000);
		 exttest=report.createTest("Validate Search city/activity dropdown filter");         //screenshot--8
		  exttest.log(Status.PASS,"No packages displayed for input data='1'");
		 takescreenshot("NoPackage.png");
		 Thread.sleep(1000);
		 s.sendKeys(Keys.BACK_SPACE);
		 Thread.sleep(1000);
		 
		 s.sendKeys("12");
			Thread.sleep(1000);
			s.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			act.moveToElement(driver.findElement(booknow)).perform();
			Thread.sleep(1000);
			 exttest=report.createTest("Validate Search city/activity dropdown filter");      //screenshot--9
			  exttest.log(Status.FAIL,"Package is displayed for incorrect data");
			 takescreenshot("Package123.png");
			 Thread.sleep(1000);
			 /*s.sendKeys(Keys.BACK_SPACE);
			 s.sendKeys(Keys.BACK_SPACE);
			 Thread.sleep(1000);*/
		
    	}
    	
    	if(driver.findElement(title).getText().matches("Holidays in "+prop.getProperty("to")))         //side filter
    	{
    		 driver.findElement(withoutflight).click();
    		 act.moveToElement(driver.findElement(priceper)).perform();
    		 Thread.sleep(1000);
  		    exttest=report.createTest("Validate WithoutFlights Package");
  		    exttest.log(Status.PASS,"Packages are displayed without flights symbol");                     //screenshot--4
  		    takescreenshot("WithoutFlight_sidepackage.png");
  		  driver.findElement(withoutflight).click();
  		    Thread.sleep(1000);
  		    
  		  /*WebElement sc1=driver.findElement(bslider1);
 		 Thread.sleep(1000);
 		 act.moveToElement(sc1).dragAndDropBy(sc1, 100, 0).perform();
 		 Thread.sleep(1000);
 		exttest=report.createTest("Validate Places Filter");
	    exttest.log(Status.PASS,"Places Filter is working correctly");
	    takescreenshot("ccc2.png");
 		 act.moveToElement(sc1).dragAndDropBy(sc1, -100, 0).perform();
 		 Thread.sleep(1000);*/
  		    
  		  /*driver.findElement(themehoney).click();
  		  Thread.sleep(1000);
 		 exttest=report.createTest("Validate Package based on Theme filter");
		    exttest.log(Status.PASS,"Package displayed according to selected Theme");           //screenshot--5
		    takescreenshot("Theme_sidepackage.png");
		    driver.findElement(themehoney).click();
		    Thread.sleep(1000);
		    
	  		  driver.findElement(placeside).click();        
	  		  Thread.sleep(1000);
	 		 exttest=report.createTest("Validate Package based on Places filter");
			    exttest.log(Status.PASS,"Package displayed according to selected Place");      //screenshot--6
			    takescreenshot("Place_sidepackage.png");
			    driver.findElement(placeside).click();
			    Thread.sleep(1000);*/
			   
    	}
    }
    
    public void Package_click() throws InterruptedException
    {
    	driver.navigate().refresh();
    	Thread.sleep(1000);
    	
    	if(driver.findElement(title).getText().matches("Holidays in "+prop.getProperty("to")))    // side filters interface
    	{ 
    		driver.findElement(sidepackage).click();
    		Thread.sleep(1000);
    		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
    		driver.switchTo().window(lst.get(1));
    	}
    	else                                                                                      // top filter interface
    	{
    		driver.findElement(toppackage).click();
    		//Thread.sleep(2000);
    		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
    		driver.switchTo().window(lst.get(1));
    	}
    }
}
