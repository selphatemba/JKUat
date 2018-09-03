package com.test.modules.investments.otherSetups;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.otherSetups.NewExchangeRate;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewExchangeRateTest extends BaseClass {
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
    public void createAnewExchangeRate()throws Exception{
        NewExchangeRate ner=new NewExchangeRate(driver);
        log.info("================started creating a new Exchange Rate================");
        ner.openInvestmentModule();
        Thread.sleep(5000);
        ner.clickOtherSetups();
        Thread.sleep(3000);
        ner.clickForexRates();
        Thread.sleep(3000);
        ner.clickNewExchangeRates();
        Thread.sleep(3000);
        ner.enterTargetCurrency("USD");
        Thread.sleep(3000);
        ner.enterXchangeRate("100");
        Thread.sleep(3000);
        ner.setXchangeRate();
        Thread.sleep(3000);

    }
    @AfterTest
    public void  closeBrowser(){
        driver.quit();
    }
}
