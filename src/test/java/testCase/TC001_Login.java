package testCase;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MenuBarPage;
import pageObject.OnboardingPage;
import testBase.BaseClass;

public class TC001_Login extends BaseClass {

    @Test
    public void login() throws InterruptedException {
        logger.info("******* TC001_Login Starts *********");

        try {
            OnboardingPage onp = new OnboardingPage(driver);
            onp.setUserName(p.getProperty("userid"));
            onp.setPassword(p.getProperty("password"));
            onp.clicksubmit();

            // Wait to ensure login loads completely
            Thread.sleep(3000);

            HomePage hp = new HomePage(driver);
            hp.hovermenu(); // Hover over menu to reveal logout

            Thread.sleep(1000);

            MenuBarPage mbp = new MenuBarPage(driver);
            mbp.clickLogout(); // Now perform logout

            Thread.sleep(2000);
            logger.info("******** Logout successful ********");

        } catch (Exception e) {
            logger.error("Test failed: " + e.getMessage());
            Assert.fail("Test failed: " + e.getMessage());
        } finally {
            logger.info("******** Finished TC001_Login ********");
        }
 }
}
