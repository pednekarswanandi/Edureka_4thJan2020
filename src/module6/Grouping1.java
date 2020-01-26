package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Common.BrowserClass;

public class Grouping1 extends BrowserClass {

	@Test(priority = 0, groups = "Setup")
	public void Browser() {
		OpenBrowser("chrome");
	}

	@Test(priority = 1, groups = "Setup")
	public void OpenAUT() {
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(priority = 2, groups = "LoginLogout")
	public void Login() throws InterruptedException {

		// Enter UserID
		driver.findElement(By.name("userName")).sendKeys("tutorial");

		// Enter Password
		driver.findElement(By.name("password")).sendKeys("tutorial");

		// Click on Sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3, dependsOnMethods = "Login", groups = "LoginLogout")
	public void Logout() throws InterruptedException {
		// Click on Sign off
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 6, groups = "LinkCheck")
	public void ClickRegisterLink() {

		driver.findElement(By.linkText("REGISTER")).click();

	}

	@Test(priority = 7, groups = "LinkCheck")
	public void ClickContactUsLink() {

		driver.findElement(By.linkText("CONTACT")).click();

	}

	@Test(priority = 8, groups = "LinkCheck")
	public void ClickSupportLink() {

		driver.findElement(By.linkText("SUPPORT")).click();

	}

	@Test(priority = 9, groups = "LinkCheck")
	public void ClickSignOnLink() {

		driver.findElement(By.linkText("SIGN-ON")).click();

	}

	@Test(priority = 20, groups = "Setup")
	public void CloseBrowser() {
		driver.close();
	}
}