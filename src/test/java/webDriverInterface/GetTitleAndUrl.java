package webDriverInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleAndUrl {
	
	WebDriver driver;

	public static void main(String[] args) {
		GetTitleAndUrl obj=new GetTitleAndUrl();
		obj.getTitle();
		obj.getUrl();

	}
	
	public void getTitle() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://inventory.omecen.com/");
		
		String title=driver.getTitle();
		System.out.println("This is the title of Omecen: " + title);
		
	}

	public void getUrl() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://inventory.omecen.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println("This is the URL of Omecen: " + url);
		
}
}
