package com.test.modules.investments.equities;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.investments.equities.NewCompany;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewCompanyTest extends BaseClass {

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
    public void addAnewCompany()throws Exception{
        NewCompany nc=new NewCompany(driver);
        log.info("===========Creating a new Company=======");
        nc.openInvestmentModule();
        Thread.sleep(5000);
        nc.clickOnEquities();
        Thread.sleep(5000);
        nc.clickOnCompanies();
        Thread.sleep(3000);
        nc.createAnewCompany();
        Thread.sleep(3000);
        nc.captureCompanyName("Mainingi");
        Thread.sleep(3000);
        nc.captureISIN("67");
        Thread.sleep(3000);
        nc.captureSector("Mining");
        Thread.sleep(3000);
        nc.enterCategory("Listed Company");
        Thread.sleep(3000);
        nc.enterEquityType("Ordinary Equity");
        Thread.sleep(3000);
        nc.clickOnSave();
        log.info("finished Creating a new company");
        driver.quit();
    }
}
