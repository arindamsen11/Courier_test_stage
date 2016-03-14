package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCourierPage {
	
	//Main menu header
	//*[@id="AutoNumber1"]/tbody/tr[1]/td/u/b/font
	//@FindBy(xpath = "//*[@id='AutoNumber5']/tbody/tr[3]/td/input[1]")//*[@id='AutoNumber1']/tbody/tr[1]/td/u/b/font")
	@FindBy(xpath = "//*[@id='AutoNumber1']/tbody/tr[1]/td/u/b/font")
	public WebElement txtHeader;
	
	//Login link
	//@FindBy(linkText = "Login")
	@FindBy(xpath = "//a[text()='Login']")
	//@FindBy(xpath = "//*[@id='AutoNumber1']/tbody/tr[3]/td/font/a")
	public WebElement lnkLogin;
	
	//Login form
	@FindBy(xpath = "//*[@id='AutoNumber3']/tbody/tr[1]/td")
	public WebElement frmLogin;
	
	//Login button
	@FindBy(xpath = "//*[@id='AutoNumber4']/tbody/tr[4]/td/input[1]")
	public WebElement btnLogin;
	
	//Track Shipment link
	@FindBy(xpath = "//*[@id='AutoNumber1']/tbody/tr[4]/td/font/a")
	public WebElement lnkTrackShipment;
	
	//Track Shipment page airway bill number
	@FindBy(xpath = "//*[@id='AutoNumber1']/tbody/tr[2]/td/font")
	public WebElement pageTrackShipment;
	
	//Track button on shipment page
	@FindBy(xpath = "//*[@id='AutoNumber1']/tbody/tr[3]/td/p/input[1]")
	public WebElement btnTrack;
	
	
		
	
	public NewCourierPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

}
