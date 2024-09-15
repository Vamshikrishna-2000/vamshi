package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day2 {


	@Test
	public void listboxpractise() {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		List<WebElement> listboxes =driver.findElements(By.tagName("a"));
		
		System.out.println(listboxes.size());
		
		for (int i=0;i<=listboxes.size();i++) {
			if (listboxes.get(i).isDisplayed()) {
				
			
			System.out.println(listboxes.get(i).getText());
		}}

	}}