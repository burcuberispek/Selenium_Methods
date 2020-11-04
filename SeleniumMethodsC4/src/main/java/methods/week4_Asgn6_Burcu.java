package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week4_Asgn6_Burcu {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.designmantic.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
        if (title.equals("Graphic Design Software & Logo Tool | DesignMantic: The Design Shop")) {
			System.out.println("You are in correct webpage");
		}else {
			System.out.println("Check your path adress");
		}
        
        WebElement loginbtn=driver.findElement(By.className("login-link"));
        loginbtn.click();
        
        driver.findElement(By.id("username")).sendKeys("bb@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@class='btn btn-md btn-color-1 btn-radius']")).click();
       String text= driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
       System.out.println(text);
       if (text.equals("Bad credentials.")) {
		System.out.println("Correct text");
	}else {
		System.out.println("incorrect text");
	}
       driver.close();
	}

}
