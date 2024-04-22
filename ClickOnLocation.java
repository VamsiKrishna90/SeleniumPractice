package Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnLocation {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//locate the url
		driver.get("https://www.amazon.in/");
		
		//click on the location
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement enter = driver.findElement(By.xpath("//input[@class='GLUX_Full_Width a-declarative']"));
		enter.sendKeys("500017");
		driver.findElement(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")).click();
		
		//left corner
//		driver.findElement(By.xpath("//div[@class='a-carousel-col a-carousel-left celwidget']//a[@class='a-carousel-goto-prevpage']")).click();

		WebDriverWait element = new WebDriverWait(driver, Duration.ofSeconds(5));
		element.until(ExpectedConditions.elementToBeClickable(By.linkText("Amazon miniTV"))).click();
		
		
	}

}
