package com.actitime;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class projectmodule  {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("OB",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("CB",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	@Test
	public void createproject() {
		Reporter.log("createproject",true);
	}
	@Test
	public void modifyproject() {
		Reporter.log("createproject",true);
	}
	@Test
	public void deleteproject() {
		Reporter.log("createproject",true);
	}

}
