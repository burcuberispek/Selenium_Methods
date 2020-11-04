package methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_035_ElementVisibility
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
		(new WebDriverWait(driver, 10))
		.until(ExpectedConditions.visibilityOfElementLocated(By.id("seleniumbox")));
		//Declaring a local variable of type "Boolean " to initialize the value of the web element
		WebElement seleniumCheckbox = driver.findElement(By.id("seleniumbox"));
		WebElement restCheckBox = driver.findElement(By.id("restapibox"));
		//is selected
		Boolean checkSelenium = seleniumCheckbox.isDisplayed();//isSelected veya isEnabled kullanilabilir
		//Boolean checkSelenium = seleniumCheckbox.
		System.out.println("Selenium box is "+ checkSelenium);
		Boolean checkRestApi = restCheckBox.isDisplayed();
		System.out.println("Rest API is "+ checkRestApi);
		System.out.println("Rest API is "+ checkRestApi);
		WebElement saveBtn = driver.findElement(By.id("demo"));
		//saveBtn.click();
		Boolean checkSaveBtn = saveBtn.isDisplayed();
		System.out.println(checkSaveBtn);
	}
	
}