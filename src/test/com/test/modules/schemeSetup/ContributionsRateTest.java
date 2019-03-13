package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.JKUat.modules.schemeSetup.ContributionsRate;
import com.JKUat.modules.schemeSetup.EndYearParameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContributionsRateTest extends BaseClass {
//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//
//    @Test(priority = 0)
//    public void login() throws Exception {
//        log.info("=========logging in user ================");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("user63", "S@lpha123");
//        log.info("=============successfully logged in===========");
//
//    }

    @Test(priority = 0)
    public void endYearParameters()throws Exception {
        ContributionsRate cr = new ContributionsRate(driver);
        Thread.sleep(3000);
//        cr.clickMainMenu();
//        Thread.sleep(3000);
//        cr.clickSchemeSetup();
//        Thread.sleep(2000);
        cr.clickOnContrRates();
        Thread.sleep(1000);
        cr.clickOnNewContrRate();
        Thread.sleep(1000);
        cr.enterEmployeeRate("60");
        Thread.sleep(1000);
        cr.enterEmployerRate("40");
        Thread.sleep(1000);
        cr.clickreatRateas();
        Thread.sleep(1000);
        cr.enterEffectiveDate("01/01/2015");
        Thread.sleep(1000);
        cr.enterSponsor("SCHEME SCHEMA1 Sponsor");
        Thread.sleep(1000);
        cr.enterMemberClass("Management");
        Thread.sleep(1000);
        cr.clickSave();
    }
}
