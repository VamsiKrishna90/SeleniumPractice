package Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class footdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//anchor tag
		System.out.println(driver.findElement(By.tagName("li")).getSize());
		
		WebElement footerdriver = driver.findElement(By.id("navFooter"));
		System.out.println(footerdriver.findElement(By.tagName("li")).getSize());
		
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[1]//ul[1]"));
		System.out.println(coloumndriver.findElements(By.tagName("li")).size());
		
		for(int i=4;i<coloumndriver.findElements(By.tagName("li")).size();i++) { 
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000L));
			coloumndriver.findElements(By.tagName("u1")).get(i).sendKeys(clickonlinkTab);
		}
		
		
		
		
		
		
		
	}

}
