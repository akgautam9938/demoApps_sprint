package genricUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import genricUtility.FileUtility;

public class BaseClass {
	
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	@BeforeSuite
	public void bs()
	{
		System.out.println("This is before Suit");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void bc() throws IOException
	{
	  
	  String browser=fUtils.fetchDataFromPropertyFile("browser");
	 String url = fUtils.fetchDataFromPropertyFile("URL");
	 
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
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get(url);
	 System.out.println("The browser has launched and Url is navigated");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void ac() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		System.out.println("The browser is closed");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("This is after Test");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("This is After suite");
	}
}
