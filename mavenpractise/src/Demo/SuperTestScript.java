package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(FrameWorkListner.class)
abstract public class SuperTestScript {
	
	public static WebDriver driver;
	@BeforeTest
	public void preConfig()
	{
		String browsertype=ExcelOperation.readData("preConfig", 1, 0);
		String URL=ExcelOperation.readData("preConfig", 1, 1);
		
		if(browsertype.equals("ff"))
		{
		System.setProperty("webdriver.gecko.driver", "G:\\SeleniumStandAloneServer\\work\\mozilla\\geckodriver.exe");	
	    driver=new FirefoxDriver();
		}
		else if(browsertype.equals("gc"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\SeleniumStandAloneServer\\work\\chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			
	    }
		else
		{
			System.setProperty("webdriver.ie.driver", "G:\\SeleniumStandAloneServer\\work\\IE\\MicrosoftWebDriver.exe");
        		driver=new InternetExplorerDriver();	
		}
	
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		
		
		
	}
	@AfterTest
	public void postConfig()
	{
		
		
		driver.close();
		
		
	}

}
