package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnboardingPage extends BasePage {

	public OnboardingPage(WebDriver driver) {
		super(driver);
	}

	// Locator
	@FindBy(xpath = "//input[@placeholder='Enter Username']")
	WebElement textUsername;

	@FindBy(xpath = "//input[@placeholder='Enter Password']")
	WebElement txtpassword;
	@FindBy(xpath = "//button[contains(.,'LOGIN')]")
	WebElement btnLogin;
	
//	Action
	
	public void setUserName(String Username)
	{
		textUsername.sendKeys(Username);		
	}
	
	public void setPassword(String Password)
	{
		txtpassword.sendKeys(Password);		
	}
	
	public void clicksubmit()
	{
		btnLogin.click();
	}
}
