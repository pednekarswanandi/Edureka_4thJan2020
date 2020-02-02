package module9.TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Common.BrowserClass;
import module9.Pages.HomePageObjects;

public class DDT extends BrowserClass {

	Workbook wb;
	Sheet sh;
	int norows;
	int nocols;
	

	@BeforeSuite
	public void OpenProcess() {
		
		OpenBrowser("Chrome");
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
		
	}
	
	@AfterSuite
	public void QuitProcess() {
		
		driver.quit();
		
	}
	
	@Test(dataProvider = "testDataFeed")
	public void FormFill(String fName, String lName, String add) throws InterruptedException {
		
		HomePageObjects hp = new HomePageObjects(driver);
		
		hp.FormFill(fName, lName, add);
		
	}
	
	@DataProvider
	public Object[][] testDataFeed() throws IOException{
		
		//To pass the path of the file
		FileInputStream fis = new FileInputStream("C:\\Users\\abhre\\eclipse-workspace\\Edureka_4thJan2020\\src\\module9\\TestData\\TestData.xlsx");
				
		//Open & Read the Workbook
		wb = WorkbookFactory.create(fis);
		
		//Define the sheet with which you want to interact
		sh = wb.getSheet("Sheet1");
				
		//To calculate the total no of Rows
		norows = sh.getLastRowNum()+1; //9+1=10
				
		//To calculate the total no of Columns
		nocols = sh.getRow(0).getLastCellNum(); //2+1=3
		
		Object[][] formData = new Object[norows][nocols];
				
		/*
		 * we will create a nested for loop to reach each cell using the index value of each row and column and
		 * based on it we will select the cell to read and that cell data will be passed to the @DataProvider Annotation
		 * this data is then passed to the @Test annotation connected using the dataprovider name
		 * this input is then passed each time to each string one by one which will
		 * transmit the data to the AUT
		 */
		
		for(int row=0; row<norows; row++) 
		{
			for(int col=0; col<nocols; col++)
			{
				formData[row][col] = sh.getRow(row).getCell(col).toString();
			}
		}
		return formData;
	}
	
}












