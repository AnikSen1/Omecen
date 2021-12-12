package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class InventoryPage extends BaseClass {
	
	
	

	public void payment() {
		driver.findElement(By.xpath(" //span[@class='btn btn-info']")).click();  
	}

}

