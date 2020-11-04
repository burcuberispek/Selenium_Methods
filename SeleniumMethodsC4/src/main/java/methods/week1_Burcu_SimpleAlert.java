package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class week1_Burcu_SimpleAlert {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(5000);
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("alert message:"+text);
		if(text.equals("A simple Alert")) {
			System.out.println("correct message"+text);
		}else {
			System.out.println("incorrect message"+text);
		}
		alert.accept();
		driver.quit();
		   System.out.println("Alert is handled");
		
		}
		
		
		
	}


