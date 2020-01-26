package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Common.BrowserClass;

public class Enabled extends BrowserClass {

	@Test(priority = 0)
	public void OpenBrowser() {
		OpenBrowser("chrome");
	}

	@Test(priority = 1)
	public void OpenAUT() {
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(priority = 2, dependsOnMethods = "OpenAUT")
	public void Login() throws InterruptedException {

		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3, dependsOnMethods = "Login", enabled = true)
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void CloseBrowser() {
		driver.close();
	}
}