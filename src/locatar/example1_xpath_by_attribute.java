package locatar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_xpath_by_attribute
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		//enter UN
		//driver.findelement("LocatorType");
		//driver,FindElement(by.xpath("XpathExpression");
       // driver.findElements("xPath");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		
		
		//enter password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("231");
		
		//click on login
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
		
	}


}
