package com.test.modules.investments.equities;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.equities.SingleValuation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SingleValuationTest extends BaseClass {


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
    public void doSingleValuation()throws Exception{
        SingleValuation sv=new SingleValuation(driver);
        log.info("===========Making a single Valuation=======");
        sv.openInvestmentModule();
        Thread.sleep(5000);
        sv.clickOnEquities();
        Thread.sleep(5000);
        sv.clickOnCompanies();
        Thread.sleep(3000);
        sv.searchACompany("BRITAM");
        Thread.sleep(3000);
        sv.selectCompany();
        Thread.sleep(3000);
        sv.selectValuation();
        Thread.sleep(3000);
        sv.selectSingleValuation();
        Thread.sleep(3000);
        sv.enterEquityPrice("100000000");
        Thread.sleep(3000);
        sv.clickSave();
        Thread.sleep(3000);
        log.info("===========A Single Valuation complete!!!=======");
        driver.quit();
    }
}
