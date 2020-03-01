package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");

		//Switch to Child Frame 1
		
		driver.switchTo().frame("ID_Frame1");
		
		driver.findElement(By.name("ts_first_name")).sendKeys("Abhresh");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(2);
		
		driver.findElement(By.name("firstname")).sendKeys("Abhresh");		
		
		
	}

}
