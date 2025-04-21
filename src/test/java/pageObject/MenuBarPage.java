package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBarPage extends BasePage {

    public MenuBarPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    @FindBy(xpath = "//span[normalize-space()='Attendance']")
    WebElement btnAttendance;

    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement btnDashboard;

    @FindBy(xpath = "//span[normalize-space()='Transaction']")
    WebElement btnTransaction;

    @FindBy(xpath = "//span[normalize-space()='Inventory']")
    WebElement btnInventory;

    @FindBy(xpath = "//span[normalize-space()='Merchandising']")
    WebElement btnMerchandising;

    @FindBy(xpath = "//span[normalize-space()='Prebooking']")
    WebElement btnPrebooking;

    @FindBy(xpath = "//span[normalize-space()='Survey']")
    WebElement btnSurvey;

    @FindBy(xpath = "//span[normalize-space()='Profile']")
    WebElement btnProfile;

    @FindBy(xpath = "//span[normalize-space()='Settings']")
    WebElement btnSetting;

    @FindBy(xpath = "//span[normalize-space()='Log Out']")
    WebElement logoutButton;

    // Action methods

    public void clickAttendance() {
        btnAttendance.click();
    }

    public void clickDashboard() {
        btnDashboard.click();
    }

    public void clickTransaction() {
        btnTransaction.click();
    }

    public void clickInventory() {
        btnInventory.click();
    }

    public void clickMerchandising() {
        btnMerchandising.click();
    }

    public void clickPrebooking() {
        btnPrebooking.click();
    }

    public void clickSurvey() {
        btnSurvey.click();
    }

    public void clickProfile() {
        btnProfile.click();
    }

    public void clickSetting() {
        btnSetting.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }
}
