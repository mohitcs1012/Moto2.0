package pageObject.navigationCard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObject.BasePage;

public class SettingPage extends BasePage {

    public SettingPage(WebDriver driver) {
        super(driver);
    }

    // ===============================
    // Organization Section - Locator
    // ===============================

    @FindBy(xpath = "//div[normalize-space()='Organization']")
    WebElement linkOriganization;

    // ===============================
    // Channel Section - Locator
    // ===============================

    @FindBy(xpath = "//a[@href='/add-sales-channel']")
    WebElement linkAddSalesChannel;

    @FindBy(xpath = "//a[@href='/add-retailer']")
    WebElement linkAddRetailer;

    // ===============================
    // Organization Section - Action
    // ===============================

    public void clickOriganization() {
        linkOriganization.click();
    }

    // ===============================
    // Channel Section - Action
    // ===============================

    public void clickAddSalesChannel() {
        linkAddSalesChannel.click();
    }

    public void clickAddRetailer() {
        linkAddRetailer.click();
    }

    // ===============================
    // Getter for Wait Usage
    // ===============================

    public WebElement getAddSalesChannelLink() {
        return linkAddSalesChannel;
    }
}
