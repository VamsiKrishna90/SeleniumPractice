package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@value='Prompt']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert promptAlert = driver.switchTo().alert();
		String AlertText = promptAlert.getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("AlertText is:"+AlertText);
		promptAlert.sendKeys("hello");
		//promptAlert.accept();

		   
		
	}

}
