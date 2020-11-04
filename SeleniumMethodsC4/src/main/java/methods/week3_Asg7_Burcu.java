package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3_Asg7_Burcu {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.designmantic.com/");
		
		Thread.sleep(2000);
		
		
		WebElement selectservice=driver.findElement(By.id("selectservice"));
		selectservice.click();
	
		Select selectbusinesscard=new Select(selectservice);
	    selectbusinesscard.selectByVisibleText("Business Card");
	    
	    
	    WebElement selectcompany=driver.findElement(By.xpath("//*[@id=\"company_name\"]"));
		selectcompany.sendKeys("SiliconeLabs");
		
	    WebElement industry=driver.findElement(By.id("details_categories"));
	    industry.click();
	    Select selectindustry=new Select(industry);
	    selectindustry.selectByVisibleText("All");
	    
	    
	    WebElement showmydesign=driver.findElement(By.xpath("//*[@id=\"btnlogo2\"]/span"));
	    showmydesign.click();

	}

}
