package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class day123 {
	@Test
	public void practice() {
	WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://kareclouds.com/site/login");
  driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
  driver.findElement(By.id("password")).sendKeys("Admin@123");
  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
  List<WebElement> links=driver.findElements(By.tagName("a"));
  for (int i=0;i<links.size();i++) {
System.out.println(links.get(i).getText());
}
}
	@Test
	public void practice2() {
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://kareclouds.com/site/login");
		  driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");
		  driver.findElement(By.id("password")).sendKeys("Admin@123");
		  driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		  WebElement abc=driver.findElement(By.xpath("//header[@class=\"main-header affix-top\"]"));
		  List<WebElement> links=abc.findElements(By.tagName("a"));
		  int count=0;
		  for (int i=0;i<links.size();i++) {	  
			  if (links.get(i).isDisplayed()) {
				  count++;
			  }
		  }
      System.out.println(count);
      System.out.println(links.size());
      System.out.println(links.size()-count);	
     	}
}