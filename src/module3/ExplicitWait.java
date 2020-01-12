package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		//Open Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		
		// Open AUT
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");

		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("LinkText-3")).click();
		*/
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-6"))).click();
		
		driver.navigate().back();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-4"))).click();
		
		
	}
}
