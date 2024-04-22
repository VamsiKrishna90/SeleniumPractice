package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) {

		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");		
		driver.manage().window().maximize();
		
	WebElement ele =driver.findElement(By.xpath("//input[@id='double-click']"));
	Actions act = new Actions(driver);
	act.doubleClick(ele).perform();
	Alert myalert = driver.switchTo().alert();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	myalert.accept();
		
	}

}
