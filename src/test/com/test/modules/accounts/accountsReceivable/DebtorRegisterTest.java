package com.test.modules.accounts.accountsReceivable;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.accounts.accountsReceivable.DebtorsRegister;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DebtorRegisterTest extends BaseClass {


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
    public void registerADebtor()throws Exception{
        DebtorsRegister dr=new DebtorsRegister(driver);
        Thread.sleep(5000);
        dr.openAccountsModule();
        Thread.sleep(3000);
        dr.clickAccountsReceivable();
        Thread.sleep(3000);
        dr.clickDebtorRegister();
        Thread.sleep(3000);
        dr.clickNewDebtor();
        Thread.sleep(3000);
        dr.enterName("Sponsor Ree");
        Thread.sleep(3000);
        dr.enterCode("0200");
        Thread.sleep(3000);
        dr.enterCreditorType("JKUAT SPONSOR");
        Thread.sleep(3000);
        dr.enterCellPhone("0706400000");
        Thread.sleep(3000);
        dr.enterCountry("Kenya");
        Thread.sleep(3000);
        dr.clickSave();
        Thread.sleep(3000);
    }
}
