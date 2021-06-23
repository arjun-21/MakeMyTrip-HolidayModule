package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import base.Holidaydriver;

public class Destinations_themes extends Holidaydriver{

	WebDriverWait wait=new WebDriverWait(driver, 10);
	public By holidays=By.xpath("//span[text()='Holidays']");
	public By destinations=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/ul/li[2]");
	public By domestic=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[1]");
	public By domesticcity=By.xpath("(//ul[@class='hdlRegion__citylist'])[1]/li/a[text()='Kashmir']");
	public By international=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[2]");
	public By internationalcity= By.xpath("(//ul[@class='hdlRegion__citylist'])[1]/li/a[text()='Dubai']");
	public By themes=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/ul/li[3]");
	public By signaturejourneys=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[1]");
	public By honeymoonholidays=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[2]");
	public By familyholidays=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[3]");
	public By offbeatholidays=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[1]/ul/li[4]");
	public By signaturejourneyscity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[1]/li/a[text()='Tea Trail']");
	public By honeymoonholidayscity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[1]/li/a[text()='Kashmir']");
	public By familyholidayscity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[1]/li/a[text()='Goa']");
	public By offbeatholidayscity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[1]/li/a[text()='Varkala']");
	public By checkcity=By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div/ul/li[2]/a");
	public By checktopcity=By.xpath("//*[@id='suitableFilter']/h1");
		
	
	public boolean testing(String place,ArrayList<String> a1,String screenshotname,String testname)
	{
		boolean value=false,value1=true,value2=true;
		try
		{
		     driver.switchTo().window(a1.get(1));
		    
		    Thread.sleep(2000);
		    //   String a=driver.findElement(checkcity).getText();
	        // System.out.println(a);
		    		
		    if(driver.findElement(checktopcity).getText().equalsIgnoreCase("Kashmir"))
		    {
		    	
		    }
		    else
		    {
		    	value1=false;
		    }
		   
		    }
		    catch(Exception E) {
		    	value1=false;
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
		   
		    if(value=true)
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
	

	public void destinationsdomesticsearch() throws InterruptedException
	{
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		System.out.println("holidays opened");
		driver.findElement(holidays).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(destinations)));
		driver.findElement(destinations).click();
		System.out.println("destinations selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(domestic)));
		driver.findElement(domestic).click();
		System.out.println("domestic selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(domesticcity)));
		driver.findElement(domesticcity).click();
		System.out.println("city selected");
		Thread.sleep(4000);
	    ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
	    Boolean value;
	    value=testing("Kashmir",a1,"destinationsdomestic","destinationsdomestic");
	    System.out.println(value);
	}
	
	public void destinationsinternationalsearch() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		System.out.println("holidays opened");
		driver.findElement(holidays).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(destinations)));
		driver.findElement(destinations).click();
		System.out.println("destinations selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(international)));
		driver.findElement(international).click();
		System.out.println("international selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(internationalcity)));
		driver.findElement(internationalcity).click();
		System.out.println("International city selected");
		Thread.sleep(4000);
		ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
		Boolean value;
        value=testing("Dubai",a1,"destinationsinternational","destinationsinternational");
	    System.out.println(value);
	 }
	
	

	public void  themessignaturejourneys() throws InterruptedException
	{
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		System.out.println("holidays opened");
		driver.findElement(holidays).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(themes)));
		driver.findElement(themes).click();
		System.out.println("themes selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(signaturejourneys)));
		driver.findElement(signaturejourneys).click();
		System.out.println("signature journeys selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(signaturejourneyscity)));
		driver.findElement(signaturejourneyscity).click();
		System.out.println("signaturejourneyscity selected");
		Thread.sleep(4000);
		ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
	    Boolean value;
	    value=testing("signature journeys",a1,"themessignaturejourneys","themessignaturejourneys");
	    System.out.println(value);
	}
	
	
	public void themeshoneymoonholidays() throws InterruptedException
	{
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		System.out.println("holidays opened");
		driver.findElement(holidays).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(themes)));
		driver.findElement(themes).click();
		System.out.println("themes selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(honeymoonholidays)));
		driver.findElement(honeymoonholidays).click();
		System.out.println("honeymoonholidays selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(honeymoonholidayscity)));
		driver.findElement(honeymoonholidayscity).click();
		System.out.println("honeymoonholidays city selected");
		Thread.sleep(4000);
		ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
	    Boolean value;
	    value=testing("Kashmir",a1,"themeshoneymoon","themeshoneymoon");
	    System.out.println(value);
	}
	
	public void themesfamilyholidays() throws InterruptedException
	{
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		System.out.println("holidays opened");
		driver.findElement(holidays).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(themes)));
		driver.findElement(themes).click();
		System.out.println("themes selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(familyholidays)));
		driver.findElement(familyholidays).click();
		System.out.println("family holidays selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(familyholidayscity)));
		driver.findElement(familyholidayscity).click();
		System.out.println("family holidays city selected");
		Thread.sleep(4000);
		ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
	    Boolean value;
	    value=testing("Goa",a1,"themesfamilyholidays","themesfamilyholidays");
	    System.out.println(value);
	}
	
	
	public void themesoffbeatholidays() throws InterruptedException
	{
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(holidays)));
		System.out.println("holidays opened");
		driver.findElement(holidays).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(themes)));
		driver.findElement(themes).click();
		System.out.println("themes selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(offbeatholidays)));
		driver.findElement(offbeatholidays).click();
		System.out.println("offbeatholidays selected");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(offbeatholidayscity)));
		driver.findElement(offbeatholidayscity).click();
		System.out.println("offbeatholidays city selected");
		Thread.sleep(4000);
		ArrayList<String> a1=new ArrayList<String>(driver.getWindowHandles());
	    Boolean value;
	    value=testing("varkala",a1,"themesoffbeatholidays","themesoffbeatholidays");
	    System.out.println(value);
	}
}
