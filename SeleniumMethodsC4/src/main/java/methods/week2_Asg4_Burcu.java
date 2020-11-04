package methods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week2_Asg4_Burcu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.siliconelabs.com/");
		
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Name")).sendKeys("Burcu");
		driver.findElement(By.name("Phone")).sendKeys("1234567890");
		driver.findElement(By.name("Mail")).sendKeys("B@gmail.com");
		driver.findElement(By.name("Comment")).sendKeys("I am learning Selenium");
		driver.findElement(By.xpath("//button[@class='contact-one__btn thm-btn']")).click();
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Contact Silicone Labs")) {
			System.out.println("correct text");
		}else {
			System.out.println("in-correct text");
		}
		driver.close();
	}
      
}
//*[@id="NonMobileId"]/div[2]     