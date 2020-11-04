package methods;

import org.omg.CORBA.portable.ValueBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
  
public class week3_Asg1_Burcu {
	 public static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		WebElement dropdown=driver.findElement(By.id("testingDropdown"));
		dropdown.click();
		
		selectDropdownValueByText(dropdown, "Database Testing");
		
	   
		WebElement element=driver.findElement(By.xpath("//*[@id=\"database\"]"));
		boolean selected=element.isSelected();
	    if (selected) {
			System.out.println("Element is selected");
		}else {
			System.out.println("element is not selected");
		}
		
	    driver.close();
}
			public static void selectDropdownValueByText(WebElement element,String value) {
				Select select = new Select(element);
				select.selectByVisibleText(value);
				
				
			
				
}

}
