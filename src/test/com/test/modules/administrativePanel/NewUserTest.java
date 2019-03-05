package com.test.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.administrativePanel.NewUser;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewUserTest extends BaseClass {

    public static String user;

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
    public void createANewUser()throws Exception{
        NewUser nu=new NewUser(driver);
        log.info("Started creating a new User ");
        Thread.sleep(3000);
        nu.clickAdminPanel();
        Thread.sleep(3000);
        nu.clickExistingUsers();
        Thread.sleep(3000);
        nu.clickNewUser();
        Thread.sleep(3000);
        nu.enterSurname("Father");
        Thread.sleep(1000);
        nu.enterOtherNames("Abraham");
        Thread.sleep(1000);
        nu.enterUserName("user61");
        Thread.sleep(1000);
        nu.enterProfile("System Administrators");
        Thread.sleep(1000);
        nu.enterIsAdmin("Yes");
        Thread.sleep(1000);
        nu.enterDefaultScheme("Member Register");
        Thread.sleep(2000);
        nu.clickSave();
        Thread.sleep(1000);
        nu.clickOkBox();
        Thread.sleep(1000);
        nu.clickAllowedSchemes();
        Thread.sleep(2000);
        nu.clickOnAddAllowedSchemes();
        Thread.sleep(2000);
        nu.enterShemeName("SCHEME SCHEMA");
        Thread.sleep(1000);
        nu.selectAAscheme();
        Thread.sleep(1000);
        nu.clickOnAdd();
        log.info("====Completed adding allowed schemes====");
        user=driver.findElement(By.name("user.username")).getAttribute("value");
        Thread.sleep(1000);
        log.info("Completed creating a new User====="+user);
        driver.quit();
        Thread.sleep(3000);
    }
}
