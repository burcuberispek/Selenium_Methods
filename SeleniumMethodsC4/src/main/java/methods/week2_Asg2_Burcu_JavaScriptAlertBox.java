package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week2_Asg2_Burcu_JavaScriptAlertBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bobit.us/Practice");
		
		
		driver.findElement(By.xpath("//li[@id='j1_24']/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("j1_29_anchor")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		
		Alert javascriptalert=driver.switchTo().alert();
		String javascriptext=javascriptalert.getText();
		System.out.println(javascriptext);
		if(javascriptext.equals("I am an alert box!")) {
			System.out.println("correct text");
		}else {
			System.out.println("in-correct text");
		}
		javascriptalert.accept();
		
	    driver.close();
		
		
		
		
		
		
	}

}
