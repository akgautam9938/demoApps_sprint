package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGenrateStaleRefrenceException {

	public static void main(String[] args) {
		//pre-condition
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//test-condition
				
				driver.get("https://www.google.com/");
				WebElement textbox = driver.findElement(By.name("q"));
				
				textbox.sendKeys("java");
				
				driver.navigate().refresh();
				
				textbox.sendKeys("Automation");

	}

}
