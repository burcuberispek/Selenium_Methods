package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_042_HeadlessModeFirefox {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fOptions = new FirefoxOptions();
		fOptions.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(fOptions);
		driver.get("https://siliconelabs.com");
		System.out.println(driver.getTitle());
		System.out.println("test is done...");
	}
}