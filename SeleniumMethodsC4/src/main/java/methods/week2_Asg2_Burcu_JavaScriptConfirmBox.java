package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week2_Asg2_Burcu_JavaScriptConfirmBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bobit.us/Practice");
		
		driver.findElement(By.xpath("//li[@id='j1_24']/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("j1_29_anchor")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
	
		Alert confirmboxalert=driver.switchTo().alert();
		Thread.sleep(2000);
		
		String confirmboxtext=confirmboxalert.getText();
		
		if(confirmboxtext.equals("Press a button!")) {
			System.out.println("correct text");
		}else {
			System.out.println("in-correct text");
		}
		
		confirmboxalert.accept();
		
		Thread.sleep(2000);
		
		String oktextbtn=driver.findElement(By.id("confirm-demo")).getText();
		if(oktextbtn.equals("You pressed OK!")) {
			System.out.println(true);
		}
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		
		confirmboxalert.dismiss();
		
		String canceltextbtn=driver.findElement(By.id("confirm-demo")).getText();
		if(canceltextbtn.equals("You pressed Cancel!")) {
			System.out.println(false);
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
