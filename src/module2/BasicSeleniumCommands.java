package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
	
	//Single Line comments
	/*
	 * Multi line comments
	 */
	
	
	//Initialize or Instantiate or Open a browser	
	//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		//Close & Quit Commmands
		driver.close(); //to close the current active window
		driver.quit(); // to close all the windows and quit the driver.exe file as well
		
		//Navigation Commands
		driver.navigate().refresh();// refresh the current page
		driver.navigate().back(); // to move to the previous page if available in the history
		driver.navigate().forward(); // to move to the next page if available in the history
		
		//Get Commnands
		driver.get("URL"); // open URl
		driver.getTitle();// to get the title of the currect page
		driver.getCurrentUrl(); // to get the current page URL for validations
	
		//Element Handling Commands
		driver.findElement(By.id("")).sendKeys("");//to type
		driver.findElement(By.id("")).click();// to click
		driver.findElement(By.id("")).clear();// to erase 
		driver.findElement(By.id("")).getText();// to fetch the available text
		
		

	}	
}
