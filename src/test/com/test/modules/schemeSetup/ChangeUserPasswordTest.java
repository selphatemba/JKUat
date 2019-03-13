package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChangeUserPasswordTest extends BaseClass {

    public static String  num;
    public static String  pass;

    @BeforeClass
    public void setUp() throws Exception {
        init();

    }
    @Test(priority = 0)
    public void login() throws Exception {
        log.info("=========logging in user ================");
        LoginPage loginPage = new LoginPage(driver);
        driver.findElement(By.name("user.username")).sendKeys("user65");
        pass=driver.findElement(By.name("user.username")).getAttribute("value");
        Thread.sleep(3000);
        driver.findElement(By.name("user.password")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@id=\"ext-gen32\"]")).click();
        log.info("=============successfully logged in=== +===");

    }
    @Test(priority = 1)
    public void addAdditionalSchemeDetails()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(3000);
        log.info("Started Changing Password");
        asd.clickMainMenu();
        Thread.sleep(2000);
        asd.enterCurrentPasswd("user65");
        Thread.sleep(2000);
        asd.enterNewPassword("S@lpha123");
        Thread.sleep(2000);
        asd.enterConfirmPswd("S@lpha123");
        Thread.sleep(2000);
        asd.clickSave();
        Thread.sleep(2000);
    }
        @Test(priority = 2)
        public void switchScheme()throws Exception{
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(3000);
        asd.enterloginUsername("user65");
        Thread.sleep(2000);
        asd.enterloginPasswd("S@lpha123");
        Thread.sleep(2000);
        asd.clickSaveLogin();
        Thread.sleep(2000);
        asd.clickMainMenu();
        Thread.sleep(2000);
        asd.clickloginButton();
        Thread.sleep(2000);
        asd.clickSwitchScheme();
        Thread.sleep(2000);
        asd.enterSchemeNAme("SCHEME SCHEMA2");
        Thread.sleep(2000);
        asd.selectcheme();
        Thread.sleep(2000);
        asd.clickSetAsWorkingScheme();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen157\"]")).click();
        Thread.sleep(6000);
        asd.clickOnOk();
        Thread.sleep(2000);
        asd.clickClose();
        Thread.sleep(2000);
        driver.navigate().refresh();
        log.info("Completed Changing Password");
    }
}
