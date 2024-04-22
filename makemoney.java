package Amazon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemoney {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//anchor tag
		System.out.println(driver.findElement(By.tagName("li")).getSize());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		
		WebElement footerdriver = driver.findElement(By.id("navFooter"));
		System.out.println(footerdriver.findElement(By.tagName("li")).getSize());
		
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//div[@role='presentation']//div[5]"));
		System.out.println(coloumndriver.findElements(By.tagName("li")).size());
		
	}

}
