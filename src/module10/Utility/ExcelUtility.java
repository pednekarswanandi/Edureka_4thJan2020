package module10.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	static Workbook wb;
	static Sheet sh;
	
	public static void SetupExcel(String path, String sheetName) throws IOException {
		
		FileInputStream fis = new FileInputStream(path);
		
		wb = WorkbookFactory.create(fis);
		
		sh = wb.getSheet(sheetName);
		
	}
	
	public static String getData(int rownun, int colnum) {
		
		String data = sh.getRow(rownun).getCell(colnum).toString();
		
		return data;
	}
}







