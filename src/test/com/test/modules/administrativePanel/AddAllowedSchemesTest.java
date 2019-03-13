package com.test.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.administrativePanel.AddAllowedSchemes;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddAllowedSchemesTest extends BaseClass {
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
        AddAllowedSchemes as=new AddAllowedSchemes(driver);
        Thread.sleep(2000);
        as.clickOnAdminPanel();
        Thread.sleep(1000);
        as.clickOnExistingUsers();
        Thread.sleep(1000);
        as.enterUserName("admin");
        Thread.sleep(1000);
        as.selectUser();
        Thread.sleep(1000);
        as.clickOnDetails();
        Thread.sleep(1000);
        as.clickOnAllowedSchemes();
        Thread.sleep(1000);
        as.clickOnAddAllowedSchemes();
        Thread.sleep(1000);
        as.enterSchemeName("SCHEME SCHEMA1");
        Thread.sleep(1000);
        as.selectAscheme();
        Thread.sleep(1000);
        as.clickAdd();
        Thread.sleep(1000);
        driver.navigate().refresh();
    }
}
