package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.test.base.LoginPageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BatchMembersTest extends BaseClass {

//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//    @Test(priority = 0)
//    public void login()throws Exception {
//        ChangeUserPassword asd = new ChangeUserPassword(driver);
//        Thread.sleep(2000);
//        asd.enterloginUsername("user50");
//        Thread.sleep(1000);
//        asd.enterloginPasswd("S@lpha123");
//        Thread.sleep(1000);
//        asd.clickSaveLogin();
//        Thread.sleep(1000);
//    }


    @Test(priority = 0)
    public void doBatchMembersTest() throws Exception {
        Thread.sleep(1000);
        driver.findElement(By.id("ext-gen49")).click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Import From Templates"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Members")).click();
        Thread.sleep(2500);
        driver.findElement(By.name("batchSchedule")).sendKeys("F:\\Xi templates\\Members Register\\New Member.xls");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen160\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ext-gen169\"]")).click();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(2000);
    }
}
