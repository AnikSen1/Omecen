package base;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import extentManager.ExtentReport;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ExtentReports extent= ExtentReport.getinstance();
	public static WebDriver driver;
	public static ExtentTest test;

public void openApp(String bType) {
    test=extent.startTest("This is BaseClass");
	test.log(LogStatus.INFO, bType, " browser is opened");
 if (bType.equalsIgnoreCase("chrome")) {
   WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();
   
 }
 
 else if(bType.equalsIgnoreCase("firefox")) {
  WebDriverManager.firefoxdriver().setup();
  
  driver=new FirefoxDriver();
 }

 else {
  System.out.println("you did not specify correct driver");
 }
 
 
 
 driver.get("https://inventory.omecen.com/");
 test.log(LogStatus.INFO, " App is opened");
 
 driver.manage().window().maximize();
 test.log(LogStatus.INFO, " Window is maximized");
 
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 /*String actualTile= driver.getTitle();
 System.out.println(actualTile);
 if ("A Product of Bost IT Solution - Inventory".equalsIgnoreCase(actualTile)) {
	 System.out.println("right title");	
}
 else {
	 System.out.println("wrong title");
}*/
 Assert.assertEquals(driver.getTitle(),"A Product of Bost IT Solution - Inventory");
}


public void takeScreenShot(){
	  // store screenshot in that file
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  try {
	   //FileUtils.copyFile(src, new File("C:\\images\\pic.png"));
	   FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//images//pic.png"));
	   
	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	  //test.log(LogStatus.INFO,test.addScreenCapture("C:\\images\\pic.png"));
	  test.log(LogStatus.INFO,test.addScreenCapture(System.getProperty("user.dir")+"//images//pic.png"));
	 }

public void writeReports() {
	if(extent!=null) {
		extent.endTest(test);
		extent.flush();
	}
}
}
