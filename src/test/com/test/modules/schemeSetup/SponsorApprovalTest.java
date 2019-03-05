package com.test.modules.schemeSetup;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import com.JKUat.modules.schemeSetup.SponsorApproval;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SponsorApprovalTest extends BaseClass {


//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//    @Test(priority = 0)
//    public void switchScheme()throws Exception {
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
    public void approveASponsor()throws Exception {
        log.info("=======Started Creating a Sponsor========");
        SponsorApproval sa = new SponsorApproval(driver);
        Thread.sleep(2000);
//        sa.clickOnMainMenu();
//        Thread.sleep(1000);
//        sa.clickOnSchemeSetup();
//        Thread.sleep(1000);
        sa.clickOnScheme();
        Thread.sleep(1000);
        sa.hoverOverSponsor();
        Thread.sleep(1000);
        sa.clickSponsorApproval();
        Thread.sleep(1000);
        sa.enterSponsorName("SCHEME SCHEMA SPONSOR11");
        Thread.sleep(1000);
        sa.selectASponsor();
        Thread.sleep(1000);
        sa.clickApprove();
        Thread.sleep(2000);
        driver.navigate().refresh();

    }


    @Test(priority = 1)
    public void createUserClass()throws Exception {
        log.info("=======Started Creating a User ========");
        SponsorApproval sa = new SponsorApproval(driver);
        sa.clickOnScheme();
        Thread.sleep(3000);
        sa.clickMemberClasses();
        Thread.sleep(1000);
//        //enter sponsor name
//        driver.findElement(By.name("rrSponsorId")).sendKeys("SCHEME SCHEMA SPONSOR8", Keys.ENTER);
//        Thread.sleep(1000);
//        //select a sponsor
//        driver.findElement(By.xpath("//*[@id=\"ext-gen209-gp-sponsor-SCHEME SCHEMA SPONSOR8-bd\"]/div")).click();
        Thread.sleep(1000);
        sa.clickNewMemberClass();
        Thread.sleep(1000);
        sa.enterName("Teaching Staff");
        Thread.sleep(1000);
        sa.enterCode("0001");
        Thread.sleep(1000);
        sa.enterSponsor("SCHEME SCHEMA SPONSOR11");
        Thread.sleep(1000);
        sa.clickSave();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        //main Menu
        driver.findElement(By.id("ext-gen62")).click();
        Thread.sleep(3000);
        //member Register
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(1000);

    }


}
