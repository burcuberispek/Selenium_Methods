package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week1_2_Burcu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");

		driver.findElement(By.name("Simple Alert")).click();
		Thread.sleep(3000);
		
		//Handle alert
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		if (text.equals("A simple Alert")) {
			System.out.println("correct text");
		}else {
			System.out.println("in-correct text");
		}

		   alert.accept();
		   Thread.sleep(3000);
		        
		   driver.quit();
		}
	}


