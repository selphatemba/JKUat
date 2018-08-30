package com.test.modules.investments.equities;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.equities.SingleBonus;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SingleBonusTest extends BaseClass {

    @BeforeClass
    public void setUp() throws Exception {
        init();
    }


    @Test(priority = 0)
    public void login()throws Exception {
        log.info("=========logging in user ================");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin");
        log.info("=============successfully logged in===========");
    }

    @Test(priority = 1)
    public void doSingleBonus()throws Exception{
        SingleBonus sb=new SingleBonus(driver);
        log.info("===========Started processing single Bonus=======");
        sb.openInvestmentModule();
        Thread.sleep(5000);
        sb.clickOnEquities();
        Thread.sleep(5000);
        sb.clickOnCompanies();
        Thread.sleep(3000);
        sb.searchACompany("BRITAM");
        Thread.sleep(3000);
        sb.selectCompany();
        Thread.sleep(3000);
        sb.clickOnBonus();
        Thread.sleep(3000);
        sb.selectSingleBonus();
        Thread.sleep(3000);
        sb.captureFundManager("Genesis Kenya Investment Management Ltd");
        Thread.sleep(3000);
        sb.enterbonusIssueDate("08/28/2018");
        Thread.sleep(3000);
        sb.enterBookClosureDate("08/31/2018");
        Thread.sleep(3000);
        sb.enterBonusCreditDate("08/28/2018");
        Thread.sleep(3000);
//        sb.enterSharesBeforeBonus("3000");
//        Thread.sleep(3000);
        sb.captureGetShares("500");
        Thread.sleep(3000);
        sb.captureForThisSharesHeld("3000");
        Thread.sleep(3000);
        sb.clickSave();
        Thread.sleep(3000);
        log.info("==================Bonus successfully processed============");

    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
