package com.test.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.accounts.accountsPayable.PaymentProcessing;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PaymentProcessingTest extends BaseClass {


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
    public void processPayment()throws Exception{
        PaymentProcessing pp=new PaymentProcessing(driver);
        log.info("==============Started Processing Payment============");
        pp.openAccountsModule();
        Thread.sleep(5000);
        pp.clickOnAccountsPayable();
        Thread.sleep(3000);
        pp.clickOnPayablesRegister();
        Thread.sleep(3000);
        pp.searchCreditor("Mwenye Mapesa");
        Thread.sleep(3000);
        pp.clickFilter();
        Thread.sleep(3000);
        pp.selectAcreditor();
        Thread.sleep(3000);
        pp.clickProcessPayment();
        Thread.sleep(3000);

    }
}
