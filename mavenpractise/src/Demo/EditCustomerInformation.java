package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerInformation extends HomePage
{
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement  deleteCustomerButton;
    
	
	public  EditCustomerInformation()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void deleteCustomer()
	{
		deleteCustomerButton.click();
		
	}
	public String getTextofAlertPopup()
	{
		return SuperTestScript.driver.switchTo().alert().getText();
	}
	
	 public void clickOnOkButtonOfAlertPopUp()
	    {
	    	
	    	SuperTestScript.driver.switchTo().alert().accept();
	    }
}
