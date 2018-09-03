package com.test.modules.investments.equities;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.equities.NewStockBroker;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewStockBrokerTest extends BaseClass {

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
   public void addAstockBroker() throws Exception{
        NewStockBroker nsb=new NewStockBroker(driver);
       log.info("===========started adding a new stock broker=======");
       nsb.openInvestmentModule();
       Thread.sleep(5000);
       nsb.clickOnEquities();
       Thread.sleep(5000);
       nsb.clickOnStockBroker();
        Thread.sleep(3000);
       nsb.clickOnNewStockBroker();
        Thread.sleep(3000);
       nsb.enterName("Stock Broker");
        Thread.sleep(3000);
       nsb.enterdescription("investment management Limited");
        Thread.sleep(3000);
       nsb.clickOnSave();
        log.info("===========Finished adding a new stock broker=======");
   }

   @AfterTest
   public void afterTest(){
        driver.quit();
   }
}
