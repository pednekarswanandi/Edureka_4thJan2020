package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragDrop {

	public static void main(String[] args) {
		// Open Chrome Browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://jqueryui.com/droppable/");
		
		//Create object of the webelement
		WebElement Frame = driver.findElement(By.tagName("iframe"));
			
		//switch to the frame
		driver.switchTo().frame(Frame);
		
		//Create two WebElement objects for Source and target locations so that Drag and drop can be conducted
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Target = driver.findElement(By.id("droppable"));
		
		//Initialize Actions class
		Actions act = new Actions(driver);
		
		//Perform Drag and Drop
		act.dragAndDrop(Source, Target).perform();
		
	}
}
