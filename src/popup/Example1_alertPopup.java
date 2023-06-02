package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_alertPopup 
{
  public static void main(String[] args)
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  
	  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
	  
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	  //get text
	  
	  String text= driver.switchTo().alert().getText();
	  System.out.println(text);
	  
	 Alert alt=driver.switchTo().alert();
	  //click on cancel button
	  
	  //driver.switchTo().alert().dismiss();
	  
	  //click on ok button
	  
	  driver.switchTo().alert().accept();
	  
	  
	  //get second popup text
	   String text1=driver.switchTo().alert().getText();
	  
	   System.out.println(text1);
	  //click  ok on second popup
	  
	  driver.switchTo().alert().accept();
	  
	  
	  
	  
	
}
}
