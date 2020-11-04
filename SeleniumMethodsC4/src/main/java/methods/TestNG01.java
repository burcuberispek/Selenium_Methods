package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG01 {
		static WebDriver driver;
		static By practiceArea = By.xpath("//a[contains(text(),'Practice Area')]");
		static By beginner = By.xpath("//i[@class='fa fa-kiwi-bird']");
		static By JSAlerts = By.xpath("//a[contains(text(),'Javascript Alerts')]");
		static By clickMe = By.xpath("//button[@class='btn btn-default']");
		static By confirmBtn = By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]");
		@BeforeMethod
		public void setUp() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.bobit.us");
		}
		@Test
		public void getAlert() {
			ElementUtils.clickOn(driver, practiceArea);
			ElementUtils.clickOn(driver, beginner);
			ElementUtils.clickOn(driver, JSAlerts);
			ElementUtils.clickOn(driver, clickMe);
			ElementUtils.getAlertText(driver);
		}
		@Test
		public void confirmBox() {
			ElementUtils.clickOn(driver, practiceArea);
			ElementUtils.clickOn(driver, beginner);
			ElementUtils.clickOn(driver, JSAlerts);
			ElementUtils.clickOn(driver, confirmBtn);
			ElementUtils.getAlertText(driver);
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}