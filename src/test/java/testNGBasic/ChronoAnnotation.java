package testNGBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronoAnnotation {
	@BeforeSuite
	
	public void beforeSuite() {
		
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	
	public void beforeMethod() {
		System.out.println("beforemethod");
		
	}
	
	@Test
	public void test() {
		System.out.println("Test");
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
		
	}

}
