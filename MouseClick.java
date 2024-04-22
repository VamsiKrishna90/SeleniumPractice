package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClick {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");		
		driver.manage().window().maximize();
		
		WebElement elementtotype = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		elementtotype.sendKeys("iphone14");
		WebElement elementtoclick = driver.findElement(By.xpath("//input[@type='submit']"));
		
		Actions action = new Actions(driver);
		
		action.click(elementtoclick).build().perform();
		
		driver.close();
		
		
		
	}

}
