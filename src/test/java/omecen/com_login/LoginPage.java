package omecen.com_login;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		//open the browser
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://inventory.omecen.com/");
		Thread.sleep(2000);                                        //Take 2 seconds to maximize the screen.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Telling the website for wait 10 seconds.
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin_test");
		
		driver.findElement(By.id("kt_login_signin_submit")).click();
		/*or
		driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();*/

		
		System.out.println("hello");
		
	}
	

	

}
