package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args){

		//Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// PageLoad
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/"); //0-20

		// Implicitly wait
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		// SetScript Timeout
		//driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		
		
		//sleep Wait command
				
		driver.findElement(By.name("userName")).sendKeys("tutorial");// 0-10
		driver.findElement(By.name("password")).sendKeys("tutorial");// 0-10
		driver.findElement(By.name("login")).click();// 0-10

		driver.findElement(By.linkText("PROFILE")).click();// 0-20

		driver.quit();

	}

}
