package methods;
import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_027_WebTable_1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		for(int i =2; i<=7; i++) {
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			   if(element.getText().equals("Island Trading")) {
				   System.out.println("company name: "+ element.getText()+ " is found "+ "at position "+ (i-1));
				   break;
			   }
		}
		System.out.println("==================================");
		String afterXpathContact = "]/td[2]";
		for(int i= 2; i<=7; i++) {
			String actualXpath = beforeXpath + i + afterXpathContact;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		String afterXpathCountry = "]/td[3]";
		for(int i= 2; i<=7; i++) {
			String actualXpath = beforeXpath + i + afterXpathCountry;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		getColumnData(driver, beforeXpath, afterXpathCompany);
		getColumnData(driver, beforeXpath, afterXpathContact);
		getColumnData(driver, beforeXpath, afterXpathCountry);
	
	}
	
	public static int getTableCount(WebDriver driver){
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCount = rowList.size();
		//System.out.println(rowCount);
		return rowCount;
	}
	
	public static ArrayList<String> getColumnData(WebDriver driver, String beforeXpath, String afterXpath){
		ArrayList<String> data = new ArrayList<String>();
		for(int rowNum = 2; rowNum <= getTableCount(driver); rowNum++){
			String actualXPath = beforeXpath + rowNum + afterXpath;
			//System.out.println(actualXPath);
			String text = driver.findElement(By.xpath(actualXPath)).getText();
			System.out.println(text);
			data.add(text);
		}
		return data;
 
	}
}