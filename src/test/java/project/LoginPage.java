package project;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class LoginPage extends base {

	@BeforeTest
	public void initial() throws IOException
	{
		driver=initializationDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test(dataProvider="getData2")
	public  void basePageNavigation(String Username, String Password) throws IOException
	{   
		LandingPage l= new LandingPage(driver);
		l.getLoginusername().sendKeys(Username);
		l.getpassword().sendKeys(Password);
		l.loginbutton().click();
		//Question 2 solution
		String error= l.errormsg().getText();
		System.out.println(error);
		Assert.assertEquals(error, "Epic sadface: Sorry, this user has been locked out.");
		
	}
	
	@DataProvider
	public Object[][] getData1()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		
		
		return data;
	}
	
	@DataProvider
	public Object[][] getData2()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="locked_out_user";
		data[0][1]="secret_sauce";
		
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
