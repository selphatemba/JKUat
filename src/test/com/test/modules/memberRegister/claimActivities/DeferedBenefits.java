package com.test.modules.memberRegister.claimActivities;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.claimActivities.ClaimPayments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.test.base.JyperionListener.takeSnapShot;

public class DeferedBenefits extends BaseClass {

    Screen screen = new Screen();
    Pattern memberReg = new Pattern("C/home/selpha/IdeaProjects/JKUat/Pictures/CaptureMemberRegister.PNG");
    Pattern checkBox = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/ box.PNG");
    Pattern getbalances = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/getBalacnes.PNG");
    Pattern process = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/process.PNG");
    Pattern claimsactivities = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/claims Activities.PNG");
    Pattern preocessDeferedBenefits = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/processDefered.PNG");
    Pattern Deferedbenefits = new Pattern("/home/selpha/IdeaProjects/JKUat/Pictures/deferedBenefits.PNG");


    @BeforeClass
    public void setUp() throws Exception {
        //init();

    }

    @Test(priority = 0)
    public void login() throws InterruptedException {
//
//        log.info("============starting Loging===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin", "admin");
//        log.info("============Login Succesful===========");
    }

    @Test(priority = 1)
    public void doTest() throws Exception {
        ClaimPayments cp = new ClaimPayments(driver);
        log.info("Starting Batch Contributions");
        Thread.sleep(8500);
        screen.click(memberReg);
        Thread.sleep(10000);
        screen.click(claimsactivities);
        Thread.sleep(2500);
        screen.click(Deferedbenefits);
        Thread.sleep(2500);
        driver.findElement(By.name("mMemberNoD")).sendKeys("3475", Keys.ENTER);
        Thread.sleep(2500);
        screen.click(checkBox);
        Thread.sleep(1500);
        screen.click(preocessDeferedBenefits);
        Thread.sleep(2500);
        driver.findElement(By.linkText("Ill-Health")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"ext-comp-1710\"]")).sendKeys("Ill-Health",Keys.ENTER);
        Thread.sleep(2500);
        takeSnapShot(driver);
        Thread.sleep(2500);
        screen.click(getbalances);
        Thread.sleep(2500);
        takeSnapShot(driver);
        Thread.sleep(2500);
        screen.click(process);
        Thread.sleep(5000);
        driver.findElement(By.linkText("OK")).click();
        Thread.sleep(2500);
        driver.findElement(By.linkText("Close")).click();
        Thread.sleep(2500);












    }


}
