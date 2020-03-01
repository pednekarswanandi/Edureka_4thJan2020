package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open the AUT
		driver.get("https://www.amazon.in/");

		// Capture the Title of the Page
		String Apptitle = driver.getTitle(); // give you the actual title of the page
		System.out.println(Apptitle);

		// validate the actual title VS Expected Title
		boolean Result = Apptitle.equals("Amazon : Shop Online : Anything From Anywhere");

		System.out.println(Result);
	}
}
