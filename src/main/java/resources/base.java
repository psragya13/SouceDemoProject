package resources;
 import java.io.FileInputStream;
 
 import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 

public class base {
	
	public  WebDriver driver;
	public Properties prop;
	public WebDriver initializationDriver() throws IOException
	{ 
		prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\prachi.sharma1\\eclipse-workspace\\E2E\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName =prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{System.setProperty("webdriver.chrome.driver","C://Users//prachi.sharma1//Downloads//chromedriver_win32//chromedriver.exe");
		 driver = new ChromeDriver();
		}
		else
		{System.setProperty("webdriver.gecko.driver","C://Users//prachi.sharma1//Downloads//gecko_win32//gecko.exe");
		 driver = new FirefoxDriver();
		
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver inital()
	{
		driver=new ChromeDriver();
		return driver;
		
	}

}

