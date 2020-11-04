package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_004_WebDriverManager {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com");
		String title = driver.getTitle();
		System.out.println("title :"+ title);
		driver.close();
		System.out.println("test completed...!");
		

	}

}
