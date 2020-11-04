package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week4_Asgn2_Burcu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("  http://the-internet.herokuapp.com/javascript_alerts");
		
		//JS ALERT HANDLING
//		WebElement jsAlertBtn=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
//		jsAlertBtn.click();
//		Thread.sleep(2000);
//		Alert jsAlert=driver.switchTo().alert();
//		String jsAlertText=jsAlert.getText();
//		System.out.println(jsAlertText);
//		jsAlert.accept();	
//		System.out.println("Alert is handled succesfully");
//		driver.close();	
		
		//Confirm
//		WebElement jsconfirmbtn=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
//		jsconfirmbtn.click();
//		Thread.sleep(2000);
//		Alert jsConfirm=driver.switchTo().alert();
//		String jsConfirmText=jsConfirm.getText();
//		System.out.println(jsConfirmText);
//		jsConfirm.accept();	
//		System.out.println("Alert is handled succesfully");
//		driver.close();	
		
		//Prompt
		WebElement jsPromptbtn=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		jsPromptbtn.click();
		Thread.sleep(2000);
		Alert jsPrompt=driver.switchTo().alert();
		String jsPromptText=jsPrompt.getText();
		System.out.println(jsPromptText);
		jsPrompt.accept();	
		System.out.println("Alert is handled succesfully");
		driver.close();	
		
		
		
	}

}
