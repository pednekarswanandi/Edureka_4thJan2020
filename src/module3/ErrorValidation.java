package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorValidation {

	public static void main(String[] args) {

		// Open Chrome Browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/nlogin/login");
		
		driver.findElement(By.id("usernameField")).click();
		
		driver.findElement(By.id("passwordField")).click();
		
		WebElement errmsg = driver.findElement(By.id("usernameField_err"));
		
		String Err = errmsg.getText();
		
		System.out.println(Err);
		
		boolean ErrorMessage = Err.equals("Email ID/Username cannot be lef");
		
		System.out.println(ErrorMessage);
		
		
		
	}

}
