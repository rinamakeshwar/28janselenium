package locatar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contains
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.findElement(By.xpath("//a[contains(text(),'पासवर्ड ')]")).sendKeys("123");
		
	}

}
