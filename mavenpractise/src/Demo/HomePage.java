package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  extends SuperPage{
  
	@FindBy(className="logoutImg") 
	private  WebElement logoutButton;
	@FindBy(linkText="Users")
	private WebElement userButton;

	
	
	public HomePage()
	{
		PageFactory.initElements(SuperTestScript.driver,this);
		
	}
	
	public void clickOnLogoutButton()
	{
		logoutButton.click();
		
	}
	 
	public void ClickingonUsersButton()
	{
		
		userButton.click();
	}
}
