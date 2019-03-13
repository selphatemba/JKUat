package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.AdditionalSchemeDetails;
import com.JKUat.modules.schemeSetup.AdditionalSchemeDetails2;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdditionalSchemeDetails2Test extends BaseClass {
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
    public void updateadditionalSchemeDetails()throws Exception {
        AdditionalSchemeDetails2 asd = new AdditionalSchemeDetails2(driver);
//        Thread.sleep(3000);
//        asd.clickMainMenu();
//        Thread.sleep(3000);
//        asd.clickSchemeSetup();
        Thread.sleep(2000);
        asd.clickOnScheme();
        Thread.sleep(2000);
        asd.clickOnAdditionalSchemeDetails2();
        Thread.sleep(2000);
        asd.clickOnIdentifierUniqueLevel();
        Thread.sleep(2000);
        asd.enterCanMembersPurchasePension("No");
        Thread.sleep(2000);
        asd.enterAnnuityAdiffScheme("No");
        Thread.sleep(2000);
        asd.enterSchemeInvPooled("No");
        Thread.sleep(2000);
        asd.enterOperationalCashBookShared("No");
        Thread.sleep(2000);
        asd.enterSpouseLumpsumApportionslFormula("Percentage");
        Thread.sleep(2000);
        asd.enterMembersOfferedBonusUponExit("No");
        Thread.sleep(2000);
        asd.setAllowAutoProcessOfPayments("No");
        Thread.sleep(2000);
        asd.setRoundPaymentsTo("No rounding");
        Thread.sleep(2000);
        asd.setRoundTaxPaymentsTo("No rounding");
        Thread.sleep(2000);
        asd.setGridDisplayMode("Member Number");
        Thread.sleep(2000);
        asd.setMembersIdentifier("Member Number");
        Thread.sleep(2000);
        asd.clickSave();
        Thread.sleep(2000);
        driver.navigate().refresh();
    }
}
