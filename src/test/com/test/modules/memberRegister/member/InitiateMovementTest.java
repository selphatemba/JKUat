package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.members.InitiateMovement;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InitiateMovementTest extends BaseClass {
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
    public void initiateMovement() throws Exception {
        log.info("Started iniating a movement");
        InitiateMovement im=new InitiateMovement(driver);
        Thread.sleep(3000);
        im.clickOnMembers();
        Thread.sleep(3000);
        im.clickOnSponsorRegister();
        Thread.sleep(3000);
        im.enterSponsorName("JKUAT TESTING SPONSOR3");
        Thread.sleep(3000);
        im.selectASponsor();
        Thread.sleep(3000);
        im.clickOnViewMembers();
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
        im.enterRemarks("rrrrrrrrrrr");
        Thread.sleep(3000);
        im.enterCurrency("KENYA SHILLINGS");
        Thread.sleep(3000);
        im.enterReasonsForExit("Resignation");
        Thread.sleep(3000);
        im.clicksave();
        log.info("completed iniating a movement");

    }
}
