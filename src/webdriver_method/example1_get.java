package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_get 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	driver.navigate().to("https://www.facebook.com");
		driver.navigate().("https://www.google.com");
	}
		
	}