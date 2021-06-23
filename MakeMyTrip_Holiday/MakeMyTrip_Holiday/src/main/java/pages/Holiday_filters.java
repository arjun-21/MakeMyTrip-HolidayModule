package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


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
	By place=By.xpath("(//div[@class='overFlowCheckbox'])[2]/div[3]");
	By holidaytype=By.xpath("//p[text()='Featured']");
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
    By holidaytypeside=By.xpath("//label[contains(@for,'Most Popular')]");
    By generaltype=By.xpath("//label[contains(@for,'Signature')]");
    By backtotop=By.linkText("BACK TO TOP");
    By toppackage=By.xpath("(//div[@class='slick-track'])[1]/div[1]//img");
    By sidepackage=By.xpath("(//div[@class='appendBottom15'])[1]//h3");
    	
    public void hotel_category() throws InterruptedException
    {
    	if(driver.findElement(title).getText().matches(prop.getProperty("to")))       //Top filters interface
    	{
    	  driver.findElement(star3).click();
    	  Thread.sleep(2000);                                               //3 star
    	  driver.findElement(star3).click();
    	  
    	  driver.findElement(star4).click();
    	  Thread.sleep(2000);                                               //4 star
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
      	    Thread.sleep(2000);                                                     //4 star
      	    driver.findElement(star4).click();
      	     
      	    driver.findElement(star5).click();
     	    Thread.sleep(2000);                                                     //5 star
     	    driver.findElement(star5).click();
     	    Thread.sleep(1000);
 		    driver.findElement(withflight).click();
 		    Thread.sleep(1000);
 		    driver.findElement(withflight).click();
 		    Thread.sleep(1000);
 		    driver.findElement(withoutflight).click();
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
 		 //System.out.println("Scroll working1");                                //budget scroll 1
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
     		 //System.out.println("Scroll working1");
     		 Thread.sleep(1000);
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
 		 Thread.sleep(2000);
 		 driver.findElement(withoutflight).click();
 		 Thread.sleep(1000);
 		 driver.findElement(morefilter).click();
		 Thread.sleep(5000);
		 try {
			 driver.findElement(popupclose).click();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 driver.findElement(clear).click();
		 Thread.sleep(5000);
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
		 driver.findElement(theme).click();
		 Thread.sleep(2000);
		 driver.findElement(morefilter).click();
		 Thread.sleep(2000);
		 //driver.findElement(By.xpath("(//span[text()='+ More'])[2]")).click();
		 driver.findElement(place).click();
		 Thread.sleep(1000);
		 driver.findElement(morefilter).click();
		 Thread.sleep(1000);
		 //driver.findElement(By.xpath("(//span[text()='+ More'])[3]")).click();
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
		 Thread.sleep(3000);
    	}
    	if(driver.findElement(title).getText().matches("Holidays in "+prop.getProperty("to")))    // side filters interface
    	{   
     		 driver.findElement(more2).click();
     		 Thread.sleep(1000);
     		 driver.findElement(themehoney).click();
     		 Thread.sleep(1000);
     		 driver.findElement(themehoney).click();
    		 Thread.sleep(1000);
    		 driver.findElement(themelux).click();
     		 Thread.sleep(1000);
     		 driver.findElement(themelux).click();
    		 Thread.sleep(1000);
    		 driver.findElement(more3).click();
    		 driver.findElement(placeside).click();
     		 Thread.sleep(2000);
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
    		 Thread.sleep(2000);
    		 driver.findElement(generaltype).click();
    		 Thread.sleep(2000);
    		 driver.findElement(backtotop).click();
    		 Thread.sleep(5000);
    		 try {
    			 driver.findElement(popupclose).click();
    		 }catch(Exception e) {
    			 e.printStackTrace();
    		 }
    		driver.findElement(switchside1).click();
      	    Thread.sleep(1000);
      	    driver.findElement(switchside1).click();
      	    Thread.sleep(1000);
    		Thread.sleep(1000);
    		driver.findElement(switchside2).click();
     	    Thread.sleep(1000);
     	    driver.findElement(switchside2).click();
    	    Thread.sleep(1000);
    	}
    }
    
    public void Package_click() throws InterruptedException
    {
    	/*if(driver.findElement(title).getText().matches(prop.getProperty("to")))       //Top filters interface
    	{ 
    		driver.findElement(toppackage).click();
    		Thread.sleep(2000);
    		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
    		driver.switchTo().window(lst.get(1));
    	}*/
    	if(driver.findElement(title).getText().matches("Holidays in "+prop.getProperty("to")))    // side filters interface
    	{ 
    		driver.findElement(sidepackage).click();
    		Thread.sleep(2000);
    		ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
    		driver.switchTo().window(lst.get(1));
    	}
    }
}
