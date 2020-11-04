package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hotels {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotels.com/");
		String title=driver.getTitle();
		System.out.println("page title:"+title);
		
		//By destination=By.xpath("//input[@id='qf-0q-destination']");
		WebElement elementdestination=driver.findElement(By.id("qf-0q-destination"));
		elementdestination.click();
		elementdestination.sendKeys("Boston, Massachusetts, United States of America");
		
	    Thread.sleep(2000);
		WebElement elementBoston=driver.findElement(By.xpath("//tbody/tr[@id='citysqm-asi0-s0']/td[1]"));
		Thread.sleep(2000);
		elementBoston.click();
		
		
		WebElement elementcheckin=driver.findElement(By.id("qf-0q-localised-check-in"));
		elementcheckin.click();
		WebElement elementCheckInDate=driver.findElement(By.xpath("//a[contains(text(),'31')]"));
		elementCheckInDate.click();
		
		WebElement elementcheckout=driver.findElement(By.id("qf-0q-localised-check-out"));
		Thread.sleep(2000);
		elementcheckout.click();
		WebElement elementCheckOutDate=driver.findElement(By.xpath("//body[1]/div[8]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[6]"));
		Thread.sleep(2000);
		elementCheckOutDate.click();
		
		WebElement elementroom=driver.findElement(By.id("qf-0q-rooms"));
		elementroom.click();
		Thread.sleep(2000);
		Select selectRoom=new Select(elementroom);
		selectRoom.selectByVisibleText("1");
		
		WebElement elementAdult=driver.findElement(By.id("qf-0q-room-0-adults"));
		elementAdult.click();
		Thread.sleep(2000);
		Select selectAdult=new Select(elementAdult);
		selectAdult.selectByVisibleText("2");
		
		WebElement elementChild=driver.findElement(By.id("qf-0q-room-0-children"));
		elementChild.click();
		Select selectChild=new Select(elementChild);
		selectChild.selectByVisibleText("2");
		
		WebElement elementFirstChild=driver.findElement(By.id("qf-0q-room-0-child-0-age"));
		elementFirstChild.click();
		Select selectFirstChild=new Select(elementFirstChild);
		selectFirstChild.selectByVisibleText("4");
		
		
		WebElement elementSecondChild=driver.findElement(By.id("qf-0q-room-0-child-1-age"));
		elementSecondChild.click();
		Select selectSecondChild=new Select(elementSecondChild);
		selectSecondChild.selectByVisibleText("9");
		
		
		WebElement elementSearchBtn=driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		elementSearchBtn.click();
		
		WebElement elementStarRate=driver.findElement(By.xpath("//span[@aria-label=\"3-star\"]"));
		Thread.sleep(2000);
		elementStarRate.click();
		Thread.sleep(2000);
		
		
		WebElement elementHiltonRate=driver.findElement(By.xpath("//body/div[@id='main-content']/main[1]/div[2]/div[2]/div[1]/section[2]/div[1]/ol[1]/li[1]/article[1]/section[1]/div[1]/div[1]/div[1]/span[1]"));
		String text=elementHiltonRate.getText();
		System.out.println(text);
	}

}
