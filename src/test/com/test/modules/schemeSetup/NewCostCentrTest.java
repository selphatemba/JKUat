package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.NewCostCentre;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewCostCentrTest extends BaseClass {
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
    public void createSceme() throws Exception {
        NewCostCentre cc=new NewCostCentre(driver);
        cc.clickSchemeSetup();
        Thread.sleep(3000);
        cc.clickScheme();
        Thread.sleep(2000);
        cc.clickOnCostCentres();
        Thread.sleep(2000);
        cc.clickOnNewCostCentre();
        cc.enterCode("C3");
        cc.enterName("");
        cc.enterDesc("");
        cc.enterSponsor("");
        cc.enterCre("");
        cc.clickSave();
    }
}
