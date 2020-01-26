package module6;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BrowserClass;

public class GitHubLogin3 extends BrowserClass{

	//Open Browser - @BeforeSuite
	//Open AUT - @BeforeTest
	//Validating URL - @BeforeMethod
	//Login - @Test
	//Logout - @Aftermethod
	//Close browser - @AfterClass
	
	@BeforeSuite
	public void Browser() {
		OpenBrowser("chrome");
	}
	
	@BeforeTest
	public void OpenAUT() {
		driver.get("http://github.com");	
	}
	
	
	@Test(priority = 0)
	public void ValidateLogin() throws InterruptedException {

		driver.findElement(By.xpath("//*[@href='/login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).sendKeys("tabhresh@gmail.com");
		
		driver.findElement(By.id("passwor")).sendKeys("Edureka@123");
		
		driver.findElement(By.name("commit")).click();

	}

	@Test(priority = 1, dependsOnMethods = "ValidateLogin")
	public void CheckLogout() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]")).click();
				
	}

	@AfterSuite
	public void CloseTestCase() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.quit();	
	}

}
