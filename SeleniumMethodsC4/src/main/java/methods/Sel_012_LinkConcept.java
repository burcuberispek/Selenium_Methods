package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_012_LinkConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//provides maxsimize window
		driver.manage().deleteAllCookies();
		driver.get("http://the-internet.herokuapp.com/login");
        Thread.sleep(5000);
       
        By signUp=By.linkText("sign up");
        By signUp1=By.partialLinkText("Privacy");
        ElementUtils.getElement(driver,signUp).click();
        ElementUtils.getElement(driver,signUp1).click();
        
        
        
        
        
	}

}
