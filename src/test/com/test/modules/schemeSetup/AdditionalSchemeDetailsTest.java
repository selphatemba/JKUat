package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.AdditionalSchemeDetails;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdditionalSchemeDetailsTest extends BaseClass {

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
    public void updateadditionalSchemeDetails()throws Exception{
        AdditionalSchemeDetails asd=new AdditionalSchemeDetails(driver);
        Thread.sleep(2000);
//        asd.clickMainMenu();
//        Thread.sleep(2000);
//        asd.clickSchemeSetup();
//        Thread.sleep(2000);
        asd.clickOnScheme();
        Thread.sleep(2000);
        asd.clickOnAdditionalSchemeDetails();
        Thread.sleep(2000);
        asd.enterMemberClass("Yes");
        Thread.sleep(2000);
        asd.enterMultiCompany("Yes");
        Thread.sleep(2000);
        asd.enterPensionableServices("Years Plus Months In service");
        Thread.sleep(2000);
        asd.enterInterestRatesMode("Annual Interest");
        Thread.sleep(2000);
        asd.enterSchemeAdminMode("Member Level");
        Thread.sleep(2000);
        asd.enterContributionStatus("Contributory");
        Thread.sleep(2000);
        asd.enterInterestFormula("Compound Interest(Daily Compounding)");
        Thread.sleep(2000);
        asd.enterCurrentSchemeStatus("Open Scheme");
        Thread.sleep(2000);
        asd.enterIsSchemeActive("Yes");
        Thread.sleep(2000);
        asd.enterExcessiveAllocMode("Employee Priority");
        Thread.sleep(2000);
        asd.enterNotEquallToChequeAmt("Yes");
        Thread.sleep(2000);
        asd.postBatchTo("Member Accounts");
        Thread.sleep(2000);
        asd.enterDeficitTreatmentMode("Reserve Outflow");
        Thread.sleep(2000);
        asd.enterContributionsSalaryBased("Yes");
        Thread.sleep(2000);
        asd.hoewExcessContrAreDetermined("Individual Contributions");
        Thread.sleep(2000);
        asd.isItAdiffCsheme("No");
        Thread.sleep(1000);
        asd.setConvertContrUnitsWhenPosting("No");
        Thread.sleep(1000);
        asd.clickSave();
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
}
