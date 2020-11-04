package methods;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3_Asg4_Burcu {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement alertboxelement=driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]"));
		alertboxelement.click();
		
		System.out.println(alertHandling(driver));
	}
	
	
	
	
	public static String alertHandling(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		alert.accept();
		System.out.println("Alert was handled");
		
		return alerttext;
		
	}
}
