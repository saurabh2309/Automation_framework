package Myprogramme;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerclass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("tc exe start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc exe sucessful");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc exe fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc skipp");
	}

	
	
	
	
	
	
	
	
	
}
