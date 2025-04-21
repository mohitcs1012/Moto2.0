package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MenuBarPage;
import pageObject.OnboardingPage;
import testBase.BaseClass;
import utilities.DataProviders;

@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = { "DataDriven", "Master" })
public class TC002_DataDrivenLogin extends BaseClass {

	public void Verify_LoginDDT(String UserName, String Password, String exp) throws InterruptedException {
		logger.info("**** Start TC002_DataDrivenLogin*****");
		try {
//				Login
			OnboardingPage op = new OnboardingPage(driver);
			op.setUserName(UserName);
			op.setPassword(Password);
			op.clicksubmit();

			HomePage hp = new HomePage(driver);
			boolean targetPage = hp.IsWelcomeDisplayed();

			MenuBarPage mbp = new MenuBarPage(driver);

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetPage == true) {
					hp.hovermenu();
					mbp.clickLogout();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}

			}

			else if (exp.equalsIgnoreCase("Invalid")) {
				if (targetPage == true) {
					hp.hovermenu();
					mbp.clickLogout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}
		}

		catch (Exception e) {
			// TODO: handle exception

			Assert.fail("An exception occured" + e.getMessage());
		}

		Thread.sleep(2000);

		logger.info("**** Finshed TC002_DataDrivenLogin*****");

	}

}
