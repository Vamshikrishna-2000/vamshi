package practicepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageclassdata {
	WebDriver driver;
	public pageclassdata(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(id="Email")
	WebElement unamefiled;
	
	@FindBy(id = "Password")
	WebElement passfiled;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbutton;
	
	@FindBy(xpath = "//strong[contains(text(),\"Welcome, please sign in!\")]")
	WebElement pagetitle;
	
	@FindBy(id = "RememberMe")
	WebElement checkbox;


	public String getpagetitle() {
		return pagetitle.getText();

	}

	public void clickoncheckbox() {
		checkbox.click();
	}
	public void performlogi(String uname,String pwd) {
		unamefiled.clear();	unamefiled.sendKeys(uname);
		passfiled.clear();	passfiled.sendKeys(pwd);
		loginbutton.click();
	}
}
