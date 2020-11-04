package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_005_NavigateGet {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Get
		driver.get("https://www.google.com");
		Thread.sleep(3000);
    	driver.navigate().refresh();
//		//Navigate
//		driver.navigate().to("https://www.amazon.com");
//		Thread.sleep(2000);
//		driver.navigate().back();//it provides to come back previous page Google
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		
//		driver.quit();//close browser
    	
    	
	}

}
