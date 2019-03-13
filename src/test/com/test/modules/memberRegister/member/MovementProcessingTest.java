package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
import com.JKUat.base.LoginPage;
import com.JKUat.modules.memberModule.claimActivities.ClaimPayments;
import com.JKUat.modules.memberModule.members.MovementProcessing;
import com.JKUat.modules.schemeSetup.ChangeUserPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MovementProcessingTest extends BaseClass {
    @BeforeClass
    public void setUp() throws Exception {
        init();

    }

    @Test(priority = 0)
    public void login()throws Exception {
        ChangeUserPassword asd = new ChangeUserPassword(driver);
        Thread.sleep(2000);
        asd.enterloginUsername("user60");
        Thread.sleep(1000);
        asd.enterloginPasswd("S@lpha123");
        Thread.sleep(1000);
        asd.clickSaveLogin();
        Thread.sleep(1000);
    }


    @Test(priority = 1)
    public void startMovementProcessing()throws Exception{
        log.info("Started movement processing");
        MovementProcessing mp=new MovementProcessing(driver);
        Thread.sleep(2000);
        mp.clickOnMembers();
        Thread.sleep(2000);
        mp.clickOnSponsorRegister();
        Thread.sleep(2000);
        mp.enterSponsorName("SCHEME SCHEMA SPONSOR11");
        Thread.sleep(2000);
        mp.selectASponsor();
        Thread.sleep(2000);
        mp.clickOnViewMembers();
        Thread.sleep(4000);
        driver.findElement(By.name("mMemberNo")).sendKeys("13181", Keys.ENTER);
        Thread.sleep(3000);
        mp.selectAmember();
        Thread.sleep(2000);
        mp.clickMovement();
        Thread.sleep(2000);
        mp.clickOnMovementProcessing();
        Thread.sleep(2000);
        driver.findElement(By.name("mMemberNo2")).sendKeys("13181",Keys.ENTER);
        Thread.sleep(2000);
        mp.selectAReadyMember();
        Thread.sleep(2000);
        mp.calculateBenefits();
        Thread.sleep(2000);
        mp.clickOnShowBenefitsCalc();
        Thread.sleep(7000);
        mp.clickSave();
        Thread.sleep(2000);
        mp.getPaymentDetails();
        Thread.sleep(3000);
        //driver.navigate().refresh();
        log.info("Completed movement processing");

    }
//   @Test(priority = 2)
    public void startClaimPayments()throws Exception{
        ClaimPayments cp=new ClaimPayments(driver);
        Thread.sleep(4000);
        cp.clickClaimActivities();
        Thread.sleep(4000);
        cp.clickOnClaimPayments();
        Thread.sleep(3000);
        cp.enterMemberNo("13181");
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

        Thread.sleep(3000);

    }
}
