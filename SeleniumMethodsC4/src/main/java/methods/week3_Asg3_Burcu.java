package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3_Asg3_Burcu {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		WebElement dropdownmenu=driver.findElement(By.xpath("//*[@id=\"testingDropdown\"]"));
		dropdownmenu.click();
		Thread.sleep(2000);
		
		Select select=new Select(dropdownmenu);
		
		System.out.println(select.isMultiple());
		
		boolean isMultiple=select.isMultiple();
		
		if (isMultiple) {
			System.out.println("Is is multiple");
		}else {
			System.out.println("It is not multiple");
		}
		
	}		
}	
