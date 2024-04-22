package Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//new registration
		driver.findElement(By.xpath("//div[@class='nav-signin-tooltip-footer']//a[@class='nav-a'][normalize-space()='Start here.']")).click();
		System.out.println("request for new registration");
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("krishna");
		System.out.println("name is displayed");
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		System.out.println("click on the country code");
		driver.findElement(By.xpath("//a[@id='auth-country-picker_92']")).click();
		System.out.println("country code is clickable");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9059142290");
		System.out.println("phone no is displayed");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abc@123");
		System.out.println("password is displayed");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		System.out.println("registration is pending");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//solve the puzzle
		driver.findElement(By.cssSelector("body")).click();
	
	
	
	
	
	
	
	
	}

}
