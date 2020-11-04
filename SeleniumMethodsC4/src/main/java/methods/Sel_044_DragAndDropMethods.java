package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_044_DragAndDropMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
        WebElement sourceElement=driver.findElement(By.id("draggable"));
        WebElement targetElement=driver.findElement(By.id("droppable"));
        
        //Actions 
        Actions actions=new Actions(driver);
        
       // actions.dragAndDrop(sourceElement, targetElement).build().perform();//build olmadan da calisir.release ile de calisir
        
        actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
        //relase ve build olmadan da calisabilir
	}

}
