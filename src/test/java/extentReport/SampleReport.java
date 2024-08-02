package extentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
@Test
public void BasicReport() {
	
	//Create spark reporter
	ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/samplereport.html");
	
	//Configure the spark reporter
	spark.config().setDocumentTitle("SampleReport");
	spark.config().setReportName("Tejaswini");
	spark.config().setTheme(Theme.DARK);
	
	//Create the extent report
	ExtentReports report = new ExtentReports();
			
	//Configure extent report
	report.setSystemInfo("Os", "Window-10");
	report.setSystemInfo("Browser", "Chrome-100");
	
	//attach the spark reporter to extent report
	report.attachReporter(spark);
	ExtentTest test =report.createTest("BasicReport");
	test.log(Status.INFO, "Report is successfully Created");
	report.flush();
	
	
}

}
