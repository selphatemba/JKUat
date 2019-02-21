package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.test.base.LoginPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BatchMembersTest extends BaseClass {


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
    public void doBatchMembersTest() throws Exception {
        Thread.sleep(7000);
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(7000);
        driver.findElement(By.id("ext-gen49")).click();
        Thread.sleep(7000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Import From Templates"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Members")).click();
        Thread.sleep(2500);
        driver.findElement(By.name("batchSchedule")).sendKeys("/home/selpha/Xi templates/Members Register/members_update_that worked.xls");
        Thread.sleep(5000);
        driver.findElement(By.id("ext-gen166")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
