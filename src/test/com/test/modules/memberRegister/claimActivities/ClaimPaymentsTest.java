package com.test.modules.memberRegister.claimActivities;

import com.JKUat.base.BaseClass;

import com.JKUat.modules.memberModule.claimActivities.ClaimPayments;


import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ClaimPaymentsTest extends BaseClass {


    Screen screen=new Screen();
    Pattern memberReg = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/CaptureMemberRegister.PNG");
    Pattern checkBox = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/check box.PNG");
    Pattern certification = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/certification.PNG");
    Pattern yes = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/yes.PNG");
    Pattern claimsactivities = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/claims Activities.PNG");
    Pattern certify = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/ertify.PNG");
    Pattern Authorize = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/uthorize.PNG");
    Pattern ok = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/ok.PNG");
    Pattern Processpayment = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/processpayment.PNG");



    @BeforeClass
    public void setUp() throws Exception {
      //  init();

    }
    @Test(priority = 0)
    public void login() throws InterruptedException {
//
//        log.info("============starting Loging===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin","admin");
//        log.info("============Login Succesful===========");
     }
    @Test(priority = 1)
    public void doTest()throws Exception {
        ClaimPayments cp  = new ClaimPayments(driver);
        log.info("Starting Batch Contributions");
        Thread.sleep(7500);
        screen.click(memberReg);
        Thread.sleep(8500);
        screen.click(claimsactivities);
        Thread.sleep(2500);
        cp.clickOnClaimPayments();
        Thread.sleep(2500);
        cp.enterMemberNo("126");
        Thread.sleep(1500);
        screen.click(checkBox);
        Thread.sleep(1500);
        screen.click(certification);
        Thread.sleep(1500);
        screen.click(certify);
        Thread.sleep(2500);
        screen.click(yes);
        Thread.sleep(5500);
        screen.click(ok);
        Thread.sleep(1500);
        screen.click(certification);
        Thread.sleep(1500);
        screen.click(Authorize);
        Thread.sleep(2500);
        screen.click(yes);
        Thread.sleep(5500);
        screen.click(ok);
        Thread.sleep(1500);
        screen.click(Processpayment);
        Thread.sleep(1500);
        screen.click(yes);
        Thread.sleep(1500);
        screen.click(ok);
        Thread.sleep(1500);
        driver.navigate().refresh();






    }
    }
