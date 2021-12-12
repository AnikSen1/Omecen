package pages;

import org.openqa.selenium.By;

import base.BaseClass;


public class LoginPage extends BaseClass{
	
	
	public void userName(String userName) {
		  driver.findElement(By.name("username")).sendKeys(userName);
		 }
		 
		 public void password(String password) {
		  driver.findElement(By.name("password")).sendKeys(password);
		 }
		 
		 public void signIn() {
		  driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
  
 }


}
