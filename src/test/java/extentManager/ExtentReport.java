package extentManager;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {
	public static ExtentReports extent;
	
	
public static ExtentReports getinstance() {                //ExtentReports is dataType.
	if (extent==null) {
		//extent = new ExtentReports(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date()) + "reports.html");
		extent = new ExtentReports("reports.html");
		extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
	   extent.addSystemInfo("TesterName", "Anik")
	   .addSystemInfo("ProjectName", "Omecen")
	   .addSystemInfo("Environment", "QA");
}
	return extent;
}
}
