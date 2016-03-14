package testCases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusables.Setup;

public class testing {
	
	static WebDriver driver;
	
	public static void main()
	{
		try {
			driver = Setup.fnLaunch(driver);
			WebElement ele = driver.findElement(By.linkText("Login"));
			ele.click();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
