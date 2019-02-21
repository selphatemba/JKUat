package com.test.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.accounts.accountsPayable.DirectPayments;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DirectPaymentsTest extends BaseClass {


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
    public void makeDirectPayment() throws Exception {
        DirectPayments dp=new DirectPayments(driver);
        log.info("==========started making a direct Payment============");
        dp.openAccountsModule();
        Thread.sleep(5000);
        dp.clickOnAccountsPayable();
        Thread.sleep(3000);
        dp.clickOnDirectPayments();
        Thread.sleep(3000);
        dp.clicknewdp();
        Thread.sleep(3000);
        dp.enterSingleDirectP();
        Thread.sleep(3000);
        dp.enterPaymentFor("Fees Payments");
        Thread.sleep(3000);
        dp.enterDate("09/07/2018");
        Thread.sleep(3000);
        dp.enterParticular("Payment for supply of air");
        Thread.sleep(3000);
        dp.enterRegisteredAmt("1000000");
        Thread.sleep(3000);
        dp.enterUnReg("200000");
        Thread.sleep(3000);
        dp.enterBankAcc("JKUAT SRBS ACCOUNT 1857");
        Thread.sleep(3000);
        dp.enterCreditor("Selpha sonko - ");
        Thread.sleep(3000);
        dp.enterPaymentMode("Electronic Funds Transfer");
        Thread.sleep(3000);
        dp.enterRefNo("C00043F");
        Thread.sleep(3000);
        dp.enterCurrency("KENYA SHILLINGS");
        Thread.sleep(3000);
        dp.clickAddPaymentLine();
        Thread.sleep(3000);
        dp.enterPaymentLineParticular("Payment For Supply of Air");
        Thread.sleep(3000);
        dp.enterExpenseAcc("Expenses->Miscellaneous Expenses->Miscellaneous Expenses - 500-55-080");
        Thread.sleep(3000);
        dp.enterAmount("1200000");
        Thread.sleep(3000);
        dp.isAmtIsInclusiveOfTax();
        Thread.sleep(3000);
        dp.clickAdd();
        Thread.sleep(3000);
        dp.clickSave();
        Thread.sleep(3000);
        log.info("==========completed making a direct Payment============");
    }
@AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
