


package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_minimize 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
	// driver.manage().window().minimize();
		
		
		//driver.manage().window().minimize();
		
		Options s1 = driver.manage();
		Window s2 = s1.window();
		s2.minimize();
		
	}

}