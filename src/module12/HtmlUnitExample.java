package module12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlUnitExample {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();
		
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
