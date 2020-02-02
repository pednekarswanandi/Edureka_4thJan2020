package module8.withPageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	// Constructor
	public LoginPage(WebDriver driver)
	{
		// "this" keyword is used here to distinguish global and local varaible "driver"
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="email")
	WebElement txtEmailAddress;
	
	@FindBy(id="passwd")
	WebElement txtPassword;
	
	@FindBy(id="SubmitLogin")
	WebElement btnSignin;
	
	// Single method to sign in
	public void signIn(String emailAddress, String password)
	{
		txtEmailAddress.sendKeys(emailAddress);
		txtPassword.sendKeys(password);
		btnSignin.click();
	}
}