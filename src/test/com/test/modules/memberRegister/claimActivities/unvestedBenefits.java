package com.test.modules.memberRegister.claimActivities;

import com.JKUat.base.BaseClass;
import com.JKUat.modules.memberModule.claimActivities.ClaimPayments;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class unvestedBenefits extends BaseClass{


    Screen screen = new Screen();
    Pattern memberReg = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\CaptureMemberRegister.PNG");
    Pattern checkBox = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\check box.PNG");
    Pattern certification = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\certification.PNG");
    Pattern yes = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\yes.PNG");
    Pattern claimsactivities = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\claims Activities.PNG");
    Pattern certify = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\certify.PNG");
    Pattern Authorize = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\Approve.PNG");
    Pattern ok = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\ok.PNG");
    Pattern posttoreserve = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\post.PNG");
    Pattern unvestedBenefits = new Pattern("C:\\Users\\rowanisky\\Pictures\\Camera Roll\\unvestedBenefits.PNG");


    @BeforeClass
    public void setUp() throws Exception {
       // init();

    }

    @Test(priority = 0)
    public void login() throws InterruptedException {

//        log.info("============starting Loging===========");
//        LoginPage lp = new LoginPage(driver);
//        lp.login("admin", "admin");
//        log.info("============Login Succesful===========");
    }

    @Test(priority = 1)
    public void doTest() throws Exception {
        ClaimPayments cp = new ClaimPayments(driver);
        log.info("Starting Batch Contributions");
        Thread.sleep(7500);
        screen.click(memberReg);
        Thread.sleep(8500);
        screen.click(claimsactivities);
        Thread.sleep(2500);
        screen.click(unvestedBenefits);
        Thread.sleep(2500);
        screen.click(checkBox);
        Thread.sleep(2500);
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
        screen.click(posttoreserve);
        Thread.sleep(1500);
        screen.click(yes);
        Thread.sleep(1500);
        screen.click(ok);
        Thread.sleep(1500);
        driver.navigate().refresh();

        }
}