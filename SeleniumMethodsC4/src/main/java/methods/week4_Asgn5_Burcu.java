package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week4_Asgn5_Burcu {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement entername=driver.findElement(By.id("name"));
        entername.sendKeys("Burcu");
        
        WebElement confirmbtn=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
        confirmbtn.click();

        Alert alert=driver.switchTo().alert();
        String text=alert.getText();
        System.out.println(text);
        if (text.equals("Hello Burcu, Are you sure you want to confirm?")) {
			System.out.println("Correct text");
		}else {
			System.out.println("in-correct text");
		}
        alert.accept();
        driver.close();
        
        
        
        
        
        
	}

}
