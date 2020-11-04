package methods;



import org.apache.commons.compress.compressors.CompressorException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3_Asg6_Burcu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.verizonwireless.com/");
		
		driver.findElement(By.xpath("//button[@id='gnav20-Shop-L1']")).click();
		
		driver.findElement(By.xpath("//a[@id='gnav20-Shop-L3-1']")).click();
		//Thread.sleep(4000);
		
		//driver.findElement(By.id("tile_dev13720122")).click();

//		WebElement phone=driver.findElement(By.xpath("//h1[@class='fontDSStd-75Bd fontSize_24 textAlignLeft color_000 deviceName']"));
//		Thread.sleep(2000);
//		String phonename=phone.getText();
//		System.out.println(phonename);
//		if (phonename.equals("Samsung Galaxy Z Fold2 5G")) {
//			System.out.println("Correct phonename ");
//		}else {
//			System.out.println("Incorrect phonename");
//		}
//		
	}

}
