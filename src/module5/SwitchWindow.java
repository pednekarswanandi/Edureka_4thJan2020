package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
		
		// Part1
		//to get the window name of the main window
		String MWN = driver.getWindowHandle();

		System.out.println(MWN);
		System.out.println("=============================================================");
		
		// Part2
		//Click on the button to generate a new window so that I can have two windows opened with this instance
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
		
		//to get the names of all the opened windows
		
		Set<String> AWN = driver.getWindowHandles();
		
		System.out.println(AWN);
		System.out.println("=============================================================");
		
		// Part3
		//to switch between both the windows but without assigning a container for it - for loop
		
		for(String CAWN : driver.getWindowHandles())
		{
			
			Thread.sleep(5000);
			
			driver.switchTo().window(CAWN);
			
			Thread.sleep(5000);
			
			driver.switchTo().window(CAWN);
	
		}

	}
}







