package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.InitiateMovement;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InitiateMovementTest extends BaseClass {
    @BeforeClass
    public void setUp() throws Exception {
        init();

    }


    @Test(priority = 0)
    public void login()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(3000);
        asd.enterloginUsername("admin");
        Thread.sleep(3000);
        asd.enterloginPasswd("admin");
        Thread.sleep(3000);
        asd.clickSaveLogin();
    }
    @Test(priority = 1)
    public void initiateMovement() throws Exception {
        log.info("Started iniating a movement");
        InitiateMovement im=new InitiateMovement(driver);
        Thread.sleep(2000);
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(3000);
        im.clickOnMembers();
        Thread.sleep(3000);
        im.clickOnSponsorRegister();
        Thread.sleep(3000);
        im.enterSponsorName("JKUAT SRBS");
        Thread.sleep(3000);
        im.selectASponsor();
        Thread.sleep(3000);
        im.clickOnViewMembers();
        Thread.sleep(3000);
        driver.findElement(By.name("mMemberNo")).sendKeys("1000022", Keys.ENTER);
        Thread.sleep(3000);
        im.selectAmember();
        Thread.sleep(3000);
        im.clickMovement();
        Thread.sleep(3000);
        im.clickOninitiateMovement();
        Thread.sleep(3000);
        im.enterDateOfExit("02/25/2019");
        Thread.sleep(3000);
        im.dateOfCalculation("02/25/2019");
        Thread.sleep(3000);
        im.enterRemarks("Resignation");
        Thread.sleep(3000);
        im.enterCurrency("KENYA SHILLINGS");
        Thread.sleep(3000);
        im.enterReasonsForExit("Resignation");
        Thread.sleep(3000);
        im.clicksave();
        Thread.sleep(2000);
        //driver.navigate().refresh();
        driver.quit();
        log.info("completed iniating a movement");

    }
}
