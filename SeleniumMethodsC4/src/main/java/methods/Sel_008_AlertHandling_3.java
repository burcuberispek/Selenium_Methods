package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Sel_008_AlertHandling_3 {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		By goBtn = By.name("proceed");
		//Launch browser
		driver = ElementUtils.launchBrowser(driver, "chrome");
		//Launch URL
		ElementUtils.launchURL(driver, url);
		//getTitle
		System.out.println(ElementUtils.getPageTitle(driver, goBtn));
		//Click on
		ElementUtils.clickOn(driver, goBtn);
		Thread.sleep(3000);
		String text = ElementUtils.getAlertText(driver);
		//verification
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct text");
		}else {
			System.out.println("in-correct text");
		}
		ElementUtils.quitBrowser(driver);
		System.out.println("Test is passed...!");
	}
}