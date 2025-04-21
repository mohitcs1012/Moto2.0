package pageObject.navigationCard.organization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObject.BasePage;

public class OrganizationCard extends BasePage {

	public OrganizationCard(WebDriver driver) {
		super(driver);
	}

	// ===============================
	// Geography Section - Locators
	// ===============================

	@FindBy(xpath = "//div[normalize-space()='Geography']")
	WebElement linkGeography;

	@FindBy(xpath = "//a[@href='/country']")
	WebElement linkCountry;

	@FindBy(xpath = "//a[@href='/region']")
	WebElement linkRegion;

	@FindBy(xpath = "//a[@href='/state']")
	WebElement linkState;

	@FindBy(xpath = "//a[@href='/city']")
	WebElement linkCity;

	@FindBy(xpath = "//a[@href='/area']")
	WebElement linkArea;

	// ===============================
	// Geography Section - Actions
	// ===============================

	public void clickGeography() {
		linkGeography.click();
	}

	public void clickCountry() {
		linkCountry.click();
	}

	public void clickRegion() {
		linkRegion.click();
	}

	public void clickState() {
		linkState.click();
	}

	public void clickCity() {
		linkCity.click();
	}

	public void clickArea() {
		linkArea.click();
	}
}
