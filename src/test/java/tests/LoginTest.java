package tests;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;



public class LoginTest extends BaseClass {
	
	@BeforeClass(groups={"smoke"})
	
	
	public void openApp() {
		openApp("chrome");
	}
	@Test(groups={"smoke"},priority=0)
	public void positiveLoginTest()   {
	LoginPage lp=new LoginPage();
	lp.userName("admin");
	lp.password("admin_test");
	
	lp.signIn();
	
	}
	
	@Test(groups={"smoke"},priority=1)
	public void negativeLoginTest()  {
	LoginPage lp=new LoginPage();
	lp.userName("anik");
	lp.password("admin_test");
	
	lp.signIn();
	
	}
	
	@Test(groups={"smoke"},priority=2)
	public void nullLoginTest() {
	LoginPage lp=new LoginPage();
	lp.userName(" ");
	lp.password(" ");

	lp.signIn();
	}
	@AfterClass(groups={"smoke"})
	public void finishTest() {
			driver.quit();
		}
	}



