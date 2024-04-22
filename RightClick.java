package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
	
		WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
		actions.contextClick(link).perform();
		
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element.click();
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
