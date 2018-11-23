package Demo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;


public class CommonLibaray 
{

	public void selectOptionFromDropdownByIndex(WebElement dropdown,int index)
	{
		Select sdd = new Select(dropdown);
		sdd.selectByIndex(index);
	}
	public void selectOptionFromDropdownByValue(WebElement dropdown,String value)
	{
		Select sdd = new Select(dropdown);
		sdd.selectByValue(value);
	}
	public void selectOptionFromDropdownByVisibleText(WebElement dropdown,String visibleText)
	{
		Select sdd = new Select(dropdown);
		sdd.selectByVisibleText(visibleText);
	
	}
	public String getTextOfAlertPopUp()
	{
		return   SuperTestScript.driver.switchTo().alert().getText();
		
	}
	public void clickOnOKButtonOfAlertPopup()
	{
		
		SuperTestScript.driver.switchTo().alert().accept();
	}
	
	public void clickOnCancelButtonOfAlertPopUp()
	{
		SuperTestScript.driver.switchTo().alert().dismiss();
	}
	
	public void takeScreenShot(String testMethodName)
	{
		EventFiringWebDriver efw = new EventFiringWebDriver(SuperTestScript.driver);
		File f1 = efw.getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:/failureImages/"+testMethodName+".png");
		try
		{
			FileUtils.moveFile(f1, f2);
		}
		catch(Exception rv)
		{
		}
		

	}
}