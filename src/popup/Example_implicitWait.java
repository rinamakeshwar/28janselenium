package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_implicitWait
{
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='नवीन खाते तयार करा']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("123");
	
}

}
