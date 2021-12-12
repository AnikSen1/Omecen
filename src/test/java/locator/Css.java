package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css {
	WebDriver driver;
	public static void main(String[] args) {
		Css obj=new Css();
		obj.openCss();
		obj.userName("samia");
		obj.passWord("Tithi");
		obj.logIn();
	}

	
	public void openCss() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		
	}
	public void userName(String userName) { 
		
		driver.findElement(By.cssSelector("#email")).sendKeys(userName);
	}
	
	
		public void passWord(String passWord ) {  
			
			//driver.findElement(By.cssSelector("#pass")).sendKeys(passWord);
		
		//driver.findElement(By.cssSelector("[placeholder='password']")).sendKeys(passWord);
		driver.findElement(By.cssSelector("[placeholder='Password'][name='pass']")).sendKeys(passWord);
	}
		
	
	
		public void logIn() {  
		
		driver.findElement(By.cssSelector("[id^='u_0_d_']")).click();
	}
}
