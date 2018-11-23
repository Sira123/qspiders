package Demo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPage extends HomePage
{
    @FindBys(@FindBy(xpath="//input[@type='text']"))
    private List<WebElement> allTextFields;

    @FindBys(@FindBy(xpath="//input[@type='checkbox']"))
    private List<WebElement> allCheckBoxes;
    
    @FindBys(@FindBy(xpath="//input[@type='password']"))
    private List<WebElement> allPasswordTextField;
    
    @FindBy(xpath="//input[@type='submit']")
    private WebElement createUserButton;
    
    public AddNewUserPage()
    {
    	PageFactory.initElements(SuperTestScript.driver, this);
    	
    }
    
    public void enterDataIntoAllTextFields(int i,String data)
    {
    	allTextFields.get(i).sendKeys(data);
    	
    }
    public void enterDataIntoAllPaswordTextFields(int i,String data)
    {
    	allPasswordTextField.get(i).sendKeys(data);
    	
    }
    public void clickOnAllCheckBoxes(int i)
    {
    	allCheckBoxes.get(i).click();
    	
    }
    public void clickOnCreateUserButton()
    {
    	createUserButton.click();
    }
    
    
    
    
}

