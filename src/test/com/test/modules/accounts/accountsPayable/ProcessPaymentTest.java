package com.test.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.accounts.accountsPayable.ProcessPayment;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProcessPaymentTest extends BaseClass {


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
        ProcessPayment pp=new ProcessPayment(driver);
        pp.openAccountsModule();
        Thread.sleep(5000);
        pp.clickOnAccountsPayable();
        Thread.sleep(3000);
        pp.clickOnPayablesRegister();
        Thread.sleep(3000);
        pp.selectAPayable();
        Thread.sleep(3000);
        pp.clickOnPosting();
        Thread.sleep(3000);
        pp.clickOnPost();
        Thread.sleep(3000);
        pp.clickOnYes();
        Thread.sleep(3000);
        pp.clickOkBox();
        Thread.sleep(3000);
        Thread.sleep(3000);

    }
}
