package module6;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Common.BrowserClass;

public class GitHubLogin_Parameters extends BrowserClass{
	
	@Test(priority = 0)
	public void Browser() {
		OpenBrowser("chrome");
	}
	
	@Test(priority = 1)
	public void OpenAUT() {
		driver.get("http://github.com");	
	}
	
	@Parameters ({"UserName", "Password"})
	@Test(priority = 2)
	public void Login(String Uname, String Pass) throws InterruptedException {

		driver.findElement(By.xpath("//*[@href='/login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).sendKeys(Uname);
		
		driver.findElement(By.id("password")).sendKeys(Pass);
		
		driver.findElement(By.name("commit")).click();

	}

	@Test(priority = 3, dependsOnMethods = "Login")
	public void Logout() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]")).click();
				
	}

	@Test(priority = 4)
	public void QuitTestCase() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.quit();	
	}
}
