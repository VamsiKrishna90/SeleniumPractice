package Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		System.out.println("user is able to click ");
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9059142290");
		System.out.println("phone no is displayed");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		System.out.println("click on continue");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abc@123");
		System.out.println("Password is displayed");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		System.out.println("Amazon homepage displayed");
		
		
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		dropdown.selectByVisibleText("Watches");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//div[@id='s-refinements']//div[1]//ul[1]//li[1]//span[1]//a[1]//div[1]//label[1]//i[1]")).click();
		driver.findElement(By.xpath("//span[@dir='auto'][normalize-space()='Men']")).click();
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
