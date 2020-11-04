package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week4_Asgn4_Burcu {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement entername=driver.findElement(By.id("name"));
        entername.sendKeys("Burcu");
        
        WebElement alertbtn=driver.findElement(By.xpath("//input[@id='alertbtn']"));
        alertbtn.click();
        
        Alert alert=driver.switchTo().alert();
        String text=alert.getText();
        System.out.println(text);
        if (text.equals("Hello Burcu, share this practice page and share your knowledge")) {
			System.out.println("Correct text");
		}else {
			System.out.println("in-correct text");
		}
        alert.accept();
        driver.close();
	}

}
