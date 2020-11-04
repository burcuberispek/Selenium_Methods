package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_30_ExplicitlyWait_1 {

	public static void main(String[] args) {


		//it works with web element and non web element
		//webdriverwait class
		
		//5 locator or element 4 can be available 5- can be available 10 seconds
		
        //fluent 4 locator available 5 second can be available 10;15;20;30==fluent 30 polling 5
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//non-web element
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		System.out.println(driver.getTitle());
		
		
		//Web element
		By email=By.id("username");
		wait.until(ExpectedCondition.presenceOfElementLocated(email));
		WebElement username=driver.findElement(email);
		username.sendKeys("Burcu@gmail");
		System.out.println(driver.getTitle());
	}

}
