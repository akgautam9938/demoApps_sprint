package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToAvoideStaleRefrenceException {
	public static void main(String[] args) throws InterruptedException {
		//pre-condition
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//test-condition
				GoogleSearchPage search = new GoogleSearchPage(driver);
				driver.get("https://www.google.com/");
				//WebElement textbox = driver.findElement(By.name("q"));
				
				search.getTextbox().sendKeys("java");
				Thread.sleep(2000);
				driver.navigate().refresh();
				
				search.getTextbox().sendKeys("Automation");
				Thread.sleep(2000);

				//post-condition
				driver.quit();

	}


}
