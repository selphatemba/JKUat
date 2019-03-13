package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.AdditionalSchemeDetails;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.JKUat.modules.schemeSetup.DatesAndInsuranceCover;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatesAndInsuranceCoverTest extends BaseClass {

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
    public void setDateAndInsuranceCover()throws Exception{
        DatesAndInsuranceCover dc=new DatesAndInsuranceCover(driver);
        Thread.sleep(3000);
//        dc.clickMainMenu();
//        Thread.sleep(3000);
//        dc.clickSchemeSetup();
//        Thread.sleep(3000);
        dc.clickOnScheme();
        Thread.sleep(3000);
        dc.clickOnDatesInsuranceCover();
        Thread.sleep(2000);
        dc.checkIfSchemeIsRegisteredWithRegBody("Yes");
        Thread.sleep(2000);
        dc.checkIfSchemePaysTax("Yes");
        Thread.sleep(2000);
        dc.checkIfTaxShouldBeAppliedOnClaims("Yes");
        Thread.sleep(2000);
        dc.shudWeGroupDisabilityBen("No");
        Thread.sleep(1000);
        dc.isLastExpenseProvided("No");
        Thread.sleep(1000);
        dc.isTrusteesLiabilityInsurance("No");
        Thread.sleep(1000);
        dc.doWeSeparateServicePeriod("No");
        Thread.sleep(1000);
        dc.islifeCoverProvided("No");
        Thread.sleep(1000);
        dc.clickSave();
        Thread.sleep(2000);
        driver.navigate().refresh();

    }
}
