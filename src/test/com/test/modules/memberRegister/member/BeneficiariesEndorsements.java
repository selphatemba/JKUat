package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeneficiariesEndorsements extends BaseClass {

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
    public void seeEndorsments() throws Exception {
        log.info("===========Started Endorsments Test===========");
        Thread.sleep(7000);
        WebElement memberReg=driver.findElement(By.id("membLnk"));
        memberReg.click();
        Thread.sleep(7000);
        WebElement member=driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]"));
        member.click();
        Thread.sleep(2500);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Endorsements"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Beneficiaries")).click();
        Thread.sleep(2500);
       // screen.click(checkBox);
        Thread.sleep(2500);
        //screen.click(approve);
        Thread.sleep(2500);
        //screen.click(selectedMembers);
        Thread.sleep(2500);
        //screen.click(OkBox);
        Thread.sleep(2500);
        driver.navigate().refresh();
    }
}