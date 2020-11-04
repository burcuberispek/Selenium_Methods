package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Sel_18_Dropdown_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/bobit/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
//		selectDropdownValueByText(day, "13");
//		selectDropdownValueByText(month, "Jan");
//		selectDropdownValueByText(year, "2008");
		selectDropdownValueByIndex(day, 7);
		selectDropdownValueByIndex(month, 7);
		selectDropdownValueByIndex(year, 7);
	}
	/**
	 * 
	 * @param element
	 * @param value
	 */
	public static void selectDropdownValueByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	/**
	 * 
	 * @param element
	 * @param index
	 */
	public static void selectDropdownValueByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
}