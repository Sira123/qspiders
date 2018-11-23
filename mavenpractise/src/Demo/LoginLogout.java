package Demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginLogout extends SuperTestScript
{
	  @Test
      public void testLoginLogout()
      {
          	  //Fetch all neccessary data;
          String username=ExcelOperation.readData("TC_01", 1, 3);
    	  String password=ExcelOperation.readData("TC_01", 1, 4);
    	  String ExpLoginpageTitle=ExcelOperation.readData("TC_01", 1, 0);
    	  String ExpHomepageTitle=ExcelOperation.readData("TC_01", 1, 5);
    	  
    	  
    	  //Convert TestCase into TestScript
    	  LoginPage lp=new LoginPage();
    	  String ActLoginpageTitle = lp.getTitle();//fetch title from webpage
    	  String status1 = ValidationOperation.VerifyMsg(ExpLoginpageTitle, ActLoginpageTitle);//validating
    	  lp.enterUsername(username);
    	  lp.enterPassword(password);
    	  lp.clickOnLoginButton(); 
    	  OpenTaskPage ot=new OpenTaskPage();
    	  String ActHomepageTitle = ot.getTitle();
    	  String status2 = ValidationOperation.VerifyMsg(ExpHomepageTitle, ActHomepageTitle);
    	  ot.clickOnLogoutButton();
    	  
    	  //Write actual result and status in Excel sheet
    	  ExcelOperation.writeData("TC_01",1, 1, ActLoginpageTitle);//writing actual login page title in act result
    	  ExcelOperation.writeData("TC_01", 1, 2, status1);
    	  ExcelOperation.writeData("TC_01", 1, 6, ActHomepageTitle);
    	  ExcelOperation.writeData("TC_01", 1, 7, status2);
      }
      
}
