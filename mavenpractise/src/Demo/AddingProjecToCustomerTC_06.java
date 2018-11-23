package Demo;

import org.testng.annotations.Test;

public class AddingProjecToCustomerTC_06 extends SuperTestScript
{
	@Test
	public void testAddingProjecToCustomerTC_06(){
//step:1 fetch all the data
		String username=ExcelOperation.readData("TC_06", 1, 0);
		String password=ExcelOperation.readData("TC_06", 1, 1);
		String customername=ExcelOperation.readData("TC_06", 1, 2);
		String projectname=ExcelOperation.readData("TC_06", 1, 3);
		String Expectedres=ExcelOperation.readData("TC_06", 1, 4);
		
		//step:2 create all objects
		LoginPage LP= new LoginPage();
		OpenTaskPage Ot= new OpenTaskPage();
		ActiveProjectsAndCustomersPage apcp = new ActiveProjectsAndCustomersPage();
		AddNewProject anp = new AddNewProject();
		
		LP.enterUsername(username);
		LP.enterPassword(password);
		LP.clickOnLoginButton();
		Ot.clickOnProjectsAndCustomersButton();
		apcp.clickOnAddNewProject();
		anp.selectingCustomerFromDropdown(customername);
		anp.enterProjectName(projectname);
		anp.clickOnCreateProjectButton();
	String ActRes = apcp.getSuccessMessage();
	apcp.clickOnLogoutButton();
	
	String status=ValidationOperation.VerifyMsg(Expectedres, ActRes);
	ExcelOperation.writeData("TC_06", 1, 5, ActRes);
	ExcelOperation.writeData("TC_06", 1, 6, status);
	
	
				
	}
}
