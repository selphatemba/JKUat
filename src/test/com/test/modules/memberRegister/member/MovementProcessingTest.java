package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.MovementProcessing;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MovementProcessingTest extends BaseClass {
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
    @Test(priority = 0)
    public void startMovementProcessing()throws Exception{
        log.info("Started movement processing");
        MovementProcessing mp=new MovementProcessing(driver);
        Thread.sleep(3000);
        mp.clickOnMembers();
        Thread.sleep(3000);
        mp.clickOnSponsorRegister();
        Thread.sleep(3000);
        mp.enterSponsorName("JKUAT TESTING SPONSOR3");
        Thread.sleep(3000);
        mp.selectASponsor();
        Thread.sleep(3000);
        mp.clickOnViewMembers();
        Thread.sleep(3000);
        mp.selectAmember();
        Thread.sleep(3000);
        mp.clickMovement();
        Thread.sleep(3000);
        mp.clickOnMovementProcessing();
        Thread.sleep(3000);
        mp.selectAReadyMember();
        Thread.sleep(3000);
        mp.calculateBenefits();
        Thread.sleep(3000);
        mp.clickOnShowBenefitsCalc();
        Thread.sleep(3000);
        mp.clickSave();
        log.info("Completed movement processing");

    }
}
