package practicepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class dashboardpagedata {
   WebDriver driver;
   public  dashboardpagedata(WebDriver driver) {
	 this.driver=driver;
	   PageFactory.initElements(driver, this);
	   	   
}
   @FindBy(xpath ="//i[@class='nav-icon fas fa-book']")
   WebElement cateloglink;
   @FindBy(xpath = "//a[@href=\'/Admin/Product/List\']")
   WebElement productlink;
   @FindBy(xpath =" //a[@href='/Admin/Category/List']")
   WebElement Categorylink;
   @FindBy(xpath = "//a[@href='/Admin/Manufacturer/List']")
   WebElement manufacturinglink;
   @FindBy(xpath = "//a[@href='/logout']")
   WebElement logoutlink;
   
   
   public String getpagetitledashboadpage() {
   return driver.getTitle(); 
}
   public void clickoncatelog() {
	   cateloglink.click();
   }
   public void clickonproduct() {
	   productlink.click();
   }
   public void clickoncategory() {
	   Categorylink.click();
   }
   public void clickonmanufacturing() {
	   manufacturinglink.click();
   }
   public void clickonlogout() {
	   logoutlink.click();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
