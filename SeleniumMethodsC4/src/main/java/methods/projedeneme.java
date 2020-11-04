package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.webkitURL;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class projedeneme {

	
		    public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://onlinestudent.ispeakbetter.com/onlinestudent.php");
			Thread.sleep(2000);
			By loginBtn=By.xpath("//a[@id='cmdSiginLink']");
			Thread.sleep(2000);
			driver.findElement(loginBtn).click();
			//WebElement elementloginBtn=driver.findElement(loginBtn);
			Thread.sleep(2000);
			//elementloginBtn.click();
			
			
			
			By mail=By.xpath("//input[@id='_email']");
			By password=By.xpath("//input[@id='_password']");
			By submitBtn=By.xpath("//button[@id='cmdSignin']");
			
			
			WebElement elementmail=driver.findElement(mail);
			WebElement elementpassword=driver.findElement(password);
			WebElement elementsubmitBtn=driver.findElement(submitBtn);
			
//			WebDriverWait wait = new WebDriverWait(driver, 5);
//			wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
			
			Thread.sleep(2000);
	        elementmail.sendKeys("burcuberispek@gmail.com");
	        
			elementpassword.sendKeys("burcuberispek24031979");
			elementsubmitBtn.click();
			
			Thread.sleep(3000);
			By goodevening=By.xpath("//div[@id='dashboard_goodday']");
			Thread.sleep(3000);
			WebElement elementgoodevening=driver.findElement(goodevening);
			Thread.sleep(3000);
			String text=elementgoodevening.getText();
			System.out.println(text);
			Thread.sleep(3000);
			By launchpadBtn=By.xpath("//div[@id='launch-pad']");
			Thread.sleep(3000);
			driver.findElement(launchpadBtn).click();
			Thread.sleep(3000);
			By profile=By.xpath("//*[@id=\"subnav\"]/div/div[1]/ul/li[3]/a");
			WebElement elementprofile=driver.findElement(profile);
			elementprofile.click();
			By studentname=By.id("studentname");
			
			WebElement elementstudentname=driver.findElement(studentname);
			Thread.sleep(3000);
			
			String studentnametext=elementstudentname.getText();
			boolean nameisEnable=elementstudentname.isEnabled();
			System.out.println(studentnametext);
			System.out.println(nameisEnable);
			
			
			
			
			
			
			
			
			
//			
//			By democlassBtn=By.xpath(//a[contains(text(),'Redeem demo class')]);//degisiyor
//			Thread.sleep(3000);
//			
//			WebElement elementdemoclassBtn=driver.findElement(democlassBtn);
//			Thread.sleep(3000);
//			System.out.println(elementdemoclassBtn.isEnabled());
//           
//			Thread.sleep(2000);
//			
//			
//			
//			By timezoneBtn=By.xpath("//iframe[@id='iframedemoclass']");
//			By nextBtn=By.xpath("/html/body/form/div/div/div/span/button");
//			By instructor=By.xpath("//center[contains(text(),'Leandro B.')]");
//			By time=By.xpath("//input[@value='06:45']");
//			By nextBtnontime=By.xpath("//button[@name='teacherschedule']");
//			By confirmtext=By.xpath("//div[@class='alert alert-info']");
//			By yesBtn=By.xpath("//button[@onclick='save_democlass();']");
//			By backBtn=By.xpath("//a[@class='btn btn-sm btn-default']");
//
//			
//			WebElement elementtimezoneBtn=driver.findElement(timezoneBtn);
//			WebElement elementnextBtn=driver.findElement(nextBtn);
//            WebElement elementinstructor=driver.findElement(instructor);
//			WebElement elementtime=driver.findElement(time);
//			WebElement elementnextBtnontime=driver.findElement(nextBtnontime);
//			WebElement elementconfirmtext=driver.findElement(confirmtext);
//			WebElement elementyesBtn=driver.findElement(yesBtn);
//			WebElement elementbackBtnBtn=driver.findElement(backBtn);
//			
//			
//			
//			elementtimezoneBtn.click();
//			Thread.sleep(2000);
//			Select select=new Select(elementtimezoneBtn);
//			select.selectByVisibleText("America (America/New_York)");
//			Thread.sleep(2000);
//			
//			elementnextBtn.click();
//			Thread.sleep(2000);
//			
//			elementinstructor.click();
//			Thread.sleep(2000);
//			
//			elementnextBtnontime.click();
//			Thread.sleep(2000);
//			
//			String text=elementconfirmtext.getText();
//			if (text.contains("Please confirm.")) {
//				elementyesBtn.click();
//				
//			}else {
//				elementbackBtnBtn.click();
//			}
//			
//			
//			elementtime.click();
//			Thread.sleep(2000);
//			
//			
//			
//			
			
		}

}
