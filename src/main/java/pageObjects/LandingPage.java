package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By username=By.xpath("//*[@data-test='username']");
	By password=By.id("password");
	By login= By.id("login-button");
	By addcart1=By.id("add-to-cart-sauce-labs-backpack");
	By addcart2=By.id("add-to-cart-sauce-labs-bike-light");
	By addcart3=By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	By shpngcart=By.className("shopping_cart_link");
	By removecart1=By.id("remove-sauce-labs-backpack");
	By checkout=By.id("checkout");
	By firstname=By.xpath("//*[@data-test='firstName']");  
	By lastname=By.xpath("//*[@data-test='lastName']");
	By zipcode=By.xpath("//*[@data-test='postalCode']");
	By continue1 =By.xpath("//*[@data-test='continue']");
	By paymentinfo1=By.xpath("//*[contains(text(),'Payment Information:')]");
	//By error=By.xpath("//*[contains(text(),'Epic sadface: Username and password do not match any user in this service')]");
	
	By error=By.xpath("//*[@id='login_button_container']");
	
	 
	 
	
	
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLoginusername()
	{ return driver.findElement(username);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginbutton()
	{
	     return driver.findElement(login);
	      
	      
		
	}
	public WebElement addcartitem1()
	{
	   return  driver.findElement(addcart1);
		
	}
	public WebElement addcartitem2()
	{
	   return  driver.findElement(addcart2);
		
	}
	public WebElement addcartitem3()
	{
	   return  driver.findElement(addcart3);
		
	}
	public WebElement removecartitem1()
	{
	   return  driver.findElement(removecart1);
		
	}
	
	public WebElement shpngcartbutton()
	{
	   return  driver.findElement(shpngcart);
		
	}
	
	public WebElement checkoutbutton()
	{
	   return  driver.findElement(checkout);
		
	}
	public WebElement firstnametext()
	{
	   return  driver.findElement(firstname);
		
	}
	public WebElement lastnametext()
	{
	   return  driver.findElement(lastname);
		
	}
	public WebElement zipcodetext()
	{
	   return  driver.findElement(zipcode);
		
	}
	public WebElement continue1button()
	{
	   return  driver.findElement(continue1);
		
	}
	
	public WebElement paymentinfo1text()
	{
	   return  driver.findElement(paymentinfo1);
		
	}
	public WebElement errormsg()
	{
	   return  driver.findElement(error);
		
	}
	
	
}
