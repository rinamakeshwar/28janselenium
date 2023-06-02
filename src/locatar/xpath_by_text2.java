package locatar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text2 
{
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver(By.xpath("https://www.facebook.com/"));
		
		//create new ACCOUNT
		
		driver.findElement(By.xpath("//a[text()='नवीन खाते तयार करा']")).click();
		
	}



		
	}


