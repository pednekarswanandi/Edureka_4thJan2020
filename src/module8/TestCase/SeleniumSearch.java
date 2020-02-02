package module8.TestCase;

import Common.BrowserClass;
import module8.Pages.BingHomePageObjects;

public class SeleniumSearch extends BrowserClass {

	public static void main(String[] args) {
		
		OpenBrowser("Chrome");
		
		driver.get("https://www.bing.com/");

		BingHomePageObjects page = new BingHomePageObjects(driver);
		
		page.BingSearch("SeleniumHQ");
		
	}

}
