package project;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	
	@Test
	public void addticart () throws IOException 
	{
		driver=initializationDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l= new LandingPage(driver);
		l.getLoginusername().sendKeys(prop.getProperty("username"));
		l.getpassword().sendKeys(prop.getProperty("pswrd"));
		l.loginbutton().click();
		l.addcartitem2().click();
		  l.addcartitem1().click();
			l.addcartitem2().click();
			l.addcartitem3().click();
			l.shpngcartbutton().click();
			l.removecartitem1().click();
			l.checkoutbutton().click();
			l.firstnametext().sendKeys("John");
			l.lastnametext().sendKeys("C");
			l.zipcodetext().sendKeys("333234");
			l.continue1button().click();
			
		
		
	}
	
	

}
