package project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class Verify extends base {

	@Test
	public void addticart () throws IOException 
	{
		driver=initializationDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l= new LandingPage(driver);
		String paymentinfo= l.paymentinfo1text().getText();
		Assert.assertEquals(paymentinfo, "Payment Information:");
		 
		 String itemTotalAmount = driver.findElement(By.xpath("//*[@class='summary_subtotal_label']")).getText();
		 System.out.println(itemTotalAmount);
		 Assert.assertEquals(itemTotalAmount, "Item total: $25.98");
		 
		 String TaxAmount = driver.findElement(By.xpath("//*[@class='summary_tax_label']")).getText();
		 System.out.println(TaxAmount);
		 Assert.assertEquals(TaxAmount, "Tax: $2.08");
		 String totalAmount = driver.findElement(By.xpath("//*[@class='summary_total_label']")).getText();
		 System.out.println(totalAmount);
		 Assert.assertEquals(totalAmount, "Total: $28.06");
		 
		 
		 driver.findElement(By.xpath("//*[@id='finish']")).click();
		 String Thankyou = driver.findElement(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")).getText();
		 Assert.assertEquals(Thankyou, "THANK YOU FOR YOUR ORDER");
		 
		 WebElement image = driver.findElement(By.xpath("//img[@class='pony_express']"));
			String	srcpath = image.getAttribute("src");
			System.out.println(srcpath);
			Assert.assertEquals(srcpath, "https://www.saucedemo.com/static/media/pony-express.46394a5d.png");
	}
}