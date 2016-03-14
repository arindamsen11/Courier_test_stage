package testCases;

import objectRepository.NewCourierPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reporting.ExtentManager;
import reusables.ReadFile;
import reusables.Setup;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Test1 {
	
	WebDriver driver;
	
	//Instantiating the page
	NewCourierPage objNewCourierPage;
  
	private ExtentReports extent = ExtentManager.getInstance();
	private ExtentTest test;
	
	@Given("^Navigate to the url$")
	public void navigate_to_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    
	    try {
			test = extent.startTest("New Tours Site");
			test.log(LogStatus.INFO, "<b>Given: Navigate to the url</b>");
			driver = Setup.fnLaunch(driver);
			
			/*objNewCourierPage = new NewCourierPage(driver);
			Thread.sleep(5000);*/
			driver.get(ReadFile.readPropFile("Site_1"));
			Thread.sleep(3000);
			
			String sUrl = driver.getCurrentUrl();
			if(sUrl.equals(ReadFile.readPropFile("Site_1")))
			{
				System.out.println("The url is opened");
				test.log(LogStatus.PASS, "The url is opened");
				
			}
			else
			{
				System.out.println("The url is not opened");
				test.log(LogStatus.PASS, "The url is not opened");
				
			}
			/*objNewCourierPage = new NewCourierPage(driver);
			Thread.sleep(5000);
			
			if(objNewCourierPage.txtHeader.isDisplayed())
			{
				System.out.println("The url is opened");
				test.log(LogStatus.PASS, "The url is opened");
				
				String sHeader = objNewCourierPage.txtHeader.getAttribute("value");//.getText();
				if(sHeader.trim().equals("Main Menu"))
				{
					System.out.println("The header Main menu is displayed");
					test.log(LogStatus.PASS, "The header Main menu is displayed");
				}
				else
				{
					System.out.println("The header Main menu is not displayed");
					test.log(LogStatus.FAIL, "The header Main menu is not displayed");
				}
				
			}
			else
			{
				System.out.println("The url is not opened");
				test.log(LogStatus.FAIL, "The url is not opened");
			}*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    //
	    driver.quit();
		extent.endTest(test);
		extent.flush();
					
	}
/*
	@Then("^Check the Login page$")
	public void check_the_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    
	    try{
	    	
			test.log(LogStatus.INFO, "<b>Check the Login page</b>");
			
			if(objNewCourierPage.lnkLogin.isDisplayed())
			{
				
				WebElement lnkLogin = driver.findElement(By.linkText("Login"));
				if(lnkLogin.isDisplayed()||lnkLogin.isEnabled())
				{
					System.out.println("login identified");
				}
				System.out.println("The Login link is displayed");
				test.log(LogStatus.PASS, "The Login link is not displayed");
				
				objNewCourierPage.lnkLogin.click();
				
				if(objNewCourierPage.frmLogin.isDisplayed())
				{
					System.out.println("The redirect to login page is successful");
					test.log(LogStatus.PASS, "The redirect to login page is successful");
					
					if(objNewCourierPage.btnLogin.isDisplayed())
					{
						String sLoginText = objNewCourierPage.btnLogin.getText();
						if(sLoginText.trim().equals("Login"))
						{
							System.out.println("The Login button is present with the name " + sLoginText);
							test.log(LogStatus.PASS, "The Login button is present with the name " + sLoginText);
							
							driver.navigate().back();
						}
						else
						{
							System.out.println("The Login button is not present");
							test.log(LogStatus.FAIL, "The Login button is not present");
						}
					}
				}
				else
				{
					System.out.println("The redirect to login page is unsuccessful");
					test.log(LogStatus.FAIL, "The redirect to login page is unsuccessful");
				}
				
			}
			else
			{
				System.out.println("The Login link is not displayed");
				test.log(LogStatus.FAIL, "The Login link is not displayed");
			}
	    	
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
	}

	@Then("^Check Track Shipment$")
	public void check_Track_Shipment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		try
		{
			test.log(LogStatus.INFO, "<b>Check the Login page</b>");
			
			if(objNewCourierPage.lnkTrackShipment.isDisplayed())
			{
				System.out.println("The Track Shipment link is displayed");
				test.log(LogStatus.PASS, "The Track Shipment link is displayed");
				
				objNewCourierPage.lnkTrackShipment.click();
				
				if(objNewCourierPage.pageTrackShipment.isDisplayed())
				{
					System.out.println("The track shipment page is displayed");
					test.log(LogStatus.PASS, "The track shipment page is displayed");
					
					String sTrack = objNewCourierPage.btnTrack.getText();
					if(sTrack.trim().equals("Track"))
					{
						System.out.println("The button is present with the name " + sTrack);
						test.log(LogStatus.PASS, "The button is present with the name " + sTrack);
					}
					else
					{
						System.out.println("The Track button is not present");
						test.log(LogStatus.FAIL, "The Track button is not present");
					}
				}
				else
				{
					System.out.println("The track shipment page is not displayed");
					test.log(LogStatus.PASS, "The track shipment page is not displayed");
				}
			}
			else
			{
				System.out.println("The Track Shipment link is not displayed");
				test.log(LogStatus.FAIL, "The Track Shipment link is  not displayed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		driver.quit();
		extent.endTest(test);
		extent.flush();
	}*/

	


}
