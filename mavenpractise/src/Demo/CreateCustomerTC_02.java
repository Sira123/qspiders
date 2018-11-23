package Demo;

import org.testng.annotations.Test;


public class CreateCustomerTC_02 
{

	@Test
	public void testCreateCustomerTC_02()
	{
		//Fetch neccessary Data
		String username=ExcelOperation.readData("TC_02", 1, 0);
		String password=ExcelOperation.readData("TC_02", 1, 1);
		String customername = ExcelOperation.readData("TC_02", 1, 2);
	    String ExpResult = ExcelOperation.readData("TC_02", 1, 3);
	    
	    //Create all neccessary Objects
	    LoginPage lp=new LoginPage();
	    OpenTaskPage op=new OpenTaskPage();
	    ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
	    AddNewCustomerPage ancp=new AddNewCustomerPage();	
	    
	    //Convert TestCase into TestScript
	    lp.enterUsername(username);
        lp.enterPassword(password);
        lp.clickOnLoginButton();
        op.clickOnProjectsAndCustomersButton();
        apcp.clickOnAddNewCustomerButton();
        ancp.enterCustomerName(customername);
        ancp.clickonCreateCustomerButton();
        String ActResult = apcp.getSuccessMessage();
        ancp.clickOnLogoutButton();
          
        
        //Compare ExpResult and Actual Result
        String status = ValidationOperation.VerifyMsg(ExpResult, ActResult);
        
        
        //Write Actual Result and Status into Excelsheet
        ExcelOperation.writeData("TC_02", 1, 4, ActResult);
        ExcelOperation.writeData("TC_02", 1, 5, status);
 		
	}
	
}
