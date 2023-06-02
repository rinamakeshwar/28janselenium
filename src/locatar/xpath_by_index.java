package locatar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_index
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new account
		driver.findElement(By.xpath("//a[text()='नवीन खाते तयार करा']")).click();
		
		
		Thread.sleep(2000);
		
		//enter FN
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		
		Thread.sleep(2000);
		//enter Surname
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("borghate");
		
		//enter mo no
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9999999999");
	}

}
