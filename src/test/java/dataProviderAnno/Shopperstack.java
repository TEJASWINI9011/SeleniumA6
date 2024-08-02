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

public class Shopperstack {

	
	
    @DataProvider(name = "data")
public Object [][] sender() throws IOException {
		
		Object [][]obj = new Object[2] [2];
		FileInputStream fis = new FileInputStream("C:\\Users\\Teju Patil\\Desktop\\Dataprovider.xlsx");
		Workbook wb = HSSFWorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		
		obj[0][0] = sheet.getRow(0).getCell(0).toString();
		obj[0][0] = sheet.getRow(0).getCell(1).toString();
		obj[0][0] = sheet.getRow(1).getCell(0).toString();
		obj[0][0] = sheet.getRow(1).getCell(1).toString();
		return obj;
		
		
	}
	
	@Test(dataProvider = "data")
	public void receiver(String data1,String data2) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("data1");
		driver.findElement(By.id("Password")).sendKeys("data2");
		driver.findElement(By.xpath("\\span[@class='MuiButton-label']")).click();
		driver.close();
		
		
	}

	

}
