package practicepom;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testingclasspage extends basicfuntionality {	
		WebDriver driver;
		pageclassdata lp;
		
		@Test(dependsOnMethods = "verifyloginpage")
		public void verifyloginfuntion() {
           lp=new pageclassdata(driver);
			lp.performlogi("admin@yourstore.com", "admin");
		}

		@Test
	public void verifyloginpage() {
			driver=driverintilization();

		lp=new pageclassdata(driver);
		String actualvalue=lp.getpagetitle();
		String expetedvalue="Welcome, please sign in!";
		Assert.assertEquals(expetedvalue, actualvalue);
			
	}
}

		
		
