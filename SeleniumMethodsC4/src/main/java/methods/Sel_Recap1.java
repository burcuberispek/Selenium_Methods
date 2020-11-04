package methods;

import java.awt.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

import Code_Studies.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_Recap1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
		driver.manage().window().fullscreen();
		// 1
//		WebElement username = driver.findElement(By.name("session_key"));
//		WebElement password = driver.findElement(By.name("session_password"));
//		
//		
//		username.sendKeys("ahmet@siliconelabs.com");
//		password.sendKeys("12345");
		
		// 2
		
		//driver.findElement(By.name("session_key")).sendKeys("ahmet@siliconelabs.com");
		
		// 3 
		By username = By.name("session_key");
//		
//		WebElement userNameElement = driver.findElement(username);
//		userNameElement.sendKeys("ahmet@siliconelabs.com");
		
		// 4
		ElementUtil.getElement(driver, username);
		
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}