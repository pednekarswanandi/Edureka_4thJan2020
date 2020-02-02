package module8.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects {

	public BingHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="sb_form_q")
	WebElement searchtxt;
	
	@FindBy (xpath = "//*[@id='sb_form_q']//following::label[1]")
	WebElement searchbtn;
	
	public void BingSearch(String searchInput) {
		
		searchtxt.clear();
		searchtxt.sendKeys(searchInput);
		searchbtn.click();
		
	}
	
}
