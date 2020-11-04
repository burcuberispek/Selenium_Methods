package Code_Studies;

//public class WEEK1 {
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;
//
//	import io.github.bonigarcia.wdm.WebDriverManager;
//
//	public class WebDriverBasics {
//
//		public static void main(String[] args) {
//			
//			//Set property
//			
//			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver"); //key: driver == value: driver's path
//			
//			//Chromedriver: to connect with chrome browser
//			
//			//set up browser
//			
//			WebDriver driver = new ChromeDriver();
//			
//			//launch browser
//			driver.get("https://www.google.com/"); //org.openqa.selenium.InvalidArgumentException
//			
//			//get title
//			
//			String title = driver.getTitle();
//			System.out.println(title);
//			
//			//Validation --- verify
//			if(title.equals("Google")){  //Assert.equ
//				System.out.println("correct title");
//			}else{
//				System.out.println("incorrect title");
//			}
//			
//			String url = driver.getCurrentUrl();
//			System.out.println(url);
//			if(url.equals("https://www.google.com/")){
//				System.out.println("correct url");
//			}else{
//				System.out.println("incorrect url");
//			}
//			
//			//System.out.println(driver.getPageSource());
//			
//			//driver.close(); //close current browser
//			//driver.quit(); // close all browser instance
//			
//			//
//			
//
//		}
//
//	}
//	Navigate Method
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.WebDriver.Navigation;
//	import org.openqa.selenium.chrome.ChromeDriver;
//
//	public class BackAndForwardConcept {
//
//		public static void main(String[] args) throws InterruptedException {
//			
//	        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver"); //key: driver == value: driver's path
//		
//			WebDriver driver = new ChromeDriver();
//		
//			driver.get("https://www.google.com/");
//			
//			//Navigation
//			//navigate
//			driver.navigate().to("https://www.amazon.com");
//			Thread.sleep(2000); //2 seconds MS
//			driver.navigate().back();   //google
//			Thread.sleep(2000);
//			driver.navigate().forward(); //amazon
//			Thread.sleep(2000);
//			driver.navigate().back();
//			Thread.sleep(2000);
//			driver.navigate().refresh();
//			
//			driver.quit();
//			
//			//Interview question
//			
//			// get & navigate
//			
//			// get navigates to a webpage. Webdriver will wait until the page has fully loaded before
//			// returning control script. Get function does not have any method
//			// navigate function navigates to a webpage. Webdriver will not wait  the page has fully loaded
//			// back - forward - refresh
//			
//			
//			//Select two different webpages
//			//FirefoxDriver()
//			
//
//		}
//
//	}
//	Alert Handling
//	import org.openqa.selenium.Alert;
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;
//
//	import io.github.bonigarcia.wdm.WebDriverManager;
//
//	public class AlertHandling1 {
//
//		public static void main(String[] args) throws InterruptedException {
//			
//			//https://mail.rediff.com/cgi-bin/login.cgi
//			
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//			
//			//Locator concept
//			driver.findElement(By.name("proceed")).click();
//			
//			Thread.sleep(4000);
//			//Handle alert
//			Alert alert = driver.switchTo().alert(); // calling alert interface
//			
//			/*
//			 * void dismiss(); //cancel
//	           void accept(); //OK 
//	           String getText(); //String
//	           void sendKeys(String keysToSend); // Send any value 
//			 */
//			
//			String text = alert.getText();
//			System.out.println(text);
//			
//			//verify
//			if(text.equals("Please enter a valid user name")){
//				System.out.println("Correct text: "+ text);
//			}else{
//				System.out.println("incorrect text"+ text);
//			}
//			
//			//alert.accept(); //ok
//			alert.dismiss(); //cancel
//			
//			driver.quit();
//			
//		}
//
//	}
//	import org.openqa.selenium.Alert;
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;
//
//	import io.github.bonigarcia.wdm.WebDriverManager;
//
//	public class AlertHandling2 {
//		
//		static WebDriver driver;
//
//		public static void main(String[] args) throws InterruptedException {
//			
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//			
//			//Locator concept
//			driver.findElement(By.name("proceed")).click();
//			
//			Thread.sleep(4000);
//			
//			//getAlertText();
//			
//			if(ElementUtil.getAlertText(driver).equals("Please enter a valid user name")){
//				System.out.println("correct text");
//			}else{
//				System.out.println("incorrect text");
//			}
//			
//			driver.quit();
//		
//		}
//		
//		//Generic method === common methods--- 
////		public static String getAlertText(){
////			Alert alert = driver.switchTo().alert();
////			String text = alert.getText();
////			System.out.println(text);
////			alert.accept();
////			return text;
//	//	
////		}
//
//	}
//	import org.openqa.selenium.By;
//	import org.openqa.selenium.WebDriver;
//
//	public class AlertHandling3 {
//		
//		public static WebDriver driver;
//
//		public static void main(String[] args) throws InterruptedException {
//			
//			//URL
//			String url = "https://mail.rediff.com/cgi-bin/login.cgi";
//			
//			//Locator
//			By goBtn = By.name("proceed");
//			
//			//Launch Browser
//			driver = ElementUtil.launchBrowser(driver, "firefox");
//			ElementUtil.launchURL(driver, url);
//			System.out.println(ElementUtil.getPageTitle(driver));
//			ElementUtil.clickOn(driver, goBtn);
//			
//			Thread.sleep(4000);
//			
//			String text = ElementUtil.getAlertText(driver);
//			if(text.equals("Please enter a valid user name")){
//				System.out.println("Correct");
//			}else{
//				System.out.println("in-correct");
//			}
//			
//			ElementUtil.quitBrowser(driver);
//			
//			
//			
//
//		}
//
//	}
//}
