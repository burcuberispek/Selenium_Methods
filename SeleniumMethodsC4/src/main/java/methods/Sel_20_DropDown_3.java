package methods;




    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class Sel_20_DropDown_3 {
		
	        public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\burcu\\Documents\\Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/r.php");
			
			By day = By.id("day");
			By month = By.id("month");
			By year = By.id("year");
			
			selectDropdownValueByIndex(driver, day, 15);
			selectDropdownValueByIndex(driver, month, 5);
			selectDropdownValueByIndex(driver, year,2016);
		}
		private static void selectDropdownValueByIndex(WebDriver driver, By year, int i) {
				// TODO Auto-generated method stub
				
			}
		public static void selectDropdownValueByIndex(WebElement driver, By locator,  int number, int index) {
			WebElement element=getElement(driver,locator);
			Select select=new Select(element);
			select.selectByIndex(index);
		}
      public static WebElement getElement(WebElement driver,By locator) {
    	  WebElement element=driver.findElement(locator);
    	  return element;
		
	}
	}