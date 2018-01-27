package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.CreateDriver;

public class TC_003 extends CreateDriver{
	
	@Test
	public void tc001() throws InterruptedException
	{

		System.out.println("TC_003");
		ExtentTest t2 = rep.startTest("TC_002_Login_Logout");
		driver.findElementById(rb.getString("login_username_id")).sendKeys("abcd");
		driver.findElementById(rb.getString("b")).sendKeys("he");
		t2.log(LogStatus.FAIL, "Assertions not matched");
		rep.endTest(t2);
		Thread.sleep(5000);
	}
	
	
}
