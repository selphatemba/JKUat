package com.test.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.administrativePanel.ProfilePermission;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProfilePermissionTest extends BaseClass {

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
    public void createAProfilePermission()throws Exception{
       log.info("Started creating a new profile permission");
        ProfilePermission pp=new ProfilePermission(driver);
        pp.clickAdminPanel();
        Thread.sleep(3000);
        pp.clickProfilePermissions();
        Thread.sleep(3000);
       log.info("Finished creating a new profile permission");
    }
}
