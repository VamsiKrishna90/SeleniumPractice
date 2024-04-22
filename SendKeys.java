package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");		
		driver.manage().window().maximize();
		//xpath for searchbox
		WebElement element = driver.findElement(By.xpath("//textarea[@title='Search']"));
		//instance of action class
		Actions action = new Actions(driver);
		//using send keys
		action.sendKeys(element, "samsung").build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//close the browser
		driver.quit();
		
		
		
	}

}
