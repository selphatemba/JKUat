package com.test.modules.investments.equities;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.equities.SingleTransactionAcquisition;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SingleTransactionAcquisitionTest extends BaseClass {


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
    public void makeAcquisitionThroughSingleTransaction()throws Exception{
        SingleTransactionAcquisition sta=new SingleTransactionAcquisition(driver);
        log.info("===========Started Making Acquisition through a single transaction=======");
        sta.openInvestmentModule();
        Thread.sleep(5000);
        sta.clickOnEquities();
        Thread.sleep(5000);
        sta.clickOnCompanies();
        Thread.sleep(3000);
        sta.enterCompanyCode("17");
        Thread.sleep(3000);
        sta.selectAcompany();
        Thread.sleep(3000);
        sta.clickOnAcquisitions();
        Thread.sleep(3000);
        sta.selectSingleTransaction();
        Thread.sleep(3000);
        sta.enterLocality("Local");
        Thread.sleep(3000);
        sta.enterSettlementDate("08/20/2018");
        Thread.sleep(3000);
        sta.enterDealDate("04/20/2018");
        Thread.sleep(3000);
        sta.enterPricePerShare("120");
        Thread.sleep(3000);
        sta.enterNoOfSharesBought("5000");
        Thread.sleep(3000);
        sta.enterCurrency("KENYA SHILLINGS");
        Thread.sleep(3000);
        sta.enterFundManager("Genesis Kenya Investment Management Ltd");
        Thread.sleep(3000);
        sta.clickSave();
        Thread.sleep(3000);
        log.info("=============successfully acquired an equity==============");
        driver.quit();
    }
}
