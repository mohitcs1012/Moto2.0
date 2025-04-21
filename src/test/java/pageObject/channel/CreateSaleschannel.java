package pageObject.channel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObject.BasePage;

public class CreateSaleschannel extends BasePage {
	
	public CreateSaleschannel(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		super(driver);
	}
	
	//Locator
	
	@FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-q7mezt'])[12]")
	WebElement btnSalesChannelType;
	@FindBy(xpath="//li[contains(@id,'option')]") 
	List<WebElement> dropdownSaleschannelTypeOptions;
	
	@FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-q7mezt'])[13]") 
	WebElement btnParentSalesChannel;
	
	@FindBy(xpath="//li[contains(@id,'option')]") 
	List<WebElement> dropdownParentSalesOptions;
	

//	Action method
	
	public void clickSalesChannelTypebtn()
	{
		btnSalesChannelType.click();
	}
	
	public void selectSalesChannelType(String SaleschannelTypeName) {
        for (WebElement SalesChannelTypeoption : dropdownSaleschannelTypeOptions) {
            if (SalesChannelTypeoption.getText().equalsIgnoreCase(SaleschannelTypeName)) {
                SalesChannelTypeoption.click();
                break;
            }
        }
	}  
	
	
	public void clickParentSalesChannelbtn()
	{
		btnParentSalesChannel.click();
	}
	
	public void selectParentsalesChannel(String ParentsaleschannelName) {
        for (WebElement ParentSalesChanneloption : dropdownSaleschannelTypeOptions) {
            if (ParentSalesChanneloption.getText().equalsIgnoreCase(ParentsaleschannelName)) {
            	ParentSalesChanneloption.click();
                break;
            }
        }
	} 
	
	
	
}
