package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
driver.get("https://www.nseindia.com/option-chain");
driver.findElement(By.xpath("//a[@id='link_8']")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("body > header:nth-child(5) > nav:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(9) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")).click();
////*[contains(text(),'Holidays')]

	}

}
