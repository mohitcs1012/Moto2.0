package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MenuBarPage;
import pageObject.OnboardingPage;
import pageObject.channel.CreateSaleschannel;
import pageObject.navigationCard.SettingPage;
import pageObject.navigationCard.organization.OrganizationCard;
import testBase.BaseClass;

public class TC004_CreateSalesChannel extends BaseClass {
	
	@Test
	public void CreateSalesChannel()
	{
		try {
            OnboardingPage onp = new OnboardingPage(driver);
            onp.setUserName(p.getProperty("userid"));
            onp.setPassword(p.getProperty("password"));
            onp.clicksubmit();

            // Wait to ensure login loads completely
            Thread.sleep(3000);

            HomePage hp = new HomePage(driver);
            hp.hovermenu(); // 

            Thread.sleep(1000);

            MenuBarPage mbp = new MenuBarPage(driver);
            mbp.clickSetting(); // Now perform Setting
            
            Thread.sleep(2000);
            
            SettingPage sp= new SettingPage(driver);
            
            
            sp.clickAddSalesChannel();
            
//            Select SalcahnnelType
           CreateSaleschannel cs=new CreateSaleschannel(driver);
           Thread.sleep(2000);
           cs.clickSalesChannelTypebtn();
           
           cs.selectSalesChannelType("Direct Distributor");
           
           Thread.sleep(2000);
           cs.clickParentSalesChannelbtn();
           cs.selectParentsalesChannel("Moto Warehouse");
           
            Thread.sleep(2000);
            logger.info("******** Click successful ********");

        } catch (Exception e) {
            logger.error("Test failed: " + e.getMessage());
            Assert.fail("Test failed: " + e.getMessage());
        } finally {
            logger.info("******** Finished TC003_SettingIcon ********");
        }
	}
}