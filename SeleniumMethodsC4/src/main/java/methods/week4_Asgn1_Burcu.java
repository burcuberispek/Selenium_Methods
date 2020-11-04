package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week4_Asgn1_Burcu {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" http://the-internet.herokuapp.com/dynamic_loading/1");
		
		WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		btn.click();
		
		By text=By.xpath("//h4[contains(text(),'Hello World!')]");
        WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.textToBe(text, "Hello World!"));
	    WebElement hellotext=driver.findElement(text);
	    String textverify=hellotext.getText();
		System.out.println(hellotext.getText());
		
		if (textverify.equals("Hello World!")) {
			System.out.println("Correct text");
		}else {
			System.out.println("in_correct text");
		}
	
		
		
		
		
		
		
	
		
	}

}
