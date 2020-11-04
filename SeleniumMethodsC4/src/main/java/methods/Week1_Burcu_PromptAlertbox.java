package methods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Week1_Burcu_PromptAlertbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.id("cookie_action_close_header")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]")).click();
		
		Alert alert = driver.switchTo().alert();
	     alert.sendKeys("yes"); 
		alert.accept();
		
		driver.close();
		System.out.println("Alert handled");
		
	}
}