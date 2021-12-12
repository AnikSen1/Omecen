package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InventoryPage;
import pages.LoginPage;

public class InventoryTest extends BaseClass {
	
	
	@BeforeClass
	public void op() {
		openApp("chrome");
	}
	
	
	@Test
	public void logIN() {
		
		LoginPage lp= new LoginPage();
		lp.userName("admin");
		lp.password("admin_test");
		lp.signIn();
	}
	@Test
	public void clickpament() {
		InventoryPage ip=new InventoryPage();
		ip.payment();
	}
	
	
	@AfterClass
	public void finish() {
		driver.quit();
	}

}
