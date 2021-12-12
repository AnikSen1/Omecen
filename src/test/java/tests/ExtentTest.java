package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InvoicePage;
import pages.LoginPage;

public class ExtentTest extends BaseClass{
@BeforeClass(groups={"smoke"})
	
	
	public void openApp() {
		openApp("chrome");
	}
	@Test(groups={"smoke"},priority=1)
	public void positiveLoginTest()   {
		extent.startTest("positiveLoginTest");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	LoginPage lp=new LoginPage();
	lp.userName("admin");
	lp.password("admin_test");
	
	lp.signIn();
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://inventory.omecen.com/dashboard");
	}
	@Test(groups={"smoke"},priority=2)
	public void forwordTest()   {
		extent.startTest("forwordTest");
	LoginPage lp=new LoginPage();
	lp.userName("admin");
	lp.password("admin_test");
	
	
	lp.signIn();
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	InvoicePage ip= new InvoicePage();
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	
	}

	
	  @AfterClass(groups={"smoke"})
	  public void finishTest() { if (driver!=null) {
	  driver.quit(); } }
	 
  
  }
  
 