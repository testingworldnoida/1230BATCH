package base;

import java.net.MalformedURLException;
import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class CreateDriver {

	public ChromeDriver driver ;
	public ResourceBundle  rb ;
	public static ExtentReports rep ;
	@BeforeSuite
	public void startRep()
	{
		rep = new ExtentReports("./Report/Report.html");
	}
	
	@AfterSuite
	public void saveReport()
	{
		rep.flush();
		rep.close();
	}
	
	@BeforeMethod
	public void startbr() throws MalformedURLException
	{
		rb = ResourceBundle.getBundle("config");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win32 (9)\\chromedriver2.exe");
        driver = new ChromeDriver();
		driver.get(rb.getString("webname"));
	}
	
	@AfterMethod
	public void closedr()
	{
		
		driver.quit();
	}
	
	
}
