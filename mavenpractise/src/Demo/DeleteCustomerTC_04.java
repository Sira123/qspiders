package Demo;

import org.testng.annotations.Test;


public class DeleteCustomerTC_04 extends SuperTestScript 
{
 @Test 
  public void testDeleteCustomerTC_04()
  {
	 String username=ExcelOperation.readData("TC_04", 1, 0);
     String password=ExcelOperation.readData("TC_04", 1, 1);
     String customername = ExcelOperation.readData("TC_04", 1, 2);
     String ExpRes=ExcelOperation.readData("TC_04", 1, 3);
     
     
     LoginPage lp=new LoginPage();
     OpenTaskPage op=new OpenTaskPage();
     ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
     EditCustomerInformation eci=new EditCustomerInformation();
     
     
     lp.enterUsername(username);
     lp.enterPassword(password);
     lp.clickOnLoginButton();
     op.clickOnProjectsAndCustomersButton();
     apcp.clickOnCustomerName(customername);
     eci.deleteCustomer();
     eci.clickOnOkButtonOfAlertPopUp();
     String ActRes=apcp.getSuccessMessage();
     eci.clickOnLogoutButton();
     
     
    String status = ValidationOperation.VerifyMsg(ExpRes, ActRes);
    
    
    ExcelOperation.writeData("TC_04" ,1, 4, ActRes);
    ExcelOperation.writeData("TC_04" ,1, 5, status);
	  
	  
  }
	
	
}
