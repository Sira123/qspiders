package Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends SuperPage
{
     @FindBy(name="username")
	 private WebElement userNameTextBox;
     @FindBy(name="pwd")
     private WebElement passwordTextBox;
     @FindBy(xpath="//input[@type='submit']")
     private  WebElement loginButton;
     
     
  public LoginPage()
     {
    	 
    	PageFactory.initElements(SuperTestScript.driver, this);
    	 
     }
  
  
  public void enterUsername(String username)
  {
	  userNameTextBox.sendKeys(username);
	  
  }
  
  public void enterPassword(String password)
  {
	  passwordTextBox.sendKeys(password);
	  
  }
  
  public void clickOnLoginButton()
  {
	  
	  
	  loginButton.click();
  }
        
  
        
}
