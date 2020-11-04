package methods;


	import java.util.List;
	​
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	​
	import io.github.bonigarcia.wdm.WebDriverManager;
	​
	public class Recap_CemilH {
	​
		public static void main(String[] args) throws InterruptedException {
	​
			WebDriverManager.chromedriver().setup();
	​
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bobit.us/Practice");
			driver.findElement(By.xpath("//li[@id='j1_2']/i")).click();
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.e)
			Thread.sleep(4000);
			driver.findElement(By.linkText("Select Dropdown List")).click();
	​
			WebElement dropDown = driver.findElement(By.id("select-demo"));
	​
			Select select = new Select(dropDown);
			List<WebElement> dropDownList = select.getOptions();
	​
			for (int i = 0; i < dropDownList.size(); i++) {
				System.out.println(dropDownList.get(i).getText());
			}
			select.selectByIndex(5);
			System.out.println(select.isMultiple());
			System.out.println("\n*********\n");
			By multiDropDown = By.xpath("//select[@id='multi-select']//option");
			selectValue(driver, multiDropDown, "Texas", "New Jersey");
			
			WebElement element = driver.findElement(By.id("multi-select"));
			Select multiSelect = new Select(element);
			System.out.println(multiSelect.isMultiple());
			
	​
		}
	​
		public static void selectValue(WebDriver driver, By locator, String... value) {
			List<WebElement> multiDropDown = driver.findElements(locator);
	​
			for (int i = 0; i < multiDropDown.size(); i++) {
				String text = multiDropDown.get(i).getText();
				
				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						multiDropDown.get(i).click();
					}
				}
	​
			}
	​
		}
	}
	









}
