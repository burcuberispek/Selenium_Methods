package methods;

public class sel_interwiev {

	public static void main(String[] args) {
		//to set the size of the window in sel
		driver.manage().window().setSize(new Dimension(600, 800));
		
		//to fetch the size of window in sel
		Dimension size = driver.manage().window().getSize();
		int width = size.getWidth();
		int height = size.getHeight();
        
		//to handle proxy in sel for chrome
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("username:password.siliconelabs:4555");
		options.setCapability("proxy", proxy);
		ChromeDriver driver = new ChromeDriver();
		
		//to get all cookies from system
		driver.manage().getCookies();
		
		//to get specific cookie from web page
		driver.manage().getCookieNamed("ilhan");
		
		//to add cookie
		Cookie cookie = new Cookie("test1", "ilhan");
		driver.manage().addCookie(cookie);
		
		//to delete all cookies
		deleteAllCOOKIES()
		
		//to delete specific cookie
		driver.manage().deleteCookieNamed("ilhan");
		
		//
	
	}

}
