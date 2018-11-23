package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProject extends HomePage
{
	
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	
	@FindBy(name="name")
	private WebElement projectNameTextField;

	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;

	  public AddNewProject()
	    {
	    	
	    	PageFactory.initElements(SuperTestScript.driver, this);
	    }
	
	public void selectingCustomerFromDropdown(String customername)
	{
		Select s1=new Select(customerDropdown);
		s1.selectByVisibleText(customername);
		
	}
	public void enterProjectName(String projectName)
	{
		projectNameTextField.sendKeys(projectName);
		
	}
	public void clickOnCreateProjectButton()
	{
		createProjectButton.click();
	}
	
	
}
