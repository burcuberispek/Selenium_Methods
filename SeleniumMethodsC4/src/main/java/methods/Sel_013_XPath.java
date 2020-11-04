package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_013_XPath {
	public static void main(String[] args) throws InterruptedException {
//		XPath: it is used to find location of element on the web page using HTML structure
//		Absolute Xpath: it starts single slash (/). It starts from root element go through to target element
//		 /html/body/div/div/div[2]/form/div[3]/div/div/div[2]/input
//		Relative: it starts double slash (//). It matches first element in DOM
//		 //*[@id="username"]
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
//		WebElement userElement = driver.findElement(By.xpath("//input[@id='username']"));
//		userElement.sendKeys("newyork@sample.com");
//		WebElement userPassword = driver.findElement(By.xpath("//input[@id='password']"));
//		userPassword.sendKeys("test848484");
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		loginBtn.click();
		By username = By.xpath("//input[@id='username']");
		By userPass = By.xpath("//input[@id='password']");
		ElementUtils.getElement(driver, username).sendKeys("furkan@gmail.com");
		ElementUtils.getElement(driver, userPass).sendKeys("test84y398");
	}
}


