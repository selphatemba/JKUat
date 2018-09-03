package com.test.modules.investments.deposits;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.deposits.NewCashCallDeposit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewCashCallDepositTest extends BaseClass {

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
    public void createANewCashCallDeposit()throws Exception{
        NewCashCallDeposit nccd=new NewCashCallDeposit(driver);
        log.info("======Started Creating a new Cash call deposit============");
        nccd.openInvestmentModule();
        Thread.sleep(5000);
        nccd.clickOnDeposit();
        Thread.sleep(3000);
        nccd.clickOnViewList();
        Thread.sleep(3000);
        nccd.selectOptions();
        Thread.sleep(3000);
        nccd.clickOnNewCashCall();
        Thread.sleep(3000);
        nccd.enterInvestmentName("Selpha SavingsAccount");
        Thread.sleep(3000);
        nccd.enterIssuer("Safaricom");
        Thread.sleep(3000);
        nccd.enterInterestRate("15");
        Thread.sleep(3000);
        nccd.enterInterestStartDate("01/03/2019");
        Thread.sleep(3000);
        nccd.enterInterestType("Fixed");
        Thread.sleep(3000);
        nccd.enterPrinciple("1000000");
        Thread.sleep(3000);
        nccd.enterInterestFrequency("Monthly");
        Thread.sleep(3000);
        nccd.enterDaysInAYr("366");
        Thread.sleep(3000);
        nccd.enterLocality("Local");
        Thread.sleep(3000);
        nccd.enterCurrency("KENYA SHILLINGS");
        Thread.sleep(3000);
        nccd.enterFundManager("Genesis Kenya Investment Management Ltd");
        Thread.sleep(3000);
        nccd.clickSave();
        Thread.sleep(3000);
        log.info("============Finished making a new cash Call Deposit======================");

    }
   @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
