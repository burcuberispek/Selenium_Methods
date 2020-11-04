package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_043_HTMLUnitHeadless {
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new HtmlUnitDriver();
		
		//WebDriver components chrome, android, firefox, safari, HtmlUnitDriver()
		//HtmlUNitDriver is fastest
		
		driver.get("https://siliconelabs.com");
		System.out.println(driver.getTitle());
	}
}