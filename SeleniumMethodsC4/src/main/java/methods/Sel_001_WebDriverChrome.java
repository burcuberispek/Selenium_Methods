package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_001_WebDriverChrome {

	public static void main(String[] args) {
		//Set property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\burcu\\Documents\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
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
