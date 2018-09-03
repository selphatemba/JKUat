package com.test.modules.investments.deposits;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.deposits.CashCallDepositAccruedInterest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CashCallDepositAccruedInterestTest extends BaseClass {

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
    public void calculateCashCallDepositAccruedInterest()throws Exception{
        CashCallDepositAccruedInterest ccsai=new CashCallDepositAccruedInterest(driver);
        log.info("===========started calculating anew cash/call deposit accrued interest=======");
        ccsai.openInvestmentModule();
        Thread.sleep(5000);
        ccsai.clickOnDeposit();
        Thread.sleep(3000);
        ccsai.clickOnViewList();
        Thread.sleep(3000);
        ccsai.enterIssuer("CBA BANK");
        Thread.sleep(3000);
        ccsai.clickFilter();
        Thread.sleep(3000);
        ccsai.selectAnIssuer();
        Thread.sleep(3000);
        ccsai.clickAccruedInterest();
        Thread.sleep(3000);
        ccsai.selectCalculate();
        Thread.sleep(3000);
        ccsai.enterAsAt("09/03/2018");
        Thread.sleep(3000);
        ccsai.calculateAccruedInterest();
        log.info("===========Finished calculating anew cash/call deposit accrued interest=======");

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
