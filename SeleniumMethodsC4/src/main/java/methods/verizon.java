package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verizon {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(" https://www.verizonwireless.com/");
			WebElement element=driver.findElement(By.xpath("//button[@id='gnav20-Shop-L1']"));
			Actions actions=new Actions(driver);
			
	        actions.moveToElement(element).build().perform();
			
			
			driver.findElement(By.xpath("//a[@id='gnav20-Shop-L3-1']")).click();	

	}

}
