package base;


	
	import java.awt.event.ItemEvent;
	import java.awt.event.ItemListener;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	public class Hw implements ITestListener{

		ExtentReports report;
		ExtentSparkReporter spark;
		ExtentTest test;
		
		@Override
		public void onTestStart(ITestResult result) {
			String name = result.getMethod().getMethodName();
			Reporter.log(name+" is Executed...");
			test=report.createTest(name);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			String name = result.getMethod().getMethodName();
			test.log(Status.PASS, name+"is Sucess..");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String name = result.getMethod().getMethodName();
			test.log(Status.FAIL, name+"is Failure..");
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			String name = result.getMethod().getMethodName();
			test.log(Status.SKIP, name+"is Skipped..");
		}
		

		@Override
		public void onStart(ITestContext context) {

			//Create Spark reporter
			
					spark = new ExtentSparkReporter("./Reports/DWS.html");
					
					//Configure the spark reporter
					spark.config().setDocumentTitle("SampleReport");
					spark.config().setReportName("Suraj");
					spark.config().setTheme(Theme.DARK);
					
					//Create the extent report
					 report = new ExtentReports();
					
					//Configure the Extent reports
					report.setSystemInfo("Os", "Windows 10");
					report.setSystemInfo("Browser", "Chrome");
					
					//Attch the spark reporter to Extent Report
					
					report.attachReporter(spark);
					ExtentTest test = report.createTest("ExecuteDWSTestCase");
					test.log(Status.INFO,"report is Succesfully Create");
					report.flush();
					
				
		}

		@Override
		public void onFinish(ITestContext context) {
			Reporter.log("onFinsih",true);
			report.flush();
		    
		}

		
		

	}


