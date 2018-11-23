package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjectsAndCustomersPage extends HomePage
{
    @FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement  addNewCustomerButton;
    
    @FindBy(className="successmsg")
    private WebElement successMessage;
    
    @FindBy(xpath="//input[@value='Archive Selected Customers & Projects']")
    private WebElement archiveSeletedCustomersAndProjectsButton;
    
    @FindBy(xpath="//input[@value='Add New Project']")
    private WebElement addNewProjectButton;
    
    public ActiveProjectsAndCustomersPage()
    {
    	
    	PageFactory.initElements(SuperTestScript.driver, this);
    }
    
    public void clickOnAddNewCustomerButton()
    {
    	addNewCustomerButton.click();
    	
    }
    
    public String getSuccessMessage()
    {
    	return successMessage.getText();
    }
    
    public void clickonArchiveSeletedCustomersAndProjectsButton()
    {
    	archiveSeletedCustomersAndProjectsButton.click();
    	
    }
    public String getTextOfAlertPopup()
    {
    	
    	return SuperTestScript.driver.switchTo().alert().getText();
    }
    public void clickOnOkButtonOfAlertPopUp()
    {
    	
    	SuperTestScript.driver.switchTo().alert().accept();
    }
    public void clickOnCustomerName(String customerName)
    {
    	
    	SuperTestScript.driver.findElement(By.linkText(customerName)).click();
    	
    }
    public void clickOnAddNewProject()
    {
    	addNewProjectButton.click();	
    	
    }
    
}
