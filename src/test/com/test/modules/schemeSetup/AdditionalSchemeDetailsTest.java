package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.schemeSetup.AdditionalSchemeDetails;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdditionalSchemeDetailsTest extends BaseClass {

    @BeforeClass
    public void setUp() throws Exception {
        init();

    }

    @Test(priority = 0)
    public void switchScheme()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(3000);
        asd.enterloginUsername("selly1");
        Thread.sleep(3000);
        asd.enterloginPasswd("S@lpha123");
        Thread.sleep(3000);
        asd.clickSaveLogin();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void updateadditionalSchemeDetails()throws Exception{
        AdditionalSchemeDetails asd=new AdditionalSchemeDetails(driver);
        Thread.sleep(3000);
        asd.clickMainMenu();
        Thread.sleep(3000);
        asd.clickSchemeSetup();
        Thread.sleep(3000);
        asd.clickOnScheme();
        Thread.sleep(3000);
        asd.clickOnAdditionalSchemeDetails();
        Thread.sleep(3000);
        asd.enterMemberClass("Yes");
        Thread.sleep(3000);
        asd.enterMultiCompany("Yes");
        Thread.sleep(3000);
        asd.enterPensionableServices("Years Plus Months In service");
        Thread.sleep(3000);
        asd.enterInterestRatesMode("Annual Interest");
        Thread.sleep(3000);
        asd.enterSchemeAdminMode("Member Level");
        Thread.sleep(3000);
        asd.enterContributionStatus("Contributory");
        Thread.sleep(3000);
        asd.enterInterestFormula("Compound Interest(Daily Compounding)");
        Thread.sleep(3000);
        asd.enterCurrentSchemeStatus("Open Scheme");
        Thread.sleep(3000);
        asd.enterIsSchemeActive("Yes");
        Thread.sleep(3000);
        asd.enterExcessiveAllocMode("Employee Priority");
        Thread.sleep(3000);
        asd.enterNotEquallToChequeAmt("Yes");
        Thread.sleep(3000);
        asd.postBatchTo("Member Accounts");
        Thread.sleep(3000);
        asd.enterDeficitTreatmentMode("Reserve Outflow");
        Thread.sleep(3000);
        asd.enterContributionsSalaryBased("Yes");
        Thread.sleep(3000);
        asd.hoewExcessContrAreDetermined("Individual Contributions");
        Thread.sleep(3000);
        asd.isItAdiffCsheme("No");
        Thread.sleep(3000);
        asd.setConvertContrUnitsWhenPosting("No");
        Thread.sleep(3000);
        asd.clickSave();
        Thread.sleep(3000);
    }
}
