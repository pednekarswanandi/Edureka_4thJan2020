package module3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {

		//Instantiate Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikasio\\Box\\Laptop Space\\Training\\Installation_stuff\\BrowserDrivers\\chromedriver_76.exe");
		WebDriver driver = new ChromeDriver();

		//Open Application Under Test
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		//Implicit Wait of 10 sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Interacting with the Radio Button and validating weather it is selected or not using method - "isSelected"
		WebElement exp = driver.findElement(By.id("exp-6"));
		exp.click();
		boolean RExp = exp.isSelected();
		System.out.println("Result is:- "+ RExp);

		//Interacting with the CheckBox and validating weather it is selected or not using method - "isSelected"
		WebElement prof = driver.findElement(By.id("profession-1"));
		prof.click();
		boolean RProf = prof.isSelected();
		System.out.println("Result is:- "+ RProf);
		
		//Validate accessibility of the button of the page using method "isEnabled"
		WebElement Button = driver.findElement(By.name("photo"));		
		boolean buttonstatus = Button.isEnabled();
		System.out.println("Result is:- "+ buttonstatus);
				
		//Validate Heading of the page using method - "isDisplayed"
		WebElement Heading = driver.findElement(By.xpath("//*[contains(text(),'Practice Automation Form')]"));
		boolean HeadingDisplay = Heading.isDisplayed();
		System.out.println("Result is:- "+ HeadingDisplay);
		
		//Quit Browser driver
		driver.quit();
	}
}
