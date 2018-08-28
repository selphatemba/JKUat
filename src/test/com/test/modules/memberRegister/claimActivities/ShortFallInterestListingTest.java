package com.test.modules.memberRegister.claimActivities;

import com.JKUat.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShortFallInterestListingTest extends BaseClass {

    Screen screen = new Screen();
    Pattern memberReg = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/CaptureMemberRegister.PNG");
    Pattern claimsactivities = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/claims Activities.PNG");
    Pattern checkBox = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/check box.PNG");
    Pattern close = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/close.PNG");
    Pattern certification = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/certification.PNG");
    Pattern yes = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/yes.PNG");
    Pattern certify = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/certify.PNG");
    Pattern Authorize = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/Approve.PNG");
    Pattern ok = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/ok.PNG");
    Pattern posttoclaims = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/toclaims.PNG");
    Pattern save = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/savepayment.PNG");


    @BeforeClass
    public void setUp() throws Exception {
      //  init();

    }

    @Test(priority = 0)
    public void login() throws InterruptedException {

//        log.info("============starting Login===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin", "admin");
//        log.info("============Login Succesful===========");
    }


    @Test(priority = 1)
    public void seeEndorsments() throws Exception {
        log.info("===========Started Endorsments Test===========");
        Thread.sleep(7000);
        screen.click(memberReg);
        Thread.sleep(7000);
        screen.click(claimsactivities);
        Thread.sleep(2500);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.linkText("Shortfall Interest"));
        action.moveToElement(we).build().perform();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Listing")).click();
        Thread.sleep(7500);
        driver.findElement(By.name("mMemberNo")).sendKeys("3330", Keys.ENTER);
        Thread.sleep(1500);
        screen.click(checkBox);
        Thread.sleep(1500);
        screen.click(certification);
        Thread.sleep(2000);
        screen.click(certify);
        Thread.sleep(2500);
        screen.click(yes);
        Thread.sleep(2500);
        screen.click(ok);
        Thread.sleep(1500);
        screen.click(certification);
        Thread.sleep(1500);
        screen.click(Authorize);
        Thread.sleep(2500);
        screen.click(yes);
        Thread.sleep(2500);
        screen.click(ok);
        Thread.sleep(1500);
        screen.click(posttoclaims);
        Thread.sleep(1500);
        screen.click(yes);
        Thread.sleep(2500);
        String AvailableBalance = driver.findElement(By.name("payment.balOfInterest")).getAttribute("value");
        System.out.println("Available Balance is :" + AvailableBalance);
        Thread.sleep(1500);
        String TaxAmount = driver.findElement(By.name("payment.taxOnBalOfInterest")).getAttribute("value");
        System.out.println("Tax Amount is :" + TaxAmount);
        Thread.sleep(1500);
        String AmountToPay = driver.findElement(By.name("payment.prefBalOfInterest")).getAttribute("value");
        System.out.println("Amount to pay is :" + AmountToPay);
        Thread.sleep(1500);
        screen.click(save);
        Thread.sleep(1500);
        screen.click(ok);
        Thread.sleep(1500);
        screen.click(close);
        Thread.sleep(1500);
        driver.navigate().refresh();












    }
    }
