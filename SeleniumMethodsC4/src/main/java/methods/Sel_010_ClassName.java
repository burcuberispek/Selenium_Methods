package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_010_ClassName {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
        Thread.sleep(5000);
        
        By username=By.className("form-control private-form__control login-email");
        ElementUtils.getElement(driver,username).sendKeys("burcu@gmail.com");
        
        
        
        
	}

}

