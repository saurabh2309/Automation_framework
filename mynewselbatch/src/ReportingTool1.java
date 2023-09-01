import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportingTool1 {
	@Test
	public void Test1()

	{
		ExtentReports report=new ExtentReports("./Reports/r.html",false);
		ExtentTest log1=report.startTest("tc1");
		log1.log(LogStatus.PASS,"tc passed");
		log1.log(LogStatus.FAIL,"tc failed");
		log1.log(LogStatus.SKIP,"tc skip");
		report.endTest(log1);
		report.flush();
		
	}
	
	
	

}
