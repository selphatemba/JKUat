package com.test.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.administrativePanel.NewProfile;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewProfileTest extends BaseClass {
    public static String profile;

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
    public void createANewProfile()throws Exception{

        log.info("Started Creating a new Profile");
        NewProfile np=new NewProfile(driver);
        np.clickAdminPanel();
        Thread.sleep(3000);
        np.clickOnProfiles();
        Thread.sleep(3000);
        np.clickOnNewProfile();
        Thread.sleep(3000);
        np.enterName("Vice Administrator");
        Thread.sleep(3000);
        np.enterDesc("Has most of Admin's priviledges");
        Thread.sleep(3000);
        np.enterFundAdministrator("JKUAT Fund Administrator");
        Thread.sleep(3000);
        profile=driver.findElement(By.name("profile.name")).getAttribute("value");
        np.clickSave();
        log.info("completed creating a new profile====="+profile);
    }
}
