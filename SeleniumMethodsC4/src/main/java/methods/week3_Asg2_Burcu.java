package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3_Asg2_Burcu {
 public static WebDriver driver;
 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		WebElement dropdownmenu=driver.findElement(By.id("testingDropdown"));
		dropdownmenu.click();
		
		
	    calldropdownoptions(driver, dropdownmenu,"Automation");
	
	
	
	}
		public static void calldropdownoptions(WebDriver driver, WebElement element,String value){
		
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		
		for(int i =0; i<options.size(); i++) {
			String text = options.get(i).getText();
			System.out.println(text);
			
	}

}
}

