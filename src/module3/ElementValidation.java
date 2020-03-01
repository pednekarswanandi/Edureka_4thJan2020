package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementValidation {

	public static void main(String[] args) {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		WebElement checkBox = driver.findElement(By.id("profession-1"));

		checkBox.click();
		
		boolean Validation = checkBox.isSelected();

		System.out.println(Validation);
	}
}
