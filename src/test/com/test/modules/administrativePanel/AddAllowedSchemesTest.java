package com.test.modules.administrativePanel;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.administrativePanel.AddAllowedSchemes;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddAllowedSchemesTest extends BaseClass {
//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//
//    @Test(priority = 0)
//    public void login() throws Exception {
//        log.info("=========logging in user ================");
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("admin", "admin");
//        log.info("=============successfully logged in===========");
//    }
    @Test(priority = 1)
    public void addAllowedSchemes()throws Exception{
        log.info("======Started adding allowed Schemes====");
        AddAllowedSchemes asc=new AddAllowedSchemes(driver);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen67\"]")).click();
        Thread.sleep(3000);
        asc.clickAdminPanel();
        Thread.sleep(3000);
        asc.clickExistingUsers();
        Thread.sleep(3000);
        asc.enterUserName("selly");
        Thread.sleep(3000);
        asc.selectAUser();
        Thread.sleep(3000);
        asc.clickOnDetails();
        Thread.sleep(3000);
        asc.clickAllowedSchemes();
        Thread.sleep(3000);
        asc.clickOnAddAllowedSchemes();
        Thread.sleep(3000);
        asc.enterShemeName("JKUAT TESTING SCHEME");
        Thread.sleep(3000);
        asc.selectAAscheme();
        Thread.sleep(3000);
        asc.clickOnAdd();
        Thread.sleep(3000);
        asc.clickOkBox();
        Thread.sleep(3000);
        asc.clickcloseWindow();
        Thread.sleep(3000);
//        asc.clickOnAllowedSponsors();
//        Thread.sleep(3000);
//        asc.selectsponsor();
//        Thread.sleep(3000);
        asc.clickOnSave();
        Thread.sleep(3000);

//        asc.clickok1();
//        Thread.sleep(3000);
//        asc.clickClose();
//        Thread.sleep(3000);
//        asc.clickLogout();

        log.info("====Completed adding allowed schemes====");
        driver.quit();

    }
}
