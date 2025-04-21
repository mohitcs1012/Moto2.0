package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
//	Locator
	
	@FindBy(xpath="(//h1[normalize-space()='Welcome to Moto 2.0'])[1]") 
	WebElement labelHeading;
	
	@FindBy(xpath="//div[@class='MuiBox-root css-18fmc6m']")
	WebElement menu;
	
	
	
//	Action
	
	public boolean IsWelcomeDisplayed()
    {
    	
    	try {
    		return(labelHeading.isDisplayed());
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		return false;
		}
    	
    	
    }
	
	public  void hovermenu()
	{
	    Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
	}
}
