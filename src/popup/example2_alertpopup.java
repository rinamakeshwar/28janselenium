

package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_alertpopup
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//get text from alert popup
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		Alert alt=driver.switchTo().alert();
		//click on ok button
	alt.accept();
		
		//click on second ok button
		alt.accept();
		
		
		//click on cancel button
		//driver.switchTo().alert().dismiss();
	}

}

