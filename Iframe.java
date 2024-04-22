package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/html/html_iframe.asp");

		
		// Handling Iframe
		//outer frame
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@title='W3Schools HTML Tutorial']"));
		driver.switchTo().frame(outerframe);
		//sign in button 
		driver.findElement(By.xpath("//a[@id='signupbtn_topnav']")).click();
		//close the brows/////////////////////////////////////////////er
		driver.quit();
		
	
}
}