package Code_Studies;

public class WEEK2 {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class IdConcept {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://app.hubspot.com/login");
			Thread.sleep(5000);
			
			//ID
			
			//First Usage
//			WebElement userElement = driver.findElement(By.id("username"));
//			userElement.sendKeys("boblerry@gmail.com");
//			WebElement userPass = driver.findElement(By.id("password"));
//			userPass.sendKeys("test@123");
//			WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//			loginBtn.click();
			
			//Second usage
			//driver.findElement(By.id("username")).sendKeys("ilhan@gmail.com");
			
			//Third Usage
			By username = By.id("username");
			//WebElement userElement = driver.findElement(username);
			//userElement.sendKeys("robert@gmail.com");
			
			//Fouth Approach
			ElementUtil.getElement(driver, username).sendKeys("ilhan@gmail.com");

		}

	}
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class NameConcept {
		
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/login");
			
			Thread.sleep(3000);
			
			//First usage
//			WebElement userElement = driver.findElement(By.name("username"));
//			userElement.sendKeys("ilhan@gmail.com");
			
			//Second 
			//driver.findElement(By.name("username")).sendKeys("ilhan@gmail.com");
			
			//Third usage
			By username = By.name("username");
//			WebElement userElement = driver.findElement(username);
//			userElement.sendKeys("Biximgenclik@gmail.com");
			
			//Fourth Usage
			ElementUtil.getElement(driver, username).sendKeys("LastPart@gmail.com");
			

		}

	}
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ClassNameConcept {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://app.hubspot.com/login");
			Thread.sleep(5000); // 5 seconds
			
			//form-control private-form__control login-email
			
			By username = By.className("login-email");
			ElementUtil.getElement(driver, username).sendKeys("ilhan@gmail.com");
	        //form-control private-form__control login-password m-bottom-3
		}

	}
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CSSSelector {

		public static void main(String[] args) throws InterruptedException {
			
			//CSS 
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://app.hubspot.com/login");
			Thread.sleep(5000); // 5 seconds
			
			By username = By.cssSelector("#username");
			ElementUtil.getElement(driver, username).sendKeys("ziya@gmail.com");
			By passowrd = By.cssSelector("#password");
			ElementUtil.getElement(driver, passowrd).sendKeys("123test");
			By loginBtn = By.cssSelector("#loginBtn");
			ElementUtil.getElement(driver, loginBtn).click();
			

		}

	}
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class XpathConcept {

		public static void main(String[] args) throws InterruptedException {
			
		//Xpath: it is used to find location of element on the web page using HTML structure.	
		//Absolute (/) Relative (//)
		//  //tagname[@attributeName= 'value']
		///html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[2]/input[1]
		//Relative -- 
		//  form-control private-form__control login-password m-bottom-3
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000); // 5 seconds
			
//		WebElement userElement = driver.findElement(By.xpath("//input[@id='username']"));
//		userElement.sendKeys("ilhan@gmail.com");
	//	
//		WebElement passElement = driver.findElement(By.xpath("//input[@id='password']"));
//		passElement.sendKeys("1r3");
	//	
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));
//		loginBtn.click();
	//	
//		driver.quit();
		
		By username = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		
		ElementUtil.getElement(driver, username).sendKeys("ilhan@gmail.com");
		ElementUtil.getElement(driver, password).sendKeys("543hsgsfcs");
		
		}

	}
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LinkConcept {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://app.hubspot.com/login");
			Thread.sleep(5000); // 5 seconds
			
			By signUp = By.linkText("Sign up");
			//By signUp = By.partialLinkText("Privacy");
			ElementUtil.getElement(driver, signUp).click();
			ElementUtil.getElement(driver, signUp).click();

		}

	}
	LoginPage
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class LoginPageConcept {
		
		public static WebDriver driver;
		
		static By email = By.id("username");
		static By password = By.xpath("//input[@id='password']");
		static By loginBtn = By.cssSelector("#loginBtn");

		public static void main(String[] args) throws InterruptedException {
			
			driver = ElementUtil.launchBrowser(driver, "chrome");
			ElementUtil.launchURL(driver, "https://app.hubspot.com/login");
			Thread.sleep(5000);
			
			ElementUtil.getElement(driver, email).sendKeys("boblerry@gmail.com");
			ElementUtil.getElement(driver, password).sendKeys("test123");
			ElementUtil.getElement(driver, loginBtn).click();
			ElementUtil.quitBrowser(driver);
			
			

		}

	}
	Element Util
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ElementUtil {
		
		//Utilities -- Util -- basePage
		// common methods (getTitle, click on- submit,alert handling, calling browser, getURL) 
		
		/**
		 * This method is used to get text and handle alert
		 * @param driver
		 * @return
		 */
		public static String getAlertText(WebDriver driver){
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println(text);
			alert.accept();
			return text;
		}
		
		/**
		 * Get title
		 * @param driver
		 * @return
		 */
		public static String getPageTitle(WebDriver driver){
			return driver.getTitle();
		}
		
		/**
		 * URL
		 * @param driver
		 * @param url
		 */
		public static void launchURL(WebDriver driver, String url){
			driver.get(url);
		}
		
		/**
		 * Lauch browser
		 * @param driver
		 * @param browserName
		 * @return
		 */
		public static WebDriver launchBrowser(WebDriver driver, String browserName){
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
				driver = new ChromeDriver();
			}
			else if(browserName.equals("firefox")){
				System.setProperty("webdriver.gecko.driver", "/Users/bobit/Documents/Drivers/geckodriver");
				driver = new FirefoxDriver();
			}
			else{
				System.out.println("Browser is not available "+ browserName);
			}
			return driver;
		}
		
		/**
		 * click on element
		 * @param driver
		 * @param locator
		 */
		public static void clickOn(WebDriver driver, By locator){
			driver.findElement(locator).click();
		}
		
		/**
		 * get element
		 * @param driver
		 * @param locator
		 * @return
		 */
		public static WebElement getElement(WebDriver driver, By locator){
			WebElement element = driver.findElement(locator);
			return element;
		}
		
		/**
		 * close browser
		 * @param driver
		 */
		public static void closeBrowser(WebDriver driver){
			driver.close();
		}
		
		/**
		 * quit browser
		 * @param driver
		 */
		public static void quitBrowser(WebDriver driver){
			driver.quit();
		}
		public static void mouseOver(WebDriver driver, By locator){

	        Actions action = new Actions(driver);
	        WebElement mouseOverAction = driver.findElement(locator);
	        action.moveToElement(mouseOverAction).perform();
	    }
		
	}
	Take Screenshot
	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ScreenShotConcept {

		public static void main(String[] args) throws IOException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); // will maximize webpage fullscreen
			driver.manage().deleteAllCookies(); // Clean test
			
			driver.get("https://siliconelabs.com");
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("/Users/bobit/Desktop/Pics/ilhan.png"));
			
			// jpeg - png tif

		}

	}
	Find Elements
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class FindElementsConcept {

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.amazon.com");
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			//findelements 
			List<WebElement> linkList = driver.findElements(By.tagName("a"));
			
			//Size
			System.out.println("Total links are: "+ linkList.size()); //126
			
			for(int i= 0; i<linkList.size(); i++){
				String text = linkList.get(i).getText();
				//System.out.println(text);
				
//				if(!text.isEmpty()){
//					System.out.println(text);
//				}
				
				if(text.equals("Forgot Password?")){
					linkList.get(i).click();
					break;
				}
				
			}
			
			

		}

	}
}
