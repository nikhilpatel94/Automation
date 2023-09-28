package com.zoho;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.grid.Main;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class COustoner {
	
	@BeforeClass
	public void OB() {
		Reporter.log("OB");
		Assert.fail();
	}
	@AfterClass
	public void CB() {
		Reporter.log("CB");
	}
	
		@Test
		public void ccustomer() {
			Reporter.log("Customermodule");
			Assert.fail();
		}
		@Test
		public void mustomer() {
			Reporter.log("modifycustomer");
		}
		@Test
		public void deltomer() {
			Reporter.log("deletecustomer");
		}
	

	}

