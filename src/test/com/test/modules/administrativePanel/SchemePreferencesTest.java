package com.test.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.JKUat.modules.administrativePanel.SchemePreferences;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SchemePreferencesTest extends BaseClass {

    @BeforeClass
    public void setUp() throws Exception {
        init();

    }
    @Test(priority = 0)
    public void login() throws Exception {
        log.info("=========logging in user ================");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("user64", "S@lpha123");
        log.info("=============successfully logged in===========");

    }

    @Test(priority = 1)
    public void endYearParameters()throws Exception {
        SchemePreferences sp=new SchemePreferences(driver);
        Thread.sleep(3000);
        sp.clickMainMenu();
        Thread.sleep(3000);
        sp.clickSchemeSetup();
        Thread.sleep(2000);
        sp.clickOnSystemConfig();
        Thread.sleep(2000);
        sp.clickOnAddSystemPreferences();
        Thread.sleep(2000);
        sp.clickSave();
        Thread.sleep(2000);
    }
}
