package tests;

import org.testng.annotations.BeforeClass;

import base.BaseClass;

public class Links extends BaseClass {
	
	
	
	@BeforeClass(groups={"smoke"})
	public void openApp() {
		openApp("chrome");
	}
	
	public void getLink() {
		
		
	}
	
	
	
	

}
/*List<WebElement>links=d.findElements(By.tagName(“a”));
To print this:  System.out.Println(links.size();
Now print text of all the links are visible:
For(inti=1;<=links.size();i++)
{
System.out.Println(links.get(i).getText());
}*/
