package Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//sign in 
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
		driver.quit();
	}

}
