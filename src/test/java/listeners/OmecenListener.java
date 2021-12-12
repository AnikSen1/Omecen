package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import base.BaseClass;

public class OmecenListener implements ITestListener {
	BaseClass bTest= new BaseClass();

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+ " Test just started.......");
		BaseClass.test.log(LogStatus.INFO, result.getName());
	}


	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ " method just pass.......");
		BaseClass.test.log(LogStatus.PASS, result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+ " method just fail.......");
		bTest.takeScreenShot();
		BaseClass.test.log(LogStatus.FAIL, result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+ " method just skip.......");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getName()+ " method just fail for time out");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+ " Suites just started");}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+ " Suites just Finished");
		BaseClass.driver.quit();
		bTest.writeReports();
	}
}
