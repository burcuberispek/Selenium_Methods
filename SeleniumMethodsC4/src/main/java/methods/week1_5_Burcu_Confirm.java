package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class week1_5_Burcu_Confirm {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Pop up')]")).click();
		Alert alert = driver.switchTo().alert();//calling alert interface
		String text = alert.getText(); //for getting text for verify and handling.
		System.out.println("alert message"+text); // To see the text in console.
		//verify
		if(text.equals("Confirm pop up with OK and Cancel button")){
			System.out.println("correct text");
		}else{
			System.out.println("in-correct text");
		}
		alert.accept();
		driver.quit();
		System.out.println("Alert handled");
		
	}
}