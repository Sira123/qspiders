package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class OpenTaskPage extends HomePage
{



@FindBy(linkText="Projects & Customers")
private WebElement projectsAndCustomerButton;

@FindBy(linkText="Users")
private WebElement userButton;
public OpenTaskPage()
{
	
	PageFactory.initElements(SuperTestScript.driver, this);
}
	


public void clickOnProjectsAndCustomersButton()
{
	projectsAndCustomerButton.click();
}
public void clickOnUsersButton()
{
	
	userButton.click();
}


          
}

	

	
	
	
	
	
	
	

