package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");		
		driver.manage().window().maximize();
		
		WebElement uploadElement = driver.findElement(By.xpath("//input[@value='File Upload']"));
		uploadElement.sendKeys("C:\\Users\\VAMSI KRISHNA\\Desktop\\account details.PNG");
		
		driver.quit();
		
		
	}

}
