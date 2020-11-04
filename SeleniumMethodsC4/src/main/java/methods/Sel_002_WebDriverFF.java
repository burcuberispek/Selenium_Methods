package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_002_WebDriverFF {

	public static void main(String[] args) {
		//Set property
				System.setProperty("webdriver.gecko.driver","C:\\Users\\burcu\\Documents\\Drivers\\geckodriver.exe");
				
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.siliconelabs.com/");
				
				// Get title
				String title=driver.getTitle();//actual result
				System.out.println("Page title is  :"+ title);
				
				//Validation==verify
				if(title.equals("Silicone Labs")) {//expected result
					System.out.println("title is correct");
				}else {
					System.out.println("title is not correct");
				}
				//driver.close();
				driver.quit();
				System.out.println("test is done");

			}

	}


