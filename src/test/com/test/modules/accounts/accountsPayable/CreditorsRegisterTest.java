package com.test.modules.accounts.accountsPayable;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.accounts.accountsPayable.CreditorsRegister;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreditorsRegisterTest extends BaseClass {

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
    public void registerAnewCreditor()throws Exception{
        CreditorsRegister cr=new CreditorsRegister(driver);
        log.info("===========Started registering a new creditor===========");
        cr.openAccountsModule();
        Thread.sleep(5000);
        cr.clickOnAccountsPayable();
        Thread.sleep(3000);
        cr.clickOnCreditorRegister();
       Thread.sleep(3000);
        cr.clickOnNewCreditor();
       Thread.sleep(3000);
        cr.enterName("Good Samaritan");
       Thread.sleep(3000);
        cr.enterCreditorType("SUPPLIERS");
       Thread.sleep(3000);
        cr.enterCellphone("0000000000");
       Thread.sleep(3000);
        cr.enterCountry("Kenya");
       Thread.sleep(3000);
        cr.clickSave();
       Thread.sleep(3000);
       log.info("===========Finished registering a new creditor===========");
    }


   // @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
