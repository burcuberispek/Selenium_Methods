package methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week2_Asg2_Burcu_PromptBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bobit.us/Practice");
		
		driver.findElement(By.xpath("//li[@id='j1_24']/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("j1_29_anchor")).click();	
        
//		//nothing was entered just clicked on for enter name text
//		driver.findElement(By.xpath("//*[@id=\"practice5-5\"]/div[2]/div[3]/div[2]/button")).click();
//		Alert alert1=driver.switchTo().alert();
//		alert1.accept();
//		String text1=driver.findElement(By.xpath("//*[@id=\"prompt-demo\"]")).getText();
//		
//		if(text1.equals("You have entered 'Enter name' !")) {
//			System.out.println("User did not chance value and click on OK button");
//				
//		}
		
//		//name was entered
//		driver.findElement(By.xpath("//*[@id=\"practice5-5\"]/div[2]/div[3]/div[2]/button")).click();
//		Alert alert2=driver.switchTo().alert();
//		alert2.sendKeys("Burcu");
//		alert2.accept();
//		String text2=driver.findElement(By.xpath("//*[@id=\"prompt-demo\"]")).getText();
//		
//		 if (!text2.equals("You have entered 'Enter name' !")) {
//			System.out.println("User enter name and click Ok button");
//			
//		 }
		 
		//clicked on cancel	
		driver.findElement(By.xpath("//*[@id=\"practice5-5\"]/div[2]/div[3]/div[2]/button")).click();
		Alert alert3=driver.switchTo().alert();
		alert3.dismiss();
		String text3=driver.findElement(By.xpath("//*[@id=\"prompt-demo\"]")).getText();
		if(text3.isEmpty()) {
			System.out.println("User did not enter any value and click cancel button");
		}
		
		
		driver.close();
		
	}

}
