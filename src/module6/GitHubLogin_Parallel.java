package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GitHubLogin_Parallel {

	WebDriver driver;

	@Parameters("B")
	@Test(priority = 0)
	public void openBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();			
			}
		}
			
			catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 1)
	public void OpenAUT() {
		driver.get("https://github.com/");
	}

	
	@Test(priority = 2)
	public void Login(String UName, String Pass) throws InterruptedException {

		driver.findElement(By.xpath("//*[@href='/login']")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("login_field")).sendKeys("tabhresh@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Edureka@123");

		driver.findElement(By.name("commit")).click();

	}

	@Test(priority = 3)
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
