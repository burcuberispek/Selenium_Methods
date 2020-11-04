package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3_Asg5_Burcu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement confirmboxelement1=driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]"));
		confirmboxelement1.click();
		System.out.println(alertHandling1(driver));
		
		Thread.sleep(3000);
		System.out.println("*************************************");
       
		WebElement confirmboxelement2=driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]"));
		confirmboxelement2.click();
		System.out.println(alertHandling2(driver));
	}
	
	
	
	
	public static String alertHandling1(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		alert.accept();
		System.out.println("User clicked Ok button.Alert was handled");
		
		return alerttext;
		
	}
	public static String alertHandling2(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		alert.dismiss();
		System.out.println("User clicked Cancel button.Alert2 was handled");
		
		return alerttext;
		
	}

	

}
