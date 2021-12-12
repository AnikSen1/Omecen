package searchContext;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		FindElement obj=new FindElement();
		obj.findElement();

	}
	
	public void findElement() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://inventory.omecen.com/");
	
	Thread.sleep(2000);                                        //Take 2 seconds to maximize the screen.
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Telling the website for wait 10 seconds.
	
	
	
	WebElement username=driver.findElement(By.name("username"));
	WebElement password=driver.findElement(By.name("password"));
	
	WebElement SignIn= driver.findElement(By.id("kt_login_signin_submit")); 
	
	String text=SignIn.getText();
	System.out.println("The text result is>> " +text );
	username.sendKeys("Anik");
	password.sendKeys("12345");
	Thread.sleep(3000);
	SignIn.click();
	
	
	}

}
