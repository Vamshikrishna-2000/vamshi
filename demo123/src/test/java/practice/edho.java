package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.invokers.TestMethodWithDataProviderMethodWorker;

public class edho {
	@Test
	public void contextclick() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement abc=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions act=new Actions(driver);
		act.contextClick(abc).build().perform();

}
	@Test
	public void particular() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement abc=driver.findElement(By.id("blogsmenu"));
		WebElement bbc=driver.findElement(By.xpath("//span[contains(text(),\"SeleniumOneByArun\")]"));
		Actions act=new Actions(driver);
		act.moveToElement(abc);
		Thread.sleep(2000);
		act.moveToElement(bbc).click().build().perform();	
	}
	@Test
	public void alltabledata() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		List<WebElement> head=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		for (int i=0;i<=head.size();i++) {
			System.out.print(head.get(i).getText()+"   ");
		}
	System.out.println();
	
	List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
	List<WebElement> colum = driver.findElements(By.xpath("/table[@id='table1']/tbody/tr[1]/td"));
	for (int i=0;i<=row.size();i++) {
		for (int j=0;j<=colum.size();j++) {
			 String dataw = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(dataw+"  ");
		}
		System.out.println();
		}

	}
	@DataProvider
	public String[][]testdata(){
		String[][] abc= {{"Lenovo IdeaCentre 600 All-in-One PC	"},{"pen"},{"HP Spectre XT Pro UltraBook"},{"house"},{"Adobe Photoshop CS4	"},{"book"},{"Nikon D5500 DSLR	"},{"data"},{"Samsung Series 9 NP900X4C Premium Ultrabook"},{"mobile"}};
		return (abc);
	
		}
		@Test(dataProvider = "testdata")
		public void checkthedata(String data) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//driver.findElement(By.xpath("//span[@class=\"button-text\"][1]")).click();
		//	driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			driver.findElement(By.xpath("//a[@class=\"nav-link active\"][1]")).click();
			driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]")).click();
			driver.findElement(By.id("SearchProductName")).sendKeys(data);
			driver.findElement(By.id("search-products")).click();
			List<WebElement> value=driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover table-striped dataTable no-footer\"]/tbody/tr/td[3]"));
			for (int i=0;i<=value.size();i++) {
				String vam=value.get(i).getText();
			
			if(vam.contains(data)) {

			System.out.println();
			}
			else {
				List<WebElement> inc=driver.findElements(By.xpath("//td[@valign=\"top\"]"));

				System.out.println(inc);
			}
			
			}
			
			
			
			
			
			
			
	
			
			
		}
			
		}
			
		
			
		
	