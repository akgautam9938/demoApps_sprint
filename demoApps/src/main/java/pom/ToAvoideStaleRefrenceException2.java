package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToAvoideStaleRefrenceException2 {
	public static void main(String[] args) throws InterruptedException {
		//pre-condition
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//test-condition
				GoogleSearchPage2 search = new GoogleSearchPage2(driver);
				driver.get("https://www.google.com/");
				//No neep to take element reference 
				//WebElement textbox = driver.findElement(By.name("q"));
				
				search.searchQuerry("java");
				Thread.sleep(2000);
				driver.navigate().refresh();
				
				search.searchQuerry("Automation");
				Thread.sleep(2000);

				//post-condition
				driver.quit();
	}

}
