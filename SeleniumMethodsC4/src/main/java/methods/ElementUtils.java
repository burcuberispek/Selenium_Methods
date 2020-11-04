package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ElementUtils {
	//common methods
	/**
	 * This method is used to handle Javascript alert
	 * @param driver
	 * @return
	 */
	public static String getAlertText(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
		
	}
	
	public static WebDriver launchBrowser(WebDriver driver,String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\burcu\\Documents\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\burcu\\Documents\\Drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}else {
			System.out.println("Browser is not avaliable"+browserName);
		}
		return driver;
	}
	/**
	 *
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url) {
		try {
			driver.get(url);
		}catch(Exception e) {
			System.out.println("ab exception occured while lauching url");
		}
	}
	/**
	 *
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		waitForPresenceOfElements(driver, locator);
		WebElement element = driver.findElement(locator);
		return element;
	}
	/**
	 *
	 * @param driver
	 * @param locator
	 */
	public static void waitForPresenceOfElements(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 *
	 * @param driver
	 * @param goBtn 
	 * @return
	 */
	public static String getPageTitle(WebDriver driver, By goBtn) {
		return driver.getTitle();
	}
	/**
	 *
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver, By locator) {
		driver.findElement(locator).click();
	}
	/**
	 *
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}
	/**
	 *
	 * @param driver
	 */
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	public static void doubleClick(WebDriver driver, WebElement element,By locator) {
		Actions actions = new Actions(driver);
		element = driver.findElement(locator);
		actions.doubleClick(element).perform();
	}
	
	
}
