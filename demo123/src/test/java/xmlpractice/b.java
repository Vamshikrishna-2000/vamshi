package xmlpractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class b{
	@Test
	@Parameters({"v1","v2"})

	public void productmultipledata(String uname,String pass) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement username=driver.findElement(By.id("Email"));
		WebElement password=driver.findElement(By.id("Password"));
		WebElement login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pass);
		login.click();
		driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/Admin/Category/List\"]")).click();
		Thread.sleep(2000);

		WebElement productname=driver.findElement(By.id("SearchCategoryName"));
		productname.sendKeys("Abc");
		driver.findElement(By.id("search-categories")).click();
		
		
	}	
		
	}