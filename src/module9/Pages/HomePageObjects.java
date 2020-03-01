package module9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

	public HomePageObjects(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="ts_first_name")
	WebElement FName;
	
	@FindBy(id="ts_last_name")
	WebElement LName;
	
	@FindBy(name="ts_address")
	WebElement Add;

	public void FormFill(String fName, String lName, String add) throws InterruptedException {
		
		FName.clear();
		FName.sendKeys(fName);
		
		LName.clear();
		LName.sendKeys(lName);
		
		Add.clear();
		Add.sendKeys(add);
		
		Thread.sleep(5000);
	}
	

}
