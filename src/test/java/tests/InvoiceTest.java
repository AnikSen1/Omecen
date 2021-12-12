package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InvoicePage;
import pages.LoginPage;

public class InvoiceTest extends BaseClass {
	@BeforeClass(groups={"smoke"})
	public void openApplication() {
		openApp("chrome");
	}
	
	
	@Test(groups={"smoke"})
	public void invoiceLinkTest() {
		
		LoginPage lp= new LoginPage();
		lp.userName("admin");
		lp.password("admin_test");
		lp.signIn();
		InvoicePage ip= new InvoicePage();
	}
	
	@AfterClass(groups={"smoke"})
	public void finish() {
	driver.quit();
	}

}
