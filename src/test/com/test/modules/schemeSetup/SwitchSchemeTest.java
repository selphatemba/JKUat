package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.NewScheme;
import com.JKUat.modules.schemeSetup.SwitchScheme;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwitchSchemeTest extends BaseClass {

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
        SwitchScheme sc=new SwitchScheme(driver);
        Thread.sleep(2000);
        sc.clickOnStart();
        Thread.sleep(2000);
        sc.clickOnswitchScheme();
        Thread.sleep(2000);
        sc.enterSchemeName("CAMPUS16 SCHEME");
        Thread.sleep(2000);
        sc.selectAscheme();
        Thread.sleep(2000);
        sc.clickOnSetAsWorkingScheme();
        Thread.sleep(2000);
        sc.clickYes();
        Thread.sleep(2000);
        driver.quit();
    }
}
