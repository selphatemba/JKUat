package com.test.modules.memberRegister.member;

import com.JKUat.base.BaseClass;
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
        Thread.sleep(3000);
        asd.enterloginUsername("admin");
        Thread.sleep(3000);
        asd.enterloginPasswd("admin");
        Thread.sleep(3000);
        asd.clickSaveLogin();
    }
    @Test(priority = 1)
    public void startMovementProcessing()throws Exception{
        log.info("Started movement processing");
        MovementProcessing mp=new MovementProcessing(driver);
        Thread.sleep(2000);
        driver.findElement(By.id("membLnk")).click();
        Thread.sleep(3000);
        mp.clickOnMembers();
        Thread.sleep(3000);
        mp.clickOnSponsorRegister();
        Thread.sleep(3000);
        mp.enterSponsorName("JKUAT SRBS");
        Thread.sleep(3000);
        mp.selectASponsor();
        Thread.sleep(3000);
        mp.clickOnViewMembers();
        Thread.sleep(3000);
        driver.findElement(By.name("mMemberNo")).sendKeys("1000022", Keys.ENTER);
        Thread.sleep(3000);
        mp.selectAmember();
        Thread.sleep(3000);
        mp.clickMovement();
        Thread.sleep(3000);
        mp.clickOnMovementProcessing();
        Thread.sleep(3000);
        driver.findElement(By.name("mMemberNo2")).sendKeys("1000022",Keys.ENTER);
        Thread.sleep(3000);
        mp.selectAReadyMember();
        Thread.sleep(3000);
        mp.calculateBenefits();
        Thread.sleep(3000);
        mp.clickOnShowBenefitsCalc();
        Thread.sleep(7000);
        mp.clickSave();
        Thread.sleep(2000);
        driver.navigate().refresh();
        log.info("Completed movement processing");

    }
    @Test(priority = 2)
    public void startClaimPayments()throws Exception{
        ClaimPayments cp=new ClaimPayments(driver);
        Thread.sleep(4000);
        cp.clickClaimActivities();
        Thread.sleep(4000);
        cp.clickOnClaimPayments();
        Thread.sleep(3000);
        cp.enterMemberNo("1000022");
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

        driver.quit();
    }
}
