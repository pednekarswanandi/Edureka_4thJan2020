package module6;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BrowserClass;

public class GitHubLogin2 extends BrowserClass{

	//Open Browser - @Test
	//Open AUT - @Test
	//Validating URL - @Test
	//Login - @Test
	//Logout - @Test
	//Close browser - @Test
	
	@Test(priority = 0)
	public void Browser() {
		OpenBrowser("chrome");
	}
	
	@Test(priority = 2)
	public void ValidateURL(){
		
		String AppURL = driver.getCurrentUrl();
		
		boolean URLValidation = AppURL.equals("https://github.com/");
		
		System.out.println(URLValidation);
	}
	
	@Test(priority = 1)
	public void OpenAUT() {
		driver.get("http://github.com");	
	}
	
	
	@Test(priority = 3)
	public void Login() throws InterruptedException {

		driver.findElement(By.xpath("//*[@href='/login']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).sendKeys("tabhresh@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Edureka@123");
		
		driver.findElement(By.name("commit")).click();

	}

	@Test(priority = 4)
	public void Logout() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]")).click();
				
	}

	@Test(priority = 5)
	public void CloseTestCase() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.quit();	
	}

}
