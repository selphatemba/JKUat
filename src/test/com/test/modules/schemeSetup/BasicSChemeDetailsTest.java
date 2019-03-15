package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.AdditionalSchemeDetails;
import com.JKUat.modules.schemeSetup.BasicSchemeDetails;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicSChemeDetailsTest extends BaseClass {

    @BeforeClass
    public void setUp() throws Exception {
        init();

    }

    @Test(priority = 0)
    public void login() throws Exception {
        log.info("=========logging in user ================");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin");
        log.info("=============successfully logged in===========");

    }
    @Test(priority = 1)
    public void updateadditionalSchemeDetails()throws Exception {
        BasicSchemeDetails bsd = new BasicSchemeDetails(driver);
        Thread.sleep(3000);
//        bsd.clickMainMenu();
//        Thread.sleep(3000);
        bsd.clickSchemeSetup();
        Thread.sleep(2000);
        bsd.clickOnScheme();
        Thread.sleep(2000);
        bsd.clickOnBasicSchemeDetails();
        Thread.sleep(1000);
        bsd.enterSchemeTaxIdNo("P123456789P");
        Thread.sleep(1000);
        bsd.enterSchemeMode("Single");
        Thread.sleep(1000);
        bsd.enterContributionMode("Monthly");
        Thread.sleep(1000);
        bsd.enterSponsorOnContrHoliday("No");
        Thread.sleep(1000);
        bsd.enterContrRemmitanceMod("In Arrears");
        Thread.sleep(1000);
        bsd.enterBaseTaxRegime("Kenya");
        Thread.sleep(1000);
        bsd.enterOffshoreCurrency("KENYA SHILLINGS");
        Thread.sleep(1000);
        bsd.clickSave();
        Thread.sleep(2000);
        driver.navigate().refresh();
    }
}
