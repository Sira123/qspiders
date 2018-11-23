package Demo;

import org.testng.annotations.Test;



public class AddUserTC_05 extends SuperTestScript
{
	@Test
    public void AddUserTC_05()
    {
		String username=ExcelOperation.readData("TC_05", 1, 11);
		String password=ExcelOperation.readData("TC_05", 1, 12);
		String ExpRes= ExcelOperation.readData("TC_05", 1,13);
		 LoginPage lp=new LoginPage();
		 OpenTaskPage op=new OpenTaskPage();
		 UserListPage ulp=new UserListPage();
		 AddNewUserPage anu=new AddNewUserPage();
		 
	        lp.enterUsername(username);
	        lp.enterPassword(password);
	        lp.clickOnLoginButton();
		    op.clickOnUsersButton();
		    ulp.clickOnAddNewUserButton();
		    for(int i=0;i<=8;i++)
		    {
		    	String data = ExcelOperation.readData("TC_05", 1, i);
		    	anu.enterDataIntoAllTextFields(i, data);
		    	anu.clickOnAllCheckBoxes(i);
		    }
				 anu.enterDataIntoAllPaswordTextFields(0, ExcelOperation.readData("TC_05", 1,9));
				 anu.enterDataIntoAllPaswordTextFields(1, ExcelOperation.readData("TC_05", 1,10));
			
			anu.clickOnCreateUserButton();
			String ActRes=ulp.getSuccessMessage();
			ulp.clickOnLogoutButton();
			
			String status = ValidationOperation.VerifyMsg(ExpRes, ActRes);
			ExcelOperation.writeData("TC_05", 1, 14, ActRes);
			ExcelOperation.writeData("TC_05", 1, 15, status);
			
	      
				 
    	
    }
}
