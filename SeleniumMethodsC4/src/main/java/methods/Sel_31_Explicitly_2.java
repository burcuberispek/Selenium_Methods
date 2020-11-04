package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_31_Explicitly_2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//non-web element
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		By email=By.id("username");
		By password=By.id("password");
		By loginBtn=By.id("loginBtn");
		
		getElement(driver, email).sendKeys("b@gmail");
		getElement(driver, password).sendKeys("123");
		getElement(driver, loginBtn).click();
	}
       public static void getElement(WebElement driver,By locator) {
    	   WebDriverWait wait =new WebDriverWait(driver, 15);
    	   wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    	   WebElement element=driver.findElement(locator);
       }
       
}
