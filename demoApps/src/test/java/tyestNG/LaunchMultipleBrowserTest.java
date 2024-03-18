package tyestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LaunchMultipleBrowserTest {
	WebDriver driver;
	
	@Parameters("browser")
	
	@Test
	public void launchBrowserTest(String browser)
	{
		
	 if(browser.equals("chrome"))
	 {
		 driver= new ChromeDriver();
	 }
	 
	 else if(browser.equals("Edge"))
	 {
		 driver= new EdgeDriver();
	 }
	  
	 else if(browser.equals("firefox"))
	 {
		 driver= new FirefoxDriver();
	 }
	 
	 driver.get("https://www.instagram.com/accounts/login/");
	 System.out.println(driver.getTitle());
	 
	}
	 
	

}
