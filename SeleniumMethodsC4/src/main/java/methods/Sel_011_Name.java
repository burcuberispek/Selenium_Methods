package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_011_Name {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
        Thread.sleep(5000);
       
       
       WebElement userElement=driver.findElement(By.name("username"));
       userElement.sendKeys("burcu@gmail.com");
       driver.findElement(By.name("username")).sendKeys("burcu@gmail.com");//1
       
       By username=By.name("username");//2
       WebElement element=driver.findElement(username);
       element.sendKeys("burcu@gmail.com");
       
       ElementUtils.getElement(driver,username).sendKeys("b@gmail.com");
       
       
       
	}

}

