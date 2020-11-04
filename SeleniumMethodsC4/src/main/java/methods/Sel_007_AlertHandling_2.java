package methods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;
public class Sel_007_AlertHandling_2 {
	
	      static ChromeDriver driver;
    
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			//locator
			driver.findElement(By.name("proceed")).click();
			Thread.sleep(4000);
	
		   getAlertText();
		   
		   if(ElementUtils.getAlertText(driver).equals("Please enter a valid user name")) {
		   System.out.println("correcttext");
		}
		else {
			System.out.println("in correct text");
			
		   
		   
		}
		   driver.quit();
		   System.out.println("Alert is handled");
		
}
        //Generic method==common method
		public static String getAlertText() {
	    Alert alert=driver.switchTo().alert();
		String text=alert.getText();
        System.out.println(text);
        alert.accept();
        return text;

}}
