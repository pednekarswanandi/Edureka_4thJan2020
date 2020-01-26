package module6;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BrowserClass;

public class GitHubLogin extends BrowserClass{

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
	
	@BeforeMethod
	public void ValidateURL(){
		
		String AppURL = driver.getCurrentUrl();
		
		boolean URLValidation = AppURL.equals("https://github.com/");
		
		System.out.println(URLValidation);
	}
	
	@BeforeTest
	public void OpenAUT() {
		driver.get("http://github.com");	
	}
	
	
	@Test
	public void Login() throws InterruptedException {

		driver.findElement(By.xpath("//*[@href='/login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).sendKeys("tabhresh@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Edureka@123");
		
		driver.findElement(By.name("commit")).click();

	}

	@AfterTest
	public void Logout() throws InterruptedException {

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
