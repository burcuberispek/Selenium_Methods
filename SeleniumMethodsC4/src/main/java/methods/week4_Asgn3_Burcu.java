package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week4_Asgn3_Burcu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement elementdropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        elementdropdown.click();
        
       Select select=new Select(elementdropdown);
       Thread.sleep(2000);
       select.selectByVisibleText("Option1");
       System.out.println("Option1 is selected");
       System.out.println(select.isMultiple());
       if (select.isMultiple()) {
    	   System.out.println("Dropdown is multiple");
		
	}else {
		System.out.println("Dropdown is not multiple");
	}
	}

}
