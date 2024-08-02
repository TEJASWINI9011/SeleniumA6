package dataProviderAnno;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoreData {
	@DataProvider(name = "data")
	
	public Object [][] sender() {
		
		Object [][]obj = new Object[2] [2];
		
		obj [0][0] = "Teju";
		obj[0][1] = "priti";
		obj [1] [0] ="kajal";
		obj [1][1] = "Ashu";
		return obj;
	}
	
	@Test(dataProvider = "data")
	
	public void receiver(String data1,String data2) {
		
		System.out.println(data1);
		System.out.println(data2);
	}
	

}
