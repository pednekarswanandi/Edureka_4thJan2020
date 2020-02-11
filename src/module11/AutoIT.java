package module11;

import java.io.IOException;

import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Common.BrowserClass;

public class AutoIT extends BrowserClass {

	public static void main(String[] args) throws InterruptedException, IOException, FindFailed {
	
		OpenBrowser("Chrome");
		
		driver.get("https://www.freepdfconvert.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='btn btn-success icon-left-large img-plus-white upload-btn']")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\abhre\\eclipse-workspace\\Edureka_4thJan2020\\AutoIt_Sikuli\\Autoit.exe");
		
		Thread.sleep(5000);
		
		Screen s = new Screen();
		
		//s.click("C:\\Users\\abhre\\eclipse-workspace\\Edureka_4thJan2020\\AutoIt_Sikuli\\1.PNG");
		
		Pattern p = new Pattern("C:\\Users\\abhre\\eclipse-workspace\\Edureka_4thJan2020\\AutoIt_Sikuli\\1.PNG");
		
		s.click(p);
		
		
	}

}
