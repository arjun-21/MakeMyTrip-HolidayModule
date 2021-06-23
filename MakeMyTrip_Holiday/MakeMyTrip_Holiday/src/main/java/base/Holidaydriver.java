package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Holidaydriver {
	public static WebDriver driver;
    public static Properties prop;
    
   
   @BeforeSuite
    public void setUp()
    {
    	prop=new Properties();
    	try{prop.load(new FileInputStream("src/main/java/config/config.properties"));}catch(Exception e) {}
    	if(prop.getProperty("browsername").matches("firefox"))
    	{
    		driver=new FirefoxDriver();
    	}
    	if(prop.getProperty("browsername").matches("chrome"))
    	{
    		driver=new ChromeDriver();
    	}
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	
    }
   /*@AfterSuite
   public void tearDown()
   {
	   driver.close();
       
		try {
		Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");}catch(Exception e) {}
   }*/
   
    
}
