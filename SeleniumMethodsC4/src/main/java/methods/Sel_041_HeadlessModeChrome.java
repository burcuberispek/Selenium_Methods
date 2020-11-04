package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_041_HeadlessModeChrome {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(cOptions);
		driver.get("https://siliconelabs.com");
		System.out.println(driver.getTitle());
		System.out.println("test is done...");
	}
}