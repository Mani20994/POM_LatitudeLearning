package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends com.crm.qa.base.TestBase {
LoginPage loginpage;

public LoginPageTest() {
 super();
}

 @BeforeMethod
public void setUp() {
   initialization();
 loginpage = new LoginPage();
 
}
 
 @Test(priority=1)
 public void loginPageTitleTest() {
  
   String title = loginpage.validateLoginPageTitle();
   Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
 }
 
 
 @Test(priority=2)
 public void crmlogoImageTest() {
  boolean flag = loginpage.validateCRMImage();
  Assert.assertTrue(flag);
 }
 
 @Test(priority=3)
 public void loginTest() throws InterruptedException {
  loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
 }

@AfterMethod
public void tearDown() {
 driver.quit();
}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
