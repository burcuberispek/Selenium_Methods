package methods;

import org.eclipse.jetty.websocket.common.message.MessageAppender;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_02 {
	static WebDriver driver;
	static By beginnerbtn = By.xpath("//i[@class='fa fa-kiwi-bird']");
	static By simpledemobtn=By.xpath("//a[contains(text(),'Simple Login Demo')]");
	static By username=By.xpath("//div[@class='card card-default']//div[1]//input[1]");
	static By password=By.xpath("//div[@class='card-body']//div[2]//input[1]");
	static By loginbtn=By.xpath("//button[@class='btn btn-success w-100']");
	static By entermessage=By.xpath("//input[@id='user-message']");
	static By showmessagebtn=By.xpath("//button[contains(text(),'Show Message')]");
	static By message=By.xpath("//span[@id='display']");
	
	
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bobit.us");
	}	
		@Test
		public void login() {
			
			ElementUtils.clickOn(driver, beginnerbtn);
			ElementUtils.clickOn(driver, simpledemobtn);
			ElementUtils.getElement(driver, username).sendKeys("Admin");
			ElementUtils.getElement(driver, password).sendKeys("Admin");
			ElementUtils.clickOn(driver, loginbtn);
		}	
		
		@Test
		public void sendmessage() {
			
		      ElementUtils.getElement(driver, entermessage).sendKeys("Hi!");
		      ElementUtils.getElement(driver,showmessagebtn).click();
		      ElementUtils.getElement(driver, message).getText();
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}
}
