package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.JKUat.modules.schemeSetup.DatesAndInsuranceCover;
import com.JKUat.modules.schemeSetup.EndYearParameters;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EndYearParametersTest extends BaseClass {

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
        EndYearParameters eyp=new EndYearParameters(driver);
        Thread.sleep(3000);
//        eyp.clickMainMenu();
//        Thread.sleep(3000);
//        eyp.clickSchemeSetup();
//        Thread.sleep(2000);
        eyp.clickOnOtherSetup();
        Thread.sleep(1000);
        eyp.clickOnEndYearParameters();
        Thread.sleep(1000);
        eyp.enterBenCalcBeforeYrEnd("Use Provisional Rate of Interest");
        Thread.sleep(1000);
        eyp.enterPayBalOfRevenue("Yes");
        Thread.sleep(1000);
        eyp.enterShowExitsWithinTheYr("Yes");
        Thread.sleep(1000);
        eyp.enterApplyFinalRevenueDeclared("Yes");
        Thread.sleep(1000);
        eyp.enterWhoBearsTaxOnIncome("Scheme");
        Thread.sleep(1000);
        eyp.enterAutoCalculateAdminFeesOnEXit("Yes");
        Thread.sleep(1000);
        eyp.enterTreatTaxFromUnregAsExpense("Yes");
        Thread.sleep(1000);
        eyp.enterDiscardRevenueEarnedDuringExitMonth("Yes");
        Thread.sleep(1000);
        eyp.enterDoNotAllowBenefitsProcessing("03/12/1990");
        Thread.sleep(1000);
        eyp.clickAllowEditOfDefferedbenefits();
        Thread.sleep(1000);
        eyp.enterIncomeDistributionFrequency("Annually");
        Thread.sleep(1000);
        eyp.enterIncomeDistributionMode("Interest Rates");
        Thread.sleep(1000);
        eyp.setSelectTheReportingFrequency("Annually");
        Thread.sleep(1000);
        eyp.setTieIncomeAmountsToSponsors();
        Thread.sleep(1000);
        eyp.setTieIncomeAmountsToInvestmentOptions();
        Thread.sleep(1000);
        eyp.setTieNavsToInvestmentOptions();
        Thread.sleep(1000);
        eyp.setAllowMembersWithWithdrawnStatus();
        Thread.sleep(1000);
        eyp.setUseExitDateToDetermine();
        Thread.sleep(1000);
        eyp.setDateOfCalculation();
        Thread.sleep(1000);
        eyp.clickSave();
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
}
