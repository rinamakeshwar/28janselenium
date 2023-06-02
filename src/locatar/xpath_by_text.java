package locatar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text 
{


	

	public static void main(String[] args)
	{
		
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	
 driver.findElements(By.xpath("//a[text()='पासवर्ड विसरलात?']")).click();
	
	
		
	}

}
