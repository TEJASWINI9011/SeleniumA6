package dataProviderAnno;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//instead of using static way We use here Dynamic way
public class CustomerReq {
	
	  @DataProvider(name = "data")
	  public Object [][] sender() throws IOException {
	  		
	  	//	Object [][]obj = new Object[2] [2];
	  		FileInputStream fis = new FileInputStream("C:\\Users\\Teju Patil\\Desktop\\Dataprovider.xlsx");
	  		Workbook wb = HSSFWorkbookFactory.create(fis);
	  		Sheet sheet = wb.getSheet("Sheet1");
	  		int row = sheet.getPhysicalNumberOfRows();
	  		int column = sheet.getRow(0).getPhysicalNumberOfCells();
	  		
	  		Object [][]obj = new Object[row] [column];
	  		
	  		for(int i=0; i<row;i++) {
	  			
	  			for(int j=0;j<column;j++) {
	  				obj[i][j] =sheet.getRow(i).getCell(j).toString();
	  			}
	  		}
	  		return obj;
	  		
	}
	  	
	  	@Test(dataProvider = "data")
	  	public void receiver(String data1,String data2) {
	  		
	  		WebDriver driver = new ChromeDriver();
	  		driver.manage().window().maximize();
	  		
	  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  		driver.get("https://demowebshop.tricentis.com/");
	  		driver.findElement(By.className("ico-login")).click();
	  		driver.findElement(By.id("Email")).sendKeys("data1");
	  		driver.findElement(By.id("Password")).sendKeys("data2");
	  		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  		driver.close();
	  		
	  		
	  	}


}
