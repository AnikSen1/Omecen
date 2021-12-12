package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class InvoicePage extends BaseClass{
	public void invoiceLink() {
		driver.findElement(By.xpath("(//*[contains(text(),'New Invoice')])[2]")).click();
	}

}
