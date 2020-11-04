package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_014_CSS {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//ID
				//first usage
				
//		WebElement userElement = driver.findElement(By.cssSelector("#username"));
//		userElement.sendKeys("newyork@sample.com");
//		WebElement passElement = driver.findElement(By.cssSelector("#password"));
//		passElement.sendKeys("test123456");
//		WebElement loginBtn = driver.findElement(By.cssSelector("#loginBtn"));
//		loginBtn.click();
				
				//Second usage
				
//		driver.findElement(By.cssSelector("#username")).sendKeys("newjersey@sample.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test7575757");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
				
				//Third usage
		By username = By.cssSelector("#username");
//		WebElement element = driver.findElement(username);
//		element.sendKeys("bob@sample.com");
				
				//Fourth Usage
	  ElementUtils.getElement(driver, username).sendKeys("ilhan@hotmail.com");
	}
}
