package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.CreateDriver;

public class TC_001 {
	
	@Test
	public void tc001() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win32 (9)\\chromedriver2.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.theTestingWorld.com");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElementByXPath("//a/span[text()='Video Courses']")).perform();;
	    Thread.sleep(8000);
	}
	
	
}
