package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		//generate the alert by clicking onthe buttons
		driver.findElement(By.id("prompt")).click();
		
		//Initialize the Alert Interface and switch to it
		Alert pA = driver.switchTo().alert();
		
		pA.sendKeys("Abhresh Sugandhi");
		
		pA.accept();
		
	}

}
