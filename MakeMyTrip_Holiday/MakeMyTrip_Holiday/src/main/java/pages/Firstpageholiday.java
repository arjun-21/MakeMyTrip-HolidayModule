package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.Holidaydriver;

public class Firstpageholiday extends Holidaydriver {
	By holidaysbutton=By.xpath("(//span[text()='Holidays'])[1]");
	By city=By.xpath("//input[@id='fromCity']");
	By from=By.xpath("//input[@placeholder='From']");
	By to=By.xpath("//input[@placeholder='To']");
	By searchbutton=By.id("search_button");
	By during=By.xpath("(//input[@placeholder='Select'])[3]");
	By date=By.xpath("//div[@aria-label='Mon Aug 16 2021']");
	By search=By.xpath("//button[contains(text(),'Search')]");
	public void openurl()
	{	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.makemytrip.com/");
		driver.get(prop.getProperty("url"));
	}
	public void Home() throws InterruptedException
	{
		
		driver.findElement(holidaysbutton).click();
		driver.findElement(city).click();
		Thread.sleep(1000);
		driver.findElement(from).sendKeys(prop.getProperty("from"));
		Thread.sleep(1000);
		driver.findElement(from).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(from).sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(to).sendKeys(prop.getProperty("to"));
		Thread.sleep(2000);
		driver.findElement(to).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(to).sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
	}
	public void searchbutton() throws InterruptedException
	{
		driver.findElement(searchbutton).click();
		Thread.sleep(9000);	
	}
	public void secondpage() throws InterruptedException
	{
		driver.findElement(during).click();
		Thread.sleep(1000);
		driver.findElement(date).click();
		Thread.sleep(1000);
		driver.findElement(search).click();
		Thread.sleep(1000);
	}
	
}
