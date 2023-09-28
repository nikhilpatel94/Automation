package com.actitime;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitine.geniric.basic;

public class Customermodule extends basic{
	/*@BeforeClass
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
	}*/
	@Test
	public void createcustomer() {
		Reporter.log("Customermodule",true);
	}
	@Test
	public void modifycustomer() {
		Reporter.log("modifycustomer",true);
	}
	@Test
	public void deletecustomer() {
		Reporter.log("deletecustomer",true);
	}



}
