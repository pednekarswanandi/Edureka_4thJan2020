package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		//Initialize the Select Class and Navigate to the dropdown element
		Select oSelect = new Select(driver.findElement(By.name("continents")));
		
		Thread.sleep(5000);
		
		//Select Africa using index value
		oSelect.selectByIndex(2);
		
		Thread.sleep(5000);
		
		//Select South America using Visible Text
		oSelect.selectByVisibleText("South America");
		
		Thread.sleep(5000);
		
		//Select Antartica using Value attribute
		oSelect.selectByValue("g");
		
		driver.findElement(By.xpath("//*[@name='continents']//following::option[3]")).click();
		
	}

}
