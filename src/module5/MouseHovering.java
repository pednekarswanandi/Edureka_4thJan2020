package module5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHovering {

	public static void main(String[] args) {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://www.myntra.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='desktop-searchBar']")).sendKeys("Jackets");
			
		driver.findElement(By.xpath("//*[@class='desktop-submit']")).click();
		
		WebElement MH = driver.findElement(By.xpath("//*[@title='Campus Sutra Men Blue Solid Denim Jacket']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(MH).perform();
	}

}




