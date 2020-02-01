package com.inetbanking.testcase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.Readconfig;



public class BaseClass 
{
	Readconfig readconfig = new Readconfig();
	
	public String baseURL=readconfig.getApplicationURL();
    public String username=readconfig.getusername();
    public String password=readconfig.getpassword();
    public static WebDriver driver;
    public Logger logger;
    
    @Parameters("browser")
    @BeforeClass
    public void setup(String br)
    {
    	logger =Logger.getLogger("ebanking");
     	PropertyConfigurator.configure("Log4j.properties");
     	
     	if(br.equals("firefox"))
     	{
     		System.setProperty("Webdriver.gecko.driver", readconfig.getfirefoxpath());
     		driver = new FirefoxDriver();
        	
     	}
     	else if(br.equals("chrome"))
     	{
     		System.setProperty("Webdriver.chrome.driver",readconfig.getchromepath());
        	driver = new ChromeDriver();
     		
     	}
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	driver.get(baseURL);
		logger.info("Url is opened");
		driver.manage().window().maximize();
    	
      
    }
    @AfterClass
    public void teardown()
    {
    	driver.quit();
    }

    
    public  void captureScreenshot(WebDriver driver,String tname) throws IOException
    {
    	TakesScreenshot ts =(TakesScreenshot) driver;
    	File source =ts.getScreenshotAs(OutputType.FILE);
    	File target =new File(System.getProperty("user.dir")+"/Screenshot/"+tname+".png");
    	FileUtils.copyFile(source, target);
    	System.out.println("Screenshot Taken");
    }
    
    public String randomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}
}
