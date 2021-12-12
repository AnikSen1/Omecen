package webDriverInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserApplication {

	public static void main(String[] args) {
		
		OpenBrowserApplication obj=new OpenBrowserApplication();
		obj.chromeDriver();
		obj.firefoxDriver();

	}
	public void chromeDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://inventory.omecen.com/");
	}
	
	public void firefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://inventory.omecen.com/");
	}
}
