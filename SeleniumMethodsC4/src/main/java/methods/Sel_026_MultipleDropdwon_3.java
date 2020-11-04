package methods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_026_MultipleDropdwon_3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		selectMultipleDropdown(driver, "choice 2", "choice 2 1", "choice 5");
	}
	public static void selectMultipleDropdown(WebDriver driver, String... value) {
		List<WebElement> dropList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(dropList.size());
		for(int i= 0; i<dropList.size(); i++) {
			String text = dropList.get(i).getText();
			System.out.println(text);
			for(int j = 0; j<value.length; j++) {
				try {
					if(!text.isEmpty()) {
						if(text.equals(value[j])) {
							dropList.get(i).click();
							break;
						}
					}
				} catch (Exception e) {
					System.out.println("an exception occured while selecting dropdown");
				}
			}
		}
	}
}