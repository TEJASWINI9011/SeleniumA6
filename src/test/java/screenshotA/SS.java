package screenshotA;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import screenshot.SsBase;
@Listeners(screenshot.SS1.class)
public class SS  extends SsBase{
@Test
public void main() {
	
	String expected_result ="https://demowebshop.tricentis.com/";
	String actual_result = driver.getCurrentUrl();
	assertEquals(expected_result, actual_result);
	
}

@Test
public void main2() {
	String expected_result ="https://demowebshop.tricentis.com";
	String actual_result = driver.getCurrentUrl();
	assertEquals(expected_result, actual_result);
	
	
	
}
	

}
