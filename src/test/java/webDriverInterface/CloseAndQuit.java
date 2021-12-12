package webDriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAndQuit {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		CloseAndQuit obj= new CloseAndQuit();
		//obj.openApp();
		//obj.closeApp();
		//obj.quit();
		obj.openAndQuit();
	}
	
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://inventory.omecen.com/");
		
	}
	public void closeApp() {
		openApp();
		System.out.println("This is the title: " + driver.getTitle());
		driver.close();
		
	}
	
	public void quit() {
		openApp();
		System.out.println("This is the title: " + driver.getTitle());
		//driver.quit();
	}
	
	public void openAndQuit() throws InterruptedException{
		   
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.assurancewireless.com/");
			 driver.findElement(By.linkText("Coverage Map")).click();
			 Thread.sleep(4000);
			 //driver.close();
			     driver.quit();
			  
			  // difference between close and quit
			  // close method only close current window
			  // quit method close/ kill all windows

		
	}

}
