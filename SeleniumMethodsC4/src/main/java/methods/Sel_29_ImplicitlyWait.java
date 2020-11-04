package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_29_ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		//This wait tells the webdriver to wait if the element is not available immediately
		//and webdriver waits until the element is visible in specific time
		//NoSuchElementException because cant find elemenet locator
		//imp wait can be used only web element
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//implicitly
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		System.out.println("TITLE IS:"+driver.getTitle());//it is not webelement so cant fint it.threadsleep can be used
		
		//Synchonization
		

	}

}
