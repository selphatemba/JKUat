package com.test.modules.memberRegister.contributions;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.contributions.PreviousBatchContributions;
import org.openqa.selenium.By;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PreviousBatchContributionsTest extends BaseClass {

    Screen screen = new Screen();
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
    Pattern Posted = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\postedunpoted.PNG");
    Pattern ok = new Pattern("C:\\Users\\rowanisky\\Pictures\\Captureok.PNG");
    Pattern posted = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\posted.PNG");
    Pattern unposted = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\unposted.PNG");
    Pattern contributions = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\contributions.PNG");
    Pattern unpost = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\unpost.PNG");
    Pattern post = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\postbatch.PNG");
    Pattern batchposting = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\batchposting.PNG");
    Pattern yes = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\yes.PNG");


    @BeforeClass
    public void setUp() throws Exception {
     //   init();

    }
    @Test(priority = 0)
    public void login() throws InterruptedException {

//        log.info("============starting Loging===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin","admin");
//        Thread.sleep(5000);
//        log.info("============Login Succesful===========");
    }
    @Test(priority = 1)
    public void doBatchContributions()throws Exception {
        PreviousBatchContributions bc = new PreviousBatchContributions(driver);
        log.info("Starting Batch Contributions");
        Thread.sleep(8000);
        screen.click(memberReg);
        Thread.sleep(7000);
        screen.click(contributions);
        Thread.sleep(7000);
        bc.clickOnPreviousBatch();
        Thread.sleep(3000);
        screen.click(Posted);
        Thread.sleep(2500);
        screen.click(unposted);
        Thread.sleep(5000);
        bc.selectBatch();
        Thread.sleep(1500);
        screen.click(batchposting);
        Thread.sleep(1500);
        screen.click(post);
        Thread.sleep(1500);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ext-gen311\"]")).getAttribute("value").toString());
        Thread.sleep(5000);
        screen.click(ok);
        Thread.sleep(1500);
        driver.navigate().refresh();
        Thread.sleep(1500);




    }

}
