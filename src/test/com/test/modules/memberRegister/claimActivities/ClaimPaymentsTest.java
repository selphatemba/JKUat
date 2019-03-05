package com.test.modules.memberRegister.claimActivities;

import com.JKUat.base.BaseClass;

import com.JKUat.modules.memberModule.claimActivities.ClaimPayments;


import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ClaimPaymentsTest extends BaseClass {

//    @BeforeClass
//    public void setUp() throws Exception {
//        init();
//
//    }
//
//
//    @Test(priority = 0)
//    public void login()throws Exception {
//        ChangeUserPassword asd = new ChangeUserPassword(driver);
//        Thread.sleep(3000);
//        asd.enterloginUsername("selly1");
//        Thread.sleep(3000);
//        asd.enterloginPasswd("S@lpha123");
//        Thread.sleep(3000);
//        asd.clickSaveLogin();
//    }
    @Test(priority = 1)
    public void startClaimPayments()throws Exception{
        ClaimPayments cp=new ClaimPayments(driver);
        Thread.sleep(4000);
        cp.clickClaimActivities();
        Thread.sleep(4000);
        cp.clickOnClaimPayments();
        Thread.sleep(3000);
        cp.enterMemberNo("00002");
        Thread.sleep(3000);
        cp.selectAmember();
        Thread.sleep(3000);
        //Certification/paymentsonly
        driver.findElement(By.xpath("//*[@id=\"ext-gen191\"]")).click();
        Thread.sleep(3000);
        //Certify
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1766\"]")).click();
        Thread.sleep(3000);
        //Yes
        driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]")).click();
        Thread.sleep(2000);
//        //ok
//        driver.findElement(By.xpath("//*[@id=\"ext-gen332\"]")).click();
//        Thread.sleep(2000);
        //Certification/paymentsonly
        driver.findElement(By.xpath("//*[@id=\"ext-gen191\"]")).click();
        Thread.sleep(3000);
        //Authorize
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1767\"]")).click();
        Thread.sleep(3000);
        //Yes
        driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]")).click();
        Thread.sleep(2000);
//        //ok
//        driver.findElement(By.xpath("//*[@id=\"ext-gen332\"]")).click();
//        Thread.sleep(2000);
        cp.clickOnProcessPayment();
        Thread.sleep(3000);
//        cp.clickOnPayment();
//        Thread.sleep(7000);
//        cp.clickYes();
//        Thread.sleep(3000);
        cp.getPaymentDetails();
        Thread.sleep(3000);

    }

    }
