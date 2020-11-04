package methods;

import javax.xml.transform.Source;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Code_Studies.FindElementsConcept;
import io.github.bonigarcia.wdm.WebDriverManager;

public class week2_Asg3_Burcu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bobit.us/Practice");
		
		driver.findElement(By.xpath("//li[@id='j1_2']/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"j1_4_anchor\"]")).click();
	
	    driver.findElement(By.xpath("//input[@id='user-message']")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@id=\'user-message']")).sendKeys("Burcu");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
	    Thread.sleep(3000);
	  
	    String text=driver.findElement(By.xpath("//span[@id='display']")).getText();
	   
	     System.out.println(text);
	     if(text.equals("Burcu")) {
			System.out.println("correct text");
		}else {
			System.out.println("in-correct text");
		}
		
		
	    driver.close();
	  
	}

}
