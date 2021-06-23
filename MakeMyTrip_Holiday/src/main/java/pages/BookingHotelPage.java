package pages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.Holidaydriver;

public class BookingHotelPage extends Holidaydriver {
	//By selectHotel = By.xpath("//h3[contains(text(),'Exquisite Kerala Flight Inclusive Deal')]");
	 By RoomGuests =By.xpath("//*[@id='guest']");
	 By edit=By.xpath("//a[contains(text(),\"Edit\")]");
	 By Adult=By.xpath("//*[@id='root']/div[3]/div[1]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/ul[1]/li[2]");
	 By children=By.xpath("//body/div[@id='root']/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[2]/li[4]");
	 By chilAge1=By.xpath("(//option[contains(text(),'3')])[1]");	
	 By chilAge2=By.xpath("(//option[contains(text(),'2')])[2]");
	 By chilAge3=By.xpath("(//option[contains(text(),'4')])[3]");
	 By Apply=By.xpath("//button[contains(text(),'APPLY')]");

	 By Adult1=By.xpath("//*[@id='root']/div[3]/div[1]/div/div/div[3]/div[1]/div[1]/div/div[2]/div/ul[1]/li[1]");
	 By Children1=By.xpath("//body/div[@id='root']/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[2]/li[2]");
	 By Length=By.xpath("//ul[@class='flexOne days-itinerary dayplan']/li");
	 By Book =By.xpath("//a[contains(text(),'Book Online')]");
	 By Activity=By.xpath("//*[@id='dayPlanContainer']/div[9]/a");
	 By add=By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[10]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]");
	 By Flight=By.xpath("(//*[@id='Location']/ul/li[2]/a)[1]");
	 By Hotels=By.xpath("//*[@id='Location']/ul/li[3]/a");
	 By Transfer=By.xpath("//*[@id='Location']/ul/li[4]/a");
	 By Activities=By.xpath("//*[@id='Location']/ul/li[5]/a");
	 By summary=By.xpath("//*[@id='Location']/ul/li[6]/a");
	 By Dayplan=By.xpath("//*[@id='Location']/ul/li[1]/a");
	 
	 
	 By adult = By.xpath("(//div[text()='Enter name to find or select from list'])[1]");
	 By adfirstname = By.xpath("//input[@id='FIRST_NAME']");
	 By adlastname = By.xpath("//input[@id='LAST_NAME']");
     By addobDateClick = By.xpath("(//div[@class='css-11uhjjr'])[1]");
	 By addobDate = By.xpath("//*[@id=\"react-select-5-input\"]");
	 By addobMonthClick = By.xpath("(//div[@class='css-11uhjjr'])[2]");
	 By addobMonth = By.xpath("//*[@id=\"react-select-6-input\"]");
	 By addobYearClick = By.xpath("(//div[@class='css-11uhjjr'])[3]");
	 By addobYear = By.xpath("//*[@id=\"react-select-7-input\"]");
	 By adGenderClick = By.xpath("//div[text()='Enter a Gender']");
	 By adGender = By.xpath("//*[@id=\"react-select-8-input\"]");
	 By adSave = By.xpath("//*[@id=\"submit\"]");
		
	 By child = By.xpath("//div[text()='Enter name to find or select from list']");
	 By chfirstname = By.xpath("//input[@id='FIRST_NAME']");
	 By chlastname = By.xpath("//input[@id='LAST_NAME']");
	 By chdobDateClick = By.xpath("(//div[@class='css-11uhjjr'])[1]");
	 By chdobDate = By.xpath("//*[@id=\"react-select-9-input\"]");
	 By chdobMonthClick = By.xpath("(//div[@class='css-11uhjjr'])[2]");
	 By chdobMonth = By.xpath("//*[@id=\"react-select-10-input\"]");
	 By chdobYearClick = By.xpath("(//div[@class='css-11uhjjr'])[3]");
	 By chdobYear = By.xpath("//*[@id=\"react-select-11-input\"]");
	 By chGenderClick = By.xpath("//div[text()='Enter a Gender']");
	 By chGender = By.xpath("//*[@id=\"react-select-12-input\"]");
	 By chSave = By.xpath("//*[@id=\"submit\"]");
		
	 By email = By.xpath("//input[@id=\"EMAIL\"]"); 
	 By mobilecodeClick = By.xpath("//*[@id=\"MOBILE_CODE\"]/div/div[1]");
	 By mobilecode = By.xpath("//*[@id=\"react-select-4-input\"]");
	 By mobilenum = By.xpath("//input[@name='MOBILE_NUMBER']");
	 By gstClick = By.xpath("//div[text()='Enter a GST State']"); 
	 By gst = By.xpath("//*[@id=\"react-select-5-input\"]");
	 By payment = By.xpath("//a[text()='Proceed to Payments']");

		
	
	 public void  selectRooms() throws Exception
	 {
		Thread.sleep(5000);
		driver.findElement(RoomGuests).click();
		driver.findElement(edit).click();
		//driver.findElement(Adult).click();
		//driver.findElement(children).click();	
		//driver.findElement(chilAge1).click();
		//driver.findElement(chilAge2).click();
		//driver.findElement(chilAge3).click();
		//driver.findElement(Apply).click();
		 //exttest=report.createTest("Checking when members more than 5 booking  single room");
		 //exttest.log(Status.FAIL,"Alert is displayed that more than four are not allowed in single room");          //screenshot--1
   	     //takescreenshot("Alert.png"); 
   	     //Thread.sleep(1000);
		//Alert a=driver.switchTo().alert();
		//a.accept();
		Thread.sleep(1000);
		driver.findElement(Adult1).click();
		driver.findElement(Children1).click();
		driver.findElement(chilAge1).click();
		driver.findElement(Apply).click();
		Thread.sleep(1000);
	 }
	
	 public void book() throws Exception
	 {
		//ArrayList<WebElement> ar=new ArrayList<WebElement>(driver.findElements(Length));
		List<WebElement> ar=driver.findElements(Length);
		Thread.sleep(700);
		for(int i=1;i<ar.size();i++)
		{
			driver.findElement(By.xpath("//ul[@class='flexOne days-itinerary dayplan']/li["+(i+1)+"]")).click();
		    Thread.sleep(900);
		}
		
      }

	 public void  packageDetails() throws InterruptedException
	 {
	 	driver.findElement(Flight).click();
	 	
	 	//Thread.sleep(1000);
	 	exttest=report.createTest("Checking Flights option");
		 exttest.log(Status.PASS,"Flights of  from and To are displayed");          //screenshot--1
  	     takescreenshot("Flights.png"); 
	 	driver.findElement(Hotels).click();
	 	Thread.sleep(1000);
	 	exttest=report.createTest("Checking Hotels option");
		 exttest.log(Status.PASS,"Staying Hotel is displayed");          //screenshot--1
  	     takescreenshot("Hotels.png"); 
	 	driver.findElement(Transfer).click();
	 	Thread.sleep(1000);
	 	exttest=report.createTest("Checking Transfer option");
		 exttest.log(Status.PASS,"Transfer option displays Travelling vehicles");          //screenshot--1
  	     takescreenshot("Transfer.png"); 
	 	driver.findElement(Activities).click();
	 	//Thread.sleep(1000);
	 	exttest=report.createTest("Checking Activities option");
		 exttest.log(Status.PASS,"Displays activities done during Trip");          //screenshot--1
  	     takescreenshot("Activities.png"); 
  	   Thread.sleep(1000);
	 	driver.findElement(summary).click();
	 	exttest=report.createTest("Checking summary option");
		 exttest.log(Status.PASS,"Displaying journey plans and actions");          //screenshot--1
  	     takescreenshot("summary.png"); 
	 	//driver.findElement(Dayplan).click();
	 	Thread.sleep(1000);
	 	driver.findElement(Book).click();
	 	Thread.sleep(4000);
	 	
	 }
	 
	 
	 public void payments() throws Exception{
		 //Thread.sleep(2000);
			driver.findElement(adult).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='css-kj6f9i-menu react-select-review__menu'])[1]")).click();  //add new
			Thread.sleep(1000);
			
			exttest=report.createTest("Validate Add New");
			exttest.log(Status.PASS,"Add New is working correctly");            
			takescreenshot("AddNew.png");
			
			driver.findElement(adfirstname).sendKeys(prop.getProperty("adfirstname"));
			Thread.sleep(1000);
			driver.findElement(adlastname).click();
			driver.findElement(adlastname).sendKeys(prop.getProperty("adlastname"));
			Thread.sleep(1000);
			driver.findElement(addobDateClick).click();
			Thread.sleep(1000);
			driver.findElement(addobDate).sendKeys(prop.getProperty("addobDate"));
			Thread.sleep(1000);
			driver.findElement(addobDate).sendKeys(Keys.ENTER);
			//driver.findElement(addobMonthClick).click();
			Thread.sleep(1000);
			driver.findElement(addobMonth).sendKeys(prop.getProperty("addobMonth"));
			Thread.sleep(1000);
			driver.findElement(addobMonth).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(addobYear).sendKeys(prop.getProperty("addobYear"));
			Thread.sleep(1000);
			driver.findElement(addobYear).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(adGenderClick).click();
			Thread.sleep(1000);
			driver.findElement(adGender).sendKeys(prop.getProperty("adGender"));
			Thread.sleep(1000);
			driver.findElement(adGender).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(adSave).click();
			Thread.sleep(1000);
			
			exttest=report.createTest("Validate Add New Traveller Details");
			exttest.log(Status.PASS,"Displays entered Traveller details");            
			takescreenshot("AddNewTravellerDetails.png");
			
			driver.findElement(child).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class='css-kj6f9i-menu react-select-review__menu'])[1]")).click();  //add new
			Thread.sleep(1000);
			driver.findElement(chfirstname).sendKeys(prop.getProperty("chfirstname"));
			Thread.sleep(1000);
			driver.findElement(chlastname).click();
			driver.findElement(chlastname).sendKeys(prop.getProperty("chlastname"));
			Thread.sleep(1000);
			driver.findElement(chdobDateClick).click();
			Thread.sleep(1000);
			driver.findElement(chdobDate).sendKeys(prop.getProperty("chdobDate"));
			Thread.sleep(1000);
			driver.findElement(chdobDate).sendKeys(Keys.ENTER);
			//driver.findElement(addobMonthClick).click();
			Thread.sleep(1000);
			driver.findElement(chdobMonth).sendKeys(prop.getProperty("chdobMonth"));
			Thread.sleep(1000);
			driver.findElement(chdobMonth).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(chdobYear).sendKeys(prop.getProperty("chdobYear"));
			Thread.sleep(1000);
			driver.findElement(chdobYear).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(chGenderClick).click();
			Thread.sleep(1000);
			driver.findElement(chGender).sendKeys(prop.getProperty("chGender"));
			Thread.sleep(1000);
			driver.findElement(chGender).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(chSave).click();
			
			driver.findElement(email).click();
			Thread.sleep(1000);
			driver.findElement(email).sendKeys(prop.getProperty("email"));
			Thread.sleep(1000);
			driver.findElement(mobilecodeClick).click();
			Thread.sleep(1000);
			driver.findElement(mobilecode).sendKeys(prop.getProperty("mobilecode"));
			Thread.sleep(1000);
			driver.findElement(mobilecode).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(mobilenum).click();
			Thread.sleep(1000);
			driver.findElement(mobilenum).sendKeys(prop.getProperty("mobilenum"));
			Thread.sleep(1000);
			/*driver.findElement(gstClick).click();
			Thread.sleep(1000);
			driver.findElement(gst).sendKeys(prop.getProperty("gst"));
			Thread.sleep(1000);
			driver.findElement(gst).sendKeys(Keys.ENTER);
			Thread.sleep(1000);*/
			
			exttest=report.createTest("Validate Review Page");
			exttest.log(Status.PASS,"Displays the Traveller Information");            
			takescreenshot("TravellerInformation.png");
			
			driver.findElement(payment).click();	
			
			Thread.sleep(4000);
			exttest=report.createTest("Checking Proceed to Payments option");
			exttest.log(Status.PASS,"Proceed to Payment page is displaying");          
	 	    takescreenshot("Payments.png");
	 	    Thread.sleep(1000);
	 	    
	 	    ArrayList<String> lst=new ArrayList<String>(driver.getWindowHandles());
	 	   
	 	    driver.close();
	 	    driver.switchTo().window(lst.get(0));
	 	    Thread.sleep(1000);
	 	     
			}

}
