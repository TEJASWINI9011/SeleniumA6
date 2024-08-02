package com.crm.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportWithMultiTestCase implements ITestListener{
      
	ExtentReports report;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		String t_name =result.getMethod().getMethodName();
		Reporter.log(t_name+ "is executed");
		test=report.createTest(t_name);     //because of this line program can't run
		
		
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String t_name =result.getMethod().getMethodName();
		test.log(Status.PASS,t_name+"is success");
		test =report.createTest(t_name);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String t_name =result.getMethod().getMethodName();	
		test.log(Status.FAIL,t_name+"is Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String t_name =result.getMethod().getMethodName();
		test.log(Status.SKIP,t_name+"is skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		
		
		//Create spark reporter
		 spark = new ExtentSparkReporter("./Reports/Multiple.html");
		
		//Configure the spark reporter
		spark.config().setDocumentTitle("SampleReport");
		spark.config().setReportName("Tejaswini");
		spark.config().setTheme(Theme.DARK);
		
		//Create the extent report
		 report = new ExtentReports();
				
		//Configure extent report
		report.setSystemInfo("Os", "Window-10");
		report.setSystemInfo("Browser", "Chrome-100");
		
		//attach the spark reporter to extent report
		report.attachReporter(spark);
		 
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}	

}
