package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MDBox {

	public static void main(String[] args) throws InterruptedException {
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open AUT
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.className("_2zrpKA _1dBPDZ")).sendKeys("Edureka");
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("Edureka");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		
	}

}
