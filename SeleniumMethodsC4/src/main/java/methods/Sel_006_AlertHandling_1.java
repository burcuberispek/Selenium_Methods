package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_006_AlertHandling_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//locator
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		//Alert Handling
		Alert alert=driver.switchTo().alert();//Calling  alert interface
		
		alert.accept();
		Thread.sleep(3000);
		
		String text=alert.getText();
		System.out.println("alert message:"+text);
		
		//verify
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct message"+text);
		}else {
			System.out.println("incorrect message"+text);
		}
		alert.accept();
		
		
		
	}

}
