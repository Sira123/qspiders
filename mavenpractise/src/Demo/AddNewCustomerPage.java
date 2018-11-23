package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage extends HomePage
{
	@FindBy(name="na")
	private WebElement customerNameTextBox;
	
    @FindBy(name="createCustomerSubmit")	
	private WebElement createCustomerButton;
    
    public AddNewCustomerPage()
    {
    	PageFactory.initElements(SuperTestScript.driver, this);
    	
    }
    
    public void enterCustomerName(String customername)
    {
    	customerNameTextBox.sendKeys(customername);
    	
    }
    public void clickonCreateCustomerButton()
    {
    	
    	createCustomerButton.click();
    }
	
}
