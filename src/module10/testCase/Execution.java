package module10.testCase;

import java.io.IOException;

import module10.Actions.ActionsKeyword;
import module10.Utility.ExcelUtility;

public class Execution {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\abhre\\eclipse-workspace\\Edureka_4thJan2020\\src\\module10\\testData\\MyDataEngine.xlsx";

		ExcelUtility.SetupExcel(path, "Sheet1");
		
		for(int i=0; i<4; i++) 
		{
			String kw = ExcelUtility.getData(i, 1);
			if(kw.equalsIgnoreCase("OpenBrowser"))
			{
				ActionsKeyword.OpenBrowser();
			}
			else if(kw.equalsIgnoreCase("Navigate"))
			{
				ActionsKeyword.Navigate();
			}
			else if(kw.equalsIgnoreCase("ClickGmail"))
			{
				ActionsKeyword.ClickGmail();
			}
		}
	}
}
