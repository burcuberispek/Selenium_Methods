package methods;

import org.apache.commons.compress.archivers.zip.ScatterStatistics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_015 {

	public static WebDriver driver;
	
	static By email=By.id("email");
	static By password=By.id("password");
	static By loginBtn=By.cssSelector("#loginBtn");
	public static void main(String[] args) throws InterruptedException {
		driver=ElementUtils.launchBrowser(driver, "chrome");
		ElementUtils.launchBrowser(driver, "https://app.hupspot.com/login");
		Thread.sleep(4000);
		
		ElementUtils.getElement(driver, email).sendKeys("burcu@gmail.com");
		ElementUtils.getElement(driver, password).sendKeys("12334");
		ElementUtils.clickOn(driver, loginBtn);
		ElementUtils.quitBrowser(driver);
		
		
		
		
	}
		

	}


