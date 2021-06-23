package pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.Holidaydriver;

public class Featured extends Holidaydriver{
	public By holidays=By.xpath("//span[text()='Holidays']");
	By featured=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/ul/li[4]");
	By expertsrecommended=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[1]");
	By bestsellingholidays=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[2]");
	By specialoffers=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[4]");
	By shortbreak=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[3]");
	By expertrecommendedcity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[1]/li/a[text()='Kashmir']");
	By bestsellingholidayscity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[1]/li/a[text()='Kashmir']");
	By shortbreakcity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[1]/li/a[text()='Adventure']");
	By specialofferscity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[1]/li/a[text()='Ladakh is Calling!']");
    By checkcity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/ul/li[2]/a");
	By checktopcity=By.xpath("//*[@id='suitableFilter']/h1");
    
	WebDriverWait wait=new WebDriverWait(driver, 10);
	
	public boolean testing(String place,ArrayList<String> a1,String screenshotname,String testname)
	{
		boolean value=false,value1=true,value2=true;
		try
		{
		     driver.switchTo().window(a1.get(1));
		     
		    Thread.sleep(2000);
		   
		    if(driver.findElement(checktopcity).getText().equalsIgnoreCase("Kashmir"))
		    {
		    	
		    }
		    else
		    {
		    	value=false;
		    }
		   
		    }
		    catch(Exception E) {
		    	value=false;
		    }
		    
		    try
		    {
		    Thread.sleep(2000);
		    if(driver.findElement(checkcity).getText().equalsIgnoreCase("Kashmir"))
		    {
		    	
		    }
		    else
		    {
		    	value2=false;
		    }
		   
		    }
		    catch(Exception E) {
		    	value2=false;
		    }
		    if(value1||value2)
		    {
		    	value=true;
		    }
		   
		    if(value==true)
		    {
		    	 exttest=report.createTest(testname);
	      		 exttest.log(Status.PASS,"Next tab displayed according to selected place");
	      		takescreenshot(""+screenshotname+".png");
		    }
		    else
		    {
		    	exttest=report.createTest(testname);
	      		exttest.log(Status.FAIL,"Next tab not displayed according to selected place");
	      		takescreenshot(""+screenshotname+".png");
		    }
		    driver.close();
		    driver.switchTo().window(a1.get(0));
		return value;
	}
	

	public void featuredexpertsrecommended() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		driver.findElement(holidays).click();
		System.out.println("holidays opened");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(featured)));
		driver.findElement(featured).click();
		System.out.println("featured selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(expertsrecommended)));
		driver.findElement(expertsrecommended).click();
		System.out.println("expertsrecommended selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(expertrecommendedcity)));
		driver.findElement(expertrecommendedcity).click();
		System.out.println("city selected");
		Thread.sleep(2000);
	    ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
	    Boolean value=true;
	    value=testing("Kashmir",a1,"featuredexpertsrecommended","featuredexpertsrecommended");
	    System.out.println(value);
	   
	}
	
	
	public void featuredbestsellingholidays() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		driver.findElement(holidays).click();
		System.out.println("holidays opened");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(featured)));
		driver.findElement(featured).click();
		System.out.println("featured selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(bestsellingholidays)));
		driver.findElement(bestsellingholidays).click();
		System.out.println("bestsellingholidays selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(bestsellingholidayscity)));
		driver.findElement(bestsellingholidayscity).click();
		System.out.println("city selected");
		Thread.sleep(2000);
	    ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
	    Boolean value=true;
	    value=testing("Kashmir",a1,"featuredbestsellingholidays","featuredbestsellingholidays");
	    System.out.println(value);
	  
	}
	
	public void featuredshortbreak() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		driver.findElement(holidays).click();
		System.out.println("holidays opened");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(featured)));
		driver.findElement(featured).click();
		System.out.println("featured selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(shortbreak)));
		driver.findElement(shortbreak).click();
		System.out.println("shortbreak selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(shortbreakcity)));
		driver.findElement(shortbreakcity).click();
		System.out.println("city selected");
		Thread.sleep(2000);
	    ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
	    Boolean value=true;
	    value=testing("india",a1,"featuredshortbreak","featuredshortbreak");
	    System.out.println(value);
   
	}
	
	public void featuredspecialoffers() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		driver.findElement(holidays).click();
		System.out.println("holidays opened");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(featured)));
		driver.findElement(featured).click();
		System.out.println("featured selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(specialoffers)));
		driver.findElement(specialoffers).click();
		System.out.println("specialoffers selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(specialofferscity)));
		driver.findElement(specialofferscity).click();
		System.out.println("city selected");
		Thread.sleep(2000);
	    ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
	    Boolean value=true;
	    value=testing("ladakh",a1,"featuredspecialoffers","featuredspecialoffers");
	    System.out.println(value);
	}
	   
}



