package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseEvents {

	public static void main(String[] args) {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

		WebElement FName = driver.findElement(By.id("ts_first_name"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(FName)
		.keyDown(FName, Keys.SHIFT)
		.sendKeys(FName, "abhresh")
		.keyUp(FName, Keys.SHIFT)
		.build()
		.perform();
		
		act.moveToElement(FName)
		.contextClick(FName)
		.build().perform();
		
		
	}

}
