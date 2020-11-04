package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_045_MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
		WebElement contentMenu=driver.findElement(By.xpath("//a[@class='menulink']"));
				
        
		Actions actions=new Actions(driver);
		
        actions.moveToElement(contentMenu).build().perform();
		
		
		WebElement courselink=driver.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(), 'Courses')]"));
        Thread.sleep(5000);
		//courselink.click();
		actions.click(courselink);
	}

}
