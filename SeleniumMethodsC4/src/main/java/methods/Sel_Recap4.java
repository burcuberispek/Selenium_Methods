package methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_Recap4 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
		driver.manage().window().fullscreen();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		
		username.sendKeys("ahmet@siliconelabs.com");
		
		
		WebElement signIn = driver.findElement(By.xpath("//button[contains(text(),'Sign i')]"));
		
		signIn.click();
		
		
		// //tag[@attribute='value']
		
		Thread.sleep(3000);
		driver.close();
		
	}
}