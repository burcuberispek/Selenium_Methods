package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_003_WebDriverManager {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String title=driver.getTitle();
		System.out.println("page title:"+title);
		
		//verify
		if(title.equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			
		System.out.println("title is correct");
	}else {
		System.out.println("title is NOT correct");
	}
	driver.close();
	System.out.println("test completed...!");

	}

}
