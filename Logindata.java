package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DataProvidersPractice.ExcelDataSupplier;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logindata {

	@Test(dataProvider = "logindata",dataProviderClass=ExcelDataSupplier.class)
	public void Testlogin(String username, String Password) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.Amazon.in/");
driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
System.out.println("user is able to click ");
driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(username);
System.out.println("phone no is displayed");
driver.findElement(By.xpath("//input[@id='continue']")).click();
System.out.println("click on continue");
driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(Password);
System.out.println("Password is displayed");
driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
System.out.println("Amazon homepage displayed");
driver.quit();




	}

}
